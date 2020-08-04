a = {1:'a',2:'b',3:'a'}
d = {}

for k,v in a.items():
    if v not in d.values():
        d[k] = v

print(d)