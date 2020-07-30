from flask import Flask,render_template,request

app = Flask(__name__)

@app.route('/')
def open():
    return render_template("WebApp_Input.html")

@app.route('/Hello')
def handle():
    n = request.args.get('userName')
    c = request.args.get('userComp')
    y = request.args.get('yoj')
    return render_template("WebApp_Result.html",username = n,company = c,year = y)

app.run(port=2830)