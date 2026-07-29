import module    #   must import User Defined Module 

num1 = int(input("Enter first number:"))
num2 = int(input("Enter second number:"))

print("Addition", module.add(num1, num2))
print("Subtraction", module.sub(num1, num2))
print("Multiplication", module.mul(num1, num2))
print("Division", module.div(num1, num2))