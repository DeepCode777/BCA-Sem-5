# Calculating Factorial numbers using Recurgion
 
num = int(input("Enter steps of Factorial : "))
print()

def factorial(num, fact=1):
    if num==1 :
        print(fact)
        return
    factorial(num-1, fact * num)

factorial(num)