from flask import Flask

x = Flask(__name__)

#decorator "/" - default request 
# bridge between py and html
@x.route('/')

# input from user through console
def open():
    name = input("Name: ")
    return "Hello!!! "+name

#For port number
x.run(port=1200)