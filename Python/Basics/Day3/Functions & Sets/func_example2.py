"""
importing the function from func_example1
"""
"""
import func_example1

func_example1.add(1,2)
func_example1.multi(3,8)
"""

from func_example1 import add, multi, sub, div

x = int(input("Enter x:"))
y = int(input("Enter y:"))
add(x,y)
multi(x,y)
sub(x,y)
div(x,y)