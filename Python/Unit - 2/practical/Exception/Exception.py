num1 = int(input("Enter Number : "))
num2 = int(input("Enter Number : "))

try:    #Risky block
    ans = num1 / num2
except:    # exception hand
    print("Dont Divide With Zero")
else:    # try is valide then else is expected
    print(ans)
finally:    # execut in any setuation
    print("Final")