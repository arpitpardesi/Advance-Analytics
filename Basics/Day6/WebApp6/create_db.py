from sqlite3 import connect

db_name = 'arpit_db.sql'
con = connect(db_name)
sql_query = """CREATE TABLE 'records' (
  'phrase' varchar(100) DEFAULT NULL,
  'letters' varchar(100) DEFAULT NULL,
  'results' varchar(100) DEFAULT NULL
)"""

cursor = con.cursor()
cursor.execute(sql_query)

con.commit()
con.close()



