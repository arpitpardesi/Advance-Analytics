d = {1: 10, 2: 20, 3: 30, 4: 40, 5: 50, 6: 60}
s=1
for i in d:
   s = s * d.get(i)
print(s)
