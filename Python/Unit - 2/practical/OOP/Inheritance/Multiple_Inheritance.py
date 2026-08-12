#Multie Inheritance

class devloper:
    back = "Oracle DB & Java"
    def backend(self):
        print("Backend Task : ",self.back)

class intern:
    front = "HTML,CSS or JS"
    def frontend(self):
        print('Frontent Task : ', self.front)

class teamhead(devloper,intern):
    def show(self):
        print("Dynamic Website Ready")

t = teamhead()
t.backend()    # Backend Task : Oracle DB & Java"
t.frontend()    # Frontent Task : HTML,CSS or JS
t.show()   # Dynamic Website Ready