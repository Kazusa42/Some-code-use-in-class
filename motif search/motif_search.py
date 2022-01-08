from utils import *

import numpy as np

MOTIF_LEN = 10
PROTEIN_DATA = r'./proteins.csv'

if __name__ == '__main__':
    protein_list, protein_type = get_proteins(PROTEIN_DATA)
    seq_num, seq_len = protein_list.shape[0], protein_list.shape[1]

    # init starting point
    strat_idx = np.random.randint(0, seq_len - MOTIF_LEN)
    pi = np.array([strat_idx for _ in range(seq_num)]).reshape((seq_num, 1))

    sub_protein_list = protein_list[:, strat_idx:strat_idx + MOTIF_LEN]
    pssm = build_PSSM(sub_protein_list, protein_type)
    # last_ceta = ceta.copy()

    for cnt in range(400):
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
        # print(pi[2][0])
        for i in range(sub_protein_list.shape[0]):
            sub_protein_list[i] = protein_list[i, pi[i][0]:pi[i][0] + MOTIF_LEN]
        # print(sub_protein_list.shape)
        pssm = build_PSSM(sub_protein_list, protein_type)

    print(pi)
    for key in pssm.keys():
        print(pssm[key])




