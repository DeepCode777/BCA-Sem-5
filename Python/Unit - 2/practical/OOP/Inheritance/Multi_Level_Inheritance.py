#Multi-Level Inheritance

class father:
    surname = input("Enter Your Surname : " + "\n")

class son(father):
    def show(self):
        print("Full Name Is : " + input("Enter Your First name : " + "\n"), self.surname)

class gson(son):
    def display(self):
        print("Your Son Name Is : " + input("Enter Your son First name : " + "\n"), self.surname)

s = gson()
s.show()
s.display()