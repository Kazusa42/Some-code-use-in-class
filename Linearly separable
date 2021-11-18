import numpy as np

#  solving linear separable problem
#  pattern recognition


def is_linear_sep(vectors, b, delta, iter_num):
    temp_vec = np.dot(vectors.T, vectors)
    temp_vec = np.linalg.pinv(temp_vec)

    tmp_w = np.dot(temp_vec, vectors.T)
    w = np.dot(tmp_w, b)

    print('A# equals:')
    print(tmp_w)

    e = np.dot(vectors, w) - b
    for i in range(iter_num):
        print('Iter num: %d' % i)
        print(e)
        if np.all(e == 0):
            print('True. Weight vector is: ')
            print(w)
            break;
        elif np.all(e <= 0):
            print('False')
            break;
        else:
            update = e + np.fabs(e)
            w += delta * np.dot(temp_vec, update)
            b += delta * update
            e = np.dot(vectors, w) - b


if __name__ == '__main__':
    A = np.matrix([[1, 1, 1, 1], [1, 0, 0, 1], [1, 0, 1, 0],
                  [-1, 0, -1, -1], [-1, -1, 0, 0], [-1, -1, -1, 0]]).reshape(6, 4)
    init_b = np.matrix([1, 2, 3, 4, 5, 6]).reshape(6, 1)

    iteration = 50
    lr = 0.1
    is_linear_sep(A, init_b, lr, iteration)
