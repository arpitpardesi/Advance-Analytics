a=[1,2,3,4,5]
b=[1,2,3,4,5,6,7,8,9]

diff1 = list(set(a) - set(b))
diff2= list(set(b) - set(a))
total = diff1 + diff2 
print(total)