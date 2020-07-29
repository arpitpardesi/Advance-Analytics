import pandas as pd

data = {"Name" : ['Arpit','Anushka'],
        "ID"   : [30,28],
        "Age"  : [22,22]}
df = pd.DataFrame(data)
print(df)
print('--------------------------')
df.set_index("ID",inplace=True)
df.rename(columns={"Name":"Ename"},inplace=True) # does'nt works for coulmn name set as index
print(df)