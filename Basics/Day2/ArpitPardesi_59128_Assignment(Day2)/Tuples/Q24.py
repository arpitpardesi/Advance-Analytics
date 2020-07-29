l = [10,20,30,(10,20),40]
c = 0
for n in l:
    if isinstance(n, tuple):
        break
    c += 1
print(c)