# Step-1: opening the file
courses = open("files.csv",'r')


# Step-2: Processing
for i in courses:
    print(i, end="")

# Step-3: Closing the file
courses.close()


