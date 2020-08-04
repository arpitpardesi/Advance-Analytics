a = ['abc','aba','abca']
res=0
for i in a:
    if(len(i)>1 and i[0] == i[-1]):
       res=res+1
print(res)