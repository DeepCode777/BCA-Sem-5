num = int(input("Enter steps of sum : "))
print()
def calSum(num, sum=0):
    if num==0 :
        print(sum)
        return
    calSum(num-1, sum + num)

calSum(num)