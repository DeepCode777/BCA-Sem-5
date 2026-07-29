#import only specific function from module file
from module import add, sub

num1 = int(input("Enter first number:"))
num2 = int(input("Enter second number:"))

print("Addition", add(num1, num2))
print("Subtraction", sub(num1, num2))
print("Multiplication", mul(num1, num2)) #error not defined 
print("Division", div(num1, num2)) # error not defined