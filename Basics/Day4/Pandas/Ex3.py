import pandas as pd

data1 = pd.DataFrame({"Name" : ['ABC','DEF'],
                      "Designation": ["Trainee",'Trainee']},
                      index = [59128,59100])

data2 = pd.DataFrame({"Age"   : [22,25],
                      "Salary": [200000,400000]},
                      index = [59130,59100])

df = data1.join(data2)
print(df)
df2 = data2.join(data1)
print(df2)

