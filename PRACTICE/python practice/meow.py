def main():
    number=getNumber()
    meow(number)
    
    
def getNumber():
    while True:
        x=int(input("how many times do you want meow to sound :"))
        if x>0:
            break
    return x

def meow(x):
    
        print("meow\n" * x)
    
main()