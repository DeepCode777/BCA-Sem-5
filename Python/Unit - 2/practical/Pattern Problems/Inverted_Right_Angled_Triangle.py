#Inverted Right-Angled Triangle in Python

row = int(input("Enter Number Of Row : "))
print()
print("Method 1")
for i in range(row, 0, -1):
    print("*  " *i)
print()

print("Method 2")
for i in range(row, 0, -1):
    for j in range(i, 0, -1):
        print("* ", end=" ")
    print()
