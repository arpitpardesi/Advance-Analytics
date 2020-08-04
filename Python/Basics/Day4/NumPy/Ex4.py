# Reshaping of numpy

import numpy as np

a1 = np.array([(1,2),(3,4),(5,6),(7,8)])
print(a1.reshape(2,4))
print("-------------------------------------------")
a2 = np.array([(1,2,3),(3,4,5)])
print(a2.reshape(3,2))
