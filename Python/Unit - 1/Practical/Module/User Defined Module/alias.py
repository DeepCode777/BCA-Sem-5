# import module with alias name
import module as udm

num1 = int(input("Enter first number:"))
num2 = int(input("Enter second number:"))

print("Addition", udm.add(num1, num2))
print("Subtraction", udm.sub(num1, num2))
print("Multiplication", udm.mul(num1, num2))
print("Division", udm.div(num1, num2))