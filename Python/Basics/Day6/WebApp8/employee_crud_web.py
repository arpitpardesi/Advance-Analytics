from flask import Flask, render_template, request
from mysql.connector import connect

app = Flask(__name__)


@app.route('/')
def home_page():
    return render_template('home.html')


@app.route('/add_employee_form')
def openEmployee():
    return render_template("add_employee_form.html")


@app.route("/search_all_employees")
def toSearch():
    return render_template('search_employee_form.html')


@app.route('/searchEmployee', methods=["POST"])
def search():
    con = get_connection()
    name = request.form['name']
    sql = """select * from employee where emp_name like '{0}%' """.format(name)
    cursor = con.cursor(sql)
    cursor.execute(sql)
    sea = cursor.fetchall()
    return render_template('view_all_employees.html', list=sea)


@app.route('/add_employee')
def addEmployee():
    id = int(request.args.get("id"))
    ename = request.args.get("name")
    age = request.args.get('age')
    des = request.args.get("designation")
    addToDb(id, ename, age, des)
    return render_template("view_all_employees.html", list=getAll.all)


@app.route('/get_all_employees')
def getAll():
    con = get_connection()
    sql = """select * from employee"""
    cursor = con.cursor(sql)
    cursor.execute(sql)
    getAll.all = cursor.fetchall()
    return render_template('view_all_employees.html', list=getAll.all)


def addToDb(a, b, c, d):
    con = get_connection()
    sql = """insert into employee values ("%d","%s",%s,"%s")""" % (a, b, c, d)
    cursor = con.cursor()
    cursor.execute(sql)
    con.commit()
    return getAll()


@app.route('/toUpdate')
def toUpdate():
    toUpdate.id = int(request.args.get("id"))
    ename = request.args.get("name")
    age = request.args.get('age')
    des = request.args.get("desig")
    return render_template('update_employee_form.html', id=toUpdate.id, name=ename, age=age, desig=des)


@app.route('/updateEmployee')
def updateEmployee():
    con = get_connection()
    id = request.args.get('id')
    name = request.args.get('name')
    age = request.args.get('age')
    desig = request.args.get('designation')
    sql = """UPDATE employee SET emp_id = "%s", emp_name = "%s",emp_age = "%s", emp_desig="%s" WHERE emp_id = "%s" """ % (
        id, name, age, desig, toUpdate.id)
    cursor = con.cursor(sql)
    cursor.execute(sql)
    con.commit()
    return getAll()


@app.route("/delete")
def toDelete():
    con = get_connection()
    i = request.args.get('id')
    sql = """delete from employee where emp_id="%s" """ % (i)
    cursor = con.cursor(sql)
    cursor.execute(sql)
    con.commit()
    return getAll()


def get_connection():
    db_details = {'host': 'localhost',
                  'user': 'root',
                  'password': 'admin',
                  'database': 'analytics_batch'}

    con = connect(**db_details)
    return con


app.run(debug=True, port=3345)
