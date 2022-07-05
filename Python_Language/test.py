#Q22
a = ["ManUnited", "Liverpool", "Chelsea", "Arsenal", "ManCity"]
b = ["Liverpool", "ManUnited", "Chelsea", "NotForest"]
c = []

print()
for i in a :
    for j in b :
        if i == j:
            c = j
            print(c)
print()

#Q23
clubs = ["Liverpool", "ManUnited", "LeicesterCity", "Arsenal", "Chelsea"]

print()
for i in clubs:
    if(i[0] == 'L'):
        print(i)
    
print()

#Q24
clubs2 = ["Liverpool", "ManUnited", "LeicesterCity", "Arsenal", "Chelsea"]
clubWithL = []

print()
for i in clubs2:
    if(i[0] == 'L'):
        clubWithL.append(i)

print(clubWithL)
print()

#Q25
a = 100
b = 50

if a < b:
    m = a
else :
    m = b

print(m)
print()