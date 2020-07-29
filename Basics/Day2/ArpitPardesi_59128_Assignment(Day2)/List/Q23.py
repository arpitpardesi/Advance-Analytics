import itertools
a = [[2,4,3],[1,5,6], [9], [7,9,0]]
b = list(itertools.chain(*a))
print(b)