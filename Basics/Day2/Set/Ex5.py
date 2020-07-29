a = {"a","b","c","d","e","f","g"}

a.add("h")
a.update("i","j","k")

a.remove("i")
a.discard("c")

for i in a:
    print(i,end= " ")