a = "Find the list of words that are longer than n from a given list of words"
b = []
n = 3
for i in a.split(" "):
    if(len(i)> n):
        b.append(i)
print(b)