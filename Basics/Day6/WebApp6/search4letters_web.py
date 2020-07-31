# python code for accepting data from html templates
# and sending processed data for display

from flask import Flask, render_template, request
from _sqlite3 import connect

app = Flask(__name__)

@app.route("/")
def open():
    return render_template('input.html')

@app.route('/search', methods = ['post'])
def handle():
    p = request.form["phrase"]
    l = request.form["letters"]
    r = set(p).intersection(list(l))
    add_search(p, l, r)
    return render_template('result.html', phrase = p, letter = l, result = r)

@app.route('/viewlog')
def get_all():
    con = get_sqlite_connection()
    sql = """select * from records"""
    cursor = con.cursor()
    cursor.execute(sql)
    a = cursor.fetchall()
    return render_template('view_all.html', search_list = a)

def add_search(phrase,letter,result):
    con = get_sqlite_connection()
    sql = """insert into records values ("%s", "%s", "%s") """ %(phrase,letter,result)
    cursor = con.cursor()
    cursor.execute(sql)
    con.commit()

def get_sqlite_connection():
    con = connect('arpit_db.sql')
    return con

app.run(port=2830)