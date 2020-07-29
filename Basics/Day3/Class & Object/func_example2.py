"""
importing the function from func_example1
"""
"""
import func_example1

func_example1.add(1,2)
func_example1.multi(3,8)
"""

from func_example1 import Calc

x = int(input("Enter x:"))
y = int(input("Enter y:"))
Calc.add(x,y)
Calc.multi(x,y)
Calc.sub(x,y)
Calc.div(x,y)