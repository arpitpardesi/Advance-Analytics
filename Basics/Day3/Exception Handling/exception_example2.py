'''
Write a function  that asks for an integer and prints the square of it.
Use a while loop with a try, except block to account for incorrect inputs.
Sample Output:
Enter the number whose square is needed: xyz
The value you entered doesn't look like an int, Try Again:
Enter the number whose square is needed: 5
Square of 5 is 25
'''
def ask_and_square():
      a = 1
      while(a>0):
         try:
            a = int(input("Enter: "))
            print("Square:",a**2)
         except ValueError:
            print("Input is not a number. Try again!!")
      else:
         print("You entered 0. \nTerminating loop... ")

ask_and_square()

