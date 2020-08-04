"""
importing the function from func_example1
"""
"""
import func_example1

func_example1.add(1,2)
func_example1.multi(3,8)
"""

from func_example1 import Calc

obj = Calc()

x = int(input("Enter x:"))
y = int(input("Enter y:"))
obj.add(x,y)
obj.multi(x,y)
obj.sub(x,y)
obj.div(x,y)