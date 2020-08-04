# data munging

import pandas as pd

t = pd.read_csv("test.csv")

t.to_html("test.html")
t.to_json("test.json")