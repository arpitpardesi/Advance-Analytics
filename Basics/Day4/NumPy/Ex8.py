"""
Axis in numpy
sum of
axis = 1 : row
axis = 0 : coulmn
"""
import numpy as np
a1 = np.array([(1,2,3,4),(5,6,7,8),(9,10,11,12)])

print(a1.sum(axis=0)) #Column
print(a1.sum(axis=1)) #Row