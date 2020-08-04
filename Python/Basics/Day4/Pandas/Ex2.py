import pandas as pd

data = {"Name" : ['Arpit','Anushka'],
        "ID"   : [30,28],
        "Age"  : [22,22]}

df = pd.DataFrame(data)
print(df.head(1))
print("-----------------------")
print(df.tail(1)) 

