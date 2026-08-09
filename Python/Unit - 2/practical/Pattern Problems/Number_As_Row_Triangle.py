#Number  as row Triangle Pattern

rows = int(input("Enter the row size for the pattern:"))
print()
for i in range(1, rows + 1):
    for j in range(1, i + 1):
        print(i, end=" ")  # Print numbers (i)
    print()
