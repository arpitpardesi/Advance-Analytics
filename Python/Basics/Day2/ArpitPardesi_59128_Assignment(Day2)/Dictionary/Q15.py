d = {1: 10, 2: 20, 3: 30, 4: 40, 5: 50, 6: 60}
# Lambda
key_max = max(d.keys(), key=(lambda k: d[k]))
key_min = min(d.keys(), key=(lambda k: d[k]))

print('Maximum Value: ',d[key_max])
print('Minimum Value: ',d[key_min])