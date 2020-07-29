from flask import Flask

x = Flask(__name__)

@x.route('/')
def open():
    name = input("Name: ")
    return "Hello!!! "+name

#For port number
x.run(port=1200)