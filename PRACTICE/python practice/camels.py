y=input("camelCase: ")
for char in y:
    if char.isupper():
        print("There is an uppercase letter")
        break
    else:
        print("There is no uppercase letter in that string")
        break
    
