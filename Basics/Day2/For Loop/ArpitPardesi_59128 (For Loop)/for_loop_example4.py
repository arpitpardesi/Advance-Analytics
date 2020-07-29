"""
Write a program that prints the integers from 1 to 100.
But for multiples of three print "Fizz" instead of the
number, and for the multiples of five print "Buzz".
For numbers which are multiples of both three and five
print "FizzBuzz".
For the rest, print the actual number
"""

for i in range(1,101):
    if(i%3==0):
        if(i%5==0):
            print("FizzBuzz")
        else:
            print("Fizz")
    elif(i%5==0):
        if(i%3==0):
               print("FizzBuzz") 
        else:
            print("Buzz")
    else:
        print(i)


