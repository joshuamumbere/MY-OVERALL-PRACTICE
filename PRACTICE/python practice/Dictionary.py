#In python we can make a dictionary in this way
Students=[
    {"name":"Mumbere","course":"BSSE2","District":"Kasese"},
    {"name":"Ssuuna","course":"BIST2","District":"Mpigi"},
    {"name":"Lydia","course":"UCE","District":"Kitswamba"},
    {"name":"Kalunji","course":"UACE","District":"Kampala"},
]
for student in Students:
    print(student["name"])
    
    
    print(" ")
#we can now also print the courses on their own by the way
for x in Students:
    print(x["course"])