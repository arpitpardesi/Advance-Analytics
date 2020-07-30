from flask import Flask, render_template, request
import datetime

app = Flask(__name__)


@app.route('/')
def open():
    return render_template("WebApp_Input.html")

@app.route('/Hello')
def handle():
    n = request.args.get('userName')
    c = request.args.get('userComp')
    y = int(request.args.get('joining'))
    time = datetime.datetime.now()
    exp = time.year - y

    return render_template("WebApp_Result.html", username=n, company=c, year=y, yearExpe=exp)


app.run(port=2830)
