# python code for accepting data from html templates
# and sending processed data for display

from flask import Flask, render_template, request

app = Flask(__name__)

@app.route("/")
def open():
    return render_template('input.html')

@app.route('/search', methods = ['post'])
def handle():
    p = request.form["phrase"]
    l = request.form["letters"]
    r = set(p).intersection(list(l))
    return render_template('result.html', phrase = p, letter = l, result = r)


app.run(port=2830)