"""
Declare two sets set1 and set2 with some random values
and perform following operations:
    1) union of set1 and set2
    2) Intersection of set1 and set2
    3)Print all elements of union of set1 and set2
    using for loop.
    4)Print all elements of intersection of set1 and set2
    using for loop.
"""
set1 = {1,2,'Hello',4}
set2 = {'Hello', 'world', 4, 'all'}

set3 = set1.union(set2)
set4 = set1.intersection(set2)

for i in set3:
    print(i ,end=" ")
print("\n")
for i in set4:
    print(i, end=" ")













