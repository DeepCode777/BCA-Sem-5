#Pyramid pattern

rows = int(input("Enter the row size for the pattern: "))
print()

#solution - 1
for i in range(1, rows + 1):  # Outer loop for rows
    for j in range(rows - i):  # Inner loop for spaces
        print(" ", end=" ")
    for k in range(1, 2 * i):  # Inner loop for stars
        print("*", end=" ")
    print()

#solutiom - 2
for i in range(1, rows + 1):
    print(" " * (rows - i) + "* " * i)