from flask import Flask,render_template, request

app = Flask(__name__)

@app.route('/')
def open():
    return render_template('WebApp_Input.html')

@app.route('/Hello')
def handle_req():
    name = request.args.get('userName')
    com = request.args.get('userComp')
    
    return render_template("WebApp_Result.html", username=name, company=com)

app.run(port=2830)