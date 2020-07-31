from flask import Flask, render_template, request
from sqlite3 import connect

app = Flask(__name__)

@app.route('/')
def home_page():
    return render_template('home.html')


app.run(debug=True, port=5008)