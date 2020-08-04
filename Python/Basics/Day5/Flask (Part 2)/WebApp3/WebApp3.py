from flask import Flask, render_template, request
import datetime

app = Flask(__name__)


@app.route('/')
def open():
    return render_template("WebApp_Input.html")

@app.route('/Hello')
def handle():
    time = datetime.datetime.now()
    n = request.args.get('userName')
    c = request.args.get('userComp')
    a = int(request.args.get('age'))
    y = int(request.args.get('joining'))
    exp = time.year - y
    yearB = time.year - a

    return render_template("WebApp_Result.html", username=n, company=c, year=y, yearExpe=exp, age=a, yearBirth=yearB)


app.run(port=2830)
