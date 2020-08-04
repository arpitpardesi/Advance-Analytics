import numpy as np

a = np.array([1,2,3,4,5])
print(a.itemsize)
print(a.dtype)
print(a.size)
print("-----------------------")
a2 = np.array([(1,2,3),(4,5,6),(7,8,9)])
print(a2.itemsize)
print(a2.dtype)
print(a2.size)