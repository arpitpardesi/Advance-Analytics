from sqlite3 import connect

db_name = 'employee_details.sql'
con = connect(db_name)
sql_query = """CREATE TABLE 'employee' (
  'ID' varchar(100) DEFAULT NULL,
  'NAME' varchar(100) DEFAULT NULL,
  'DESIGNATION' varchar(100) DEFAULT NULL
)"""

con.execute(sql_query)

con.commit()
con.close()



