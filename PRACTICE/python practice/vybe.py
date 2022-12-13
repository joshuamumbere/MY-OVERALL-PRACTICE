sample=input("camelCase: ")

def uppersplit(data):
    buff=''
    for item in data:
        if item.isupper():
            yield buff
            buff=''
        buff+=item
    yield buff
    
    
    
list(uppersplit(sample))
x="_".join(uppersplit(sample)).lower()
print("snake_case :" + x)