import operator
d = {1: 2, 3: 4, 4: 3, 2: 1, 0: 0}
print(d)
sorted_d = dict(sorted(d.items(), key=operator.itemgetter(1)))
print('Ascending: ',sorted_d)