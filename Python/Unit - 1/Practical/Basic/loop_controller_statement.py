#Loop Controller Statements

# 1] - (pass statment)
a = int(input("Enter Number : "))
 print()
b = int(input("Enter Number : "))
print()
if (a>b):
    pass    # Pass(nathing to do then just can pass) the control if condition true 
else:
    print("B is grater")

print("End... pass controller")

# 2] - (break statment)
for i in range(1,10,1):
    if(i == 7):
        break    # Break loop if condition is true
    else:
        print(i)

print("End... Break controller")

# 3] - (continue statment)
for i in range(1,5,1):
    if(i == 7):
        continue    # Skip control if condition is true
    else:
        print(i)

print("End... Continue controller")