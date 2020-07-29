class Employeee:
    def __init__(self,name,age,desig,salary,lang):
        self.name=name
        self.age=age
        self.desig=desig
        self.salary=salary
        self.lang=lang

e1 = Employeee("ABC", 22, "Trainee", 50000,["hindi","english"])
e2 = Employeee("DEF", 22, "Tester", 5000,["hindi","english"])
print("Name: {0} Age: {1} Desig: {2} Salary: {3} Lang: {4}".format(e1.name,e1.age,e1.desig,e1.salary,e1.lang))
print("Name: {0} Age: {1} Desig: {2} Salary: {3} Lang: {4}".format(e2.name,e2.age,e2.desig,e2.salary,e2.lang))