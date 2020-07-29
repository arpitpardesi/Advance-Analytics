import pandas as pd

data1 = pd.DataFrame({"Name" : ['A','B'],
        "Age"  : [22,22]},
        index = [30,28])

data2 =pd.DataFrame({"Name" : ['C','D'],
        "Age"  : [22,12]},
        index=[40,58])


cat = pd.concat([data1,data2])
print(cat)