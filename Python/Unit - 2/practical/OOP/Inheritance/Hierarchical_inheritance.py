# Hierarchical Inheritance

class father:
    surname = input("Enter Your Surname : " + "\n")
    def show(self):
        print("My Surname Is : " , self.surname)

class son(father):
    def display1(self):
        print("My zname Is Arun ", self.surname)

class daughter(father):
    def display2(self):
        print("My zname Is Tanisha ", self.surname)

s = son()
s.display1()

d = daughter()
d.display2()