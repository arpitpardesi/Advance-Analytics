from flask import Flask,render_template

app = Flask(__name__)

@app.route('/')
def open():
    return render_template('WebApp_Input.html')

app.run(port=2830)