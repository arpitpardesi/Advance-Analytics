# Slicing of numpy

import numpy as np

a1 = np.array([(1,2,3,4),(5,6,7,8),(9,10,11,12)])
print(a1)
print("---------")
print(a1[0:3])
a1[:,]
#print(a1[0:1,1],a1[1:2,1],a1[-1:,1],a1[1:2,2])