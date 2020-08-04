from collections import Counter
a = {'a':1,'b':2}
b = {'c':3,'d':4}
c = Counter(a) + Counter(b)
print(c)