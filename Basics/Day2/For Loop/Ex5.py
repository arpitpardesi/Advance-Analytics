"""
Find out and print the vowels in a given word
word = 'Milliways'
vowels = ['a', 'e', 'i', 'o', 'u']
"""
word = 'Milliways'
vowels = ['a', 'e', 'i', 'o', 'u']
result=[]

i=0
for i in word:
    if(i in vowels):
        if i not in result: 
            #result.append(i) 
            print(i)






