#Single Inharitance

class Father:
    def func1(self):
        print("Parante Class")

class Son(Father):
    def func2(self):
        print("Child Class")

obj = Son()
obj.func1()    # Parent Class Method Call
obj.func2()    # Child Ckass Method

# Output
# Parente Class
# Child Class