"""
Using keys and indexing, print the 'hello' from the following dictionary:
d4 = {'k1':[1,2,{'k2':['this is tricky',{'tough':[1,2,['hello']]}]}]}

"""
d4 = {'k1':[1,2,{'k2':['this is tricky',{'tough':[1,2,['hello']]}]}]}


print(d4['k1'][2]['k2'][1]["tough"][2][0])






