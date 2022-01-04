import numpy as np
import torch
import math
import matplotlib.pyplot as plt

x1 = torch.tensor([0, 1, 1]).reshape(3, 1)
x2 = torch.tensor([1, 0, 1]).reshape(3, 1)
x3 = torch.tensor([1, 1, 0]).reshape(3, 1)
x4 = torch.tensor([1, 0, 0]).reshape(3, 1)
x5 = torch.tensor([0, 1, 0]).reshape(3, 1)
x6 = torch.tensor([0, 0, 1]).reshape(3, 1)

A = torch.tensor([[-1, -1, 1], [0, 1, -1], [1, 0, 1]]).reshape(3, 3)
# print(A)
pattern = [x1, x2, x3, x4, x5, x6]
# m = torch.tensor([0.5, 0.5, 0.5]).resize(3, 1)

# print(torch.multiply(x1, x1.T))

c = torch.zeros((3, 3))
for p in pattern:
    print(torch.multiply(A, p))

c = c / 6
I = torch.eye(3)
I = I / 12
# print(torch.det(I - c))
# print(c)
# c1, c2 = torch.linalg.eig(c)
# print(c1)
# print(c2)
