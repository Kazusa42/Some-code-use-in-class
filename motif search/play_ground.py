import numpy as np
import copy

from utils import *

PROTEIN_DATA = r'./proteins.csv'
# MOTIF_LEN = 10

protein_list, protein_type = get_proteins(PROTEIN_DATA)
# seq_num, seq_len = protein_list.shape[0], protein_list.shape[1]

# ceta_0 = build_PSSM(protein_list, protein_type)

# init starting point
# strat_idx = np.random.randint(0, seq_len - MOTIF_LEN)
# pi = np.array([strat_idx for _ in range(seq_num)]).reshape((seq_num, 1))
# print(pi)

# sub_protein_list = protein_list[pi:pi + MOTIF_LEN]
# print(sub_protein_list.shape)
# ceta = build_PSSM(sub_protein_list, protein_type)

# tmp_sublist = protein_list[: 1:1 + MOTIF_LEN]
# print(protein_list.shape)
# print(tmp_sublist)


# ceta_0 = build_background(protein_list, protein_type)
# print(ceta_0)

"""
protein_type = np.array(['A', 'G', 'C', 'T'])
motif_list = np.array([['C', 'G', 'G', 'G', 'T', 'A', 'A', 'G', 'T'],
                       ['A', 'A', 'G', 'G', 'T', 'A', 'T', 'G', 'C'],
                       ['C', 'A', 'G', 'G', 'T', 'G', 'A', 'G', 'G']])

pssm = build_PSSM(motif_list, protein_type)
"""

protein_list = np.array([['A', 'P', 'H', 'I', 'I', 'V', 'A', 'T', 'P', 'G'],
                         ['G', 'C', 'E', 'I', 'V', 'I', 'A', 'T', 'P', 'G'],
                         ['G', 'V', 'E', 'I', 'C', 'I', 'A', 'T', 'P', 'G'],
                         ['G', 'V', 'D', 'I', 'L', 'I', 'G', 'T', 'T', 'G'],
                         ['R', 'P', 'H', 'I', 'I', 'V', 'A', 'T', 'P', 'G'],
                         ['K', 'P', 'H', 'I', 'I', 'I', 'A', 'T', 'P', 'G'],
                         ['K', 'V', 'Q', 'L', 'I', 'I', 'A', 'T', 'P', 'G'],
                         ['R', 'P', 'D', 'I', 'V', 'I', 'A', 'T', 'P', 'G'],
                         ['A', 'P', 'H', 'I', 'I', 'V', 'G', 'T', 'P', 'G'],
                         ['A', 'P', 'H', 'I', 'I', 'V', 'G', 'T', 'P', 'G'],
                         ['G', 'C', 'H', 'V', 'V', 'I', 'A', 'T', 'P', 'G'],
                         ['N', 'Q', 'D', 'I', 'V', 'V', 'A', 'T', 'T', 'G']])

mask = np.where(protein_list == 'A', 1, 0)
print(mask)

x = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
print(np.sum(x))
