num = int(input("Enter steps of fibonacci : "))
print()

a = 0
b = 1

def fibonacci(a, b, num):
    if num==0 :
        print(a)
        return
    print(a)
    fibonacci(b, a+b, num-1)

fibonacci(a,b, num)