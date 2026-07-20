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