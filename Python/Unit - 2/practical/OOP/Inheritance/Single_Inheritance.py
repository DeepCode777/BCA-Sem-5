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

class forAddSub:
    num1 = int(input("Enter First Number : " + "\n"))
    num2 = int(input("Enter Second Number : " + "\n"))
    
    def add(self):
        print("Addition : ",self.num1 + self.num2)

    def sub(self):
        print("Substraction : ",self.num1 - self.num2)

class forMulDivMod(forAddSub):
    def multi(self):
        print("Multiplication : ",self.num1 * self.num2)
    def div(self):
        print("Division : ",self.num1 / self.num2)
    def modu(self):
        print("Modulation : ",self.num1 % self.num2)

cal = forMulDivMod()
cal.add()
cal.sub()
cal.multi()
cal.div()
cal.modu()