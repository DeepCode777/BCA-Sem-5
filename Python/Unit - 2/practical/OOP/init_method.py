#Class With __init__ method

class emp():    #class
    def __init__(self):    #Class Default Method
        self.id = int(input("Enter ID : " + "\n"))
        self.name = input("Enter Name : " + "\n")
        self.age = int(input("Enter Age : " + "\n"))

    def display(self):    #data display
        print("Employee ID : ", self.id)
        print("Employee Name : ", self.name)
        print("Employee Age : ", self.age)

e = emp()    #class - object 
e.display()    #call methode Of Class


#Class Without __init__ method

class employee():

    id = int(input("Emter ID ; " + "\n"))
    name = input("Emter Nmae ; " + "\n")
    age = int(input("Emter Age ; " + "\n"))
    
    def display(self):
        print("Employee ID : ", self.id)
        print("Employee Name : ", self.name)
        print("Employee Age : ", self.age)

E1 = employee()
E1.display()