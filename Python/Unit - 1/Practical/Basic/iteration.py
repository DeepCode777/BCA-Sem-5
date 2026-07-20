#Iteration In Python

print("<===While Loop ===>")
count = 0

while (count < 10):
    print(count, end=", ")
    count += 1;
    
print()
print("End...!")


print("<===For Loop ===>")

for i in range(1, 11):
    print(i, end=", ")
    
print()
print("End...!")


print("<===For Loop Odd Number===>")
#(Stating, ending ,update)
for i in range (1,21,2): 
    print(i, end=", ")
    
print()
print("End...!")


print("<===Nested Loop ===>")
#(Stating, ending ,update)
for i in range (1,6): 
    for j in range (1,i+1):
        print(i, end=", ")
    print()

print("End...!")

# <== Output ===>
# 1
# 2,2
# 3,3,3
# 4,4,4,4
# 5,5,5,5,5