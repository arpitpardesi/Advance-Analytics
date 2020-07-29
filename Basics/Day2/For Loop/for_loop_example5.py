"""
Write a python program which take an input number from user, say n=3
 Then, generate two lists a and b.
where, a holds the squares of integers 0 to n-1; i.e if n is equal to
3, then a =[0, 1, 4].
And list b holds the cubes of integers 0 to n-1, so if n is equal to
3, then the list b = [0, 1, 8].
"""
a=[]
b=[]

n = int(input("Enter: "))

for i in range(0,n):
    a.append(i**2)
    b.append(i**3)

print(a)
print(b)
