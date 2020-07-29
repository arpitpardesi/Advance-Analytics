# Step-1: opening the file
courses = open("files.csv",'a')


# Step-2: Processing
print("Java", file=courses)
print("Python", file=courses)
print("R", file=courses)

# Step-3: Closing the file
courses.close()


