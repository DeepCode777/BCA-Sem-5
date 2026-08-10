#Increasing_Right_Angel_Trigale

num = int(input("Enter Num : "))
print()

count = 0

for i in range(1, num+1):
    for j in range(0, i):
        print(count, end=" ")
        count += 1
    print()