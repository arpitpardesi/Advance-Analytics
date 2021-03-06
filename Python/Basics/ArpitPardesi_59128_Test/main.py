from flask import Flask, render_template, request
from mysql.connector import connect

app = Flask(__name__)


@app.route('/')
def home_page():
    return render_template('home.html')


@app.route('/get_all_trains')
def getAll():
    con = get_connection()
    sql = """select * from train"""
    cursor = con.cursor(sql)
    cursor.execute(sql)
    all = cursor.fetchall()
    return render_template("view_all_trains.html", list=all)


@app.route('/toSearchId')
def toSearchId():
    return render_template('search_train_on_id_form.html')


@app.route('/toSearchSS')
def toSearchSS():
    return render_template('search_train_on_starting_station_form.html')


@app.route('/toSearchES')
def toSearchES():
    return render_template('search_train_on_ending_station_form.html')


@app.route('/search_train_ID', methods=["POST"])
def searchId():
    con = get_connection()
    id = request.form['id']
    sql = """select * from train where train_id = '%s' """ %(id)
    cursor = con.cursor(sql)
    cursor.execute(sql)
    all = cursor.fetchall()
    return render_template("view_all_trains.html", list=all)

@app.route('/search_train_SS', methods=["POST"])
def searchSs():
    con = get_connection()
    name = request.form['startingStation']
    sql = """select * from train where starting_station ='%s' """ %(name)
    cursor = con.cursor(sql)
    cursor.execute(sql)
    all = cursor.fetchall()
    return render_template("view_all_trains.html", list=all)


@app.route('/search_train_ES', methods=["POST"])
def searchEs():
    con = get_connection()
    name = request.form['endingStation']
    sql = """select * from train where ending_station = '%s' """ %(name)
    cursor = con.cursor(sql)
    cursor.execute(sql)
    all = cursor.fetchall()
    return render_template("view_all_trains.html", list=all)


def get_connection():
    db_details = {'host': 'localhost',
                  'user': 'root',
                  'password': 'admin',
                  'database': 'analytics_batch'}
    con = connect(**db_details)
    return con


app.run(debug=True, port=3503)
