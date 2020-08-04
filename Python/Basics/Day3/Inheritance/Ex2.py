class Library:
    def __init__(self, name):
        self.name = name

class Book(Library):
    def __init__(self, name):
        super().__init__(name)
        self.price=100

x = Book("abs")
print(x.name,x.price)