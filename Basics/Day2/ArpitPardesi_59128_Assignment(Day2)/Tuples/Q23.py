#def last(n):
#    return n[m]

price = [(10, 20, 40), (40, 50, 60), (70, 80, 90)]
#m = lambda x : price[-1]
#print(m)
print(sorted(price, key=lambda x : x[-1]))

