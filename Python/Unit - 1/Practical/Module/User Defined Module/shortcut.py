#import everything from a module but, without need to write prefix the module name again and again
# use * 

from module import *

num1 = int(input("Enter first number:"))
num2 = int(input("Enter second number:"))

print("Addition", add(num1, num2))
print("Subtraction", sub(num1, num2))
print("Multiplication", mul(num1, num2))
print("Division", div(num1, num2))