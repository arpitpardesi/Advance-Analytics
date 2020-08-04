def last(n): 
    return n[m]   

a = [(1, 3), (1, 6), (6, 4), (2, 3), (2, 1)]
m = 1
print(sorted(a, key=last)) 