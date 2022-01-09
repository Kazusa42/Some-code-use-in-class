from utils import *

import numpy as np
import copy

MOTIF_LEN = 10
PROTEIN_DATA = r'./proteins.csv'
BREAK_THRESH = 1e-10

if __name__ == '__main__':
    protein_list, protein_type = get_proteins(PROTEIN_DATA)
    seq_num, seq_len = protein_list.shape[0], protein_list.shape[1]

    # init starting point
    start_idx = np.random.randint(0, seq_len - MOTIF_LEN)
    # start_idx = 42
    print(start_idx)
    pi = np.array([start_idx for _ in range(seq_num)]).reshape((seq_num, 1))

    sub_protein_list = protein_list[:, start_idx:start_idx + MOTIF_LEN]
    pssm = build_PSSM(sub_protein_list, protein_type)
    # print(pssm)
    last_pssm = copy.deepcopy(pssm)

    for cnt in range(200):
        # print(cnt)
        # scan proteins and update ceta
        score_matrix = np.zeros((seq_num, seq_len - MOTIF_LEN))
        for pos in range(seq_len - MOTIF_LEN):
            tmp_sublist = protein_list[:, pos:pos + MOTIF_LEN]
            # print(tmp_sublist.shape)
            for idx1 in range(seq_num):
                score1 = 0
                curr_seq = tmp_sublist[idx1]  # current protein sequence
                for idx2 in range(MOTIF_LEN):
                    curr_c = curr_seq[idx2]  # current char in this protein
                    score1 += pssm[curr_c][idx2]
                score_matrix[idx1][pos] = score1

        pi = np.argmax(score_matrix, axis=1).reshape((200, 1))

        # update pssm
        for pos in range(MOTIF_LEN):
            # possibale protein type occur in this pos
            poss = protein_list[:, pos:seq_len - MOTIF_LEN + pos]
            # print(poss)
            for key in pssm.keys():  # key: current protein type
                mask = np.where(poss == key, 1, 0)
                pssm[key][pos] = round(np.sum(mask * score_matrix) / np.sum(score_matrix), 2)

    print_result(pssm, pi)
