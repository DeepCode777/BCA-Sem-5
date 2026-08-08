#Square in Python

row = int(input("Enter Number Of Row : "))
print()
print("Method 1")
for i in range(0, row):
    print("*  " *row)
print()

print("Method 2")
for i in range(0, row):
    for j in range(0, row):
        print("* ", end=" ")
    print()
