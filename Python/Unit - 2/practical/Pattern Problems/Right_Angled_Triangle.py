#Right-Angled Triangle Pattern in Python

row = int(input("Enter Number Of Row : "))
print()
print("Method 1")
for i in range(1, row + 1):
    print("*  " *i)
print()

print("Method 2")
for i in range(1, row + 1):
    for j in range(1, i + 1):
        print("* ", end=" ")
    print()