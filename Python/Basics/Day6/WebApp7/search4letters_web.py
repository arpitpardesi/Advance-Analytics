# python code for accepting data from html templates
# and sending processed data for display

from flask import Flask, render_template, request
from mysql.connector import connect

app = Flask(__name__)


@app.route("/")
def open():
    return render_template('input.html')


@app.route('/search', methods=['post'])
def handle():
    p = request.form["phrase"]
    l = request.form["letters"]
    r = set(p).intersection(list(l))
    add_search(p, l, r)
    return render_template('result.html', phrase=p, letter=l, result=r)


@app.route('/viewlog')
def get_all():
    con = get_connection()
    sql = """select * from records"""
    cursor = con.cursor()
    cursor.execute(sql)
    x = cursor.fetchall()
    return render_template('view_all.html', search_list=x)


def add_search(phrase, letter, result):
    con = get_connection()
    sql = """insert into records values ("%s", "%s", "%s") """ % (phrase, letter, result)
    cursor = con.cursor()
    cursor.execute(sql)
    con.commit()

def get_connection():
    db_details ={'host' : '127.0.0.1',
                 'user' : 'root',
                 'password': 'admin',
                 'database' : 'analytics_batch'}

    con = connect(**db_details)
    return con


app.run(port=2830)
