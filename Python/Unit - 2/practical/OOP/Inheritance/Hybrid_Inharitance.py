# Hybrid Inheritance

class first:
    def display(self):
        print("Class first")

class second(first):
    def displaySec(self):
        print("Class second")

class third(first):
    def displayThird(self):
        print("Class third")

class four(second, third):
    def displayFour(self):
        print("Class four")

obj = four()
obj.display()
obj.displaySec()
obj.displayThird()
obj.displayFour()