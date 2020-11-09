import re
#Номер ису 28 
# 28 % 4 = 0

with open("RomeoAndJuliet.txt", "r") as file:
    data = file.read()

regex = r"([A-Z]{1,}[-,; \n]{1,})(['a-zA-z]{1,}[-,; \n]{1,}){4}['a-zA-z]{1,}[\!.?]"

matches = re.finditer(regex, data, re.MULTILINE)

glas = ['a','e','i','o','u','A','E','I','O','U']

for matchNum, match in enumerate(matches, start=1):
    s = match.group()

    dvuslWords = 0
    dvuslWord = ""

    for x in s.split():
    	glasCount = 0
    	for symb in x:
    		if symb in glas:
    			glasCount+=1

    	if(glasCount==2):
    		dvuslWords+=1
    		dvuslWord = x

    if(dvuslWords == 1):
    	print(s +" | " + dvuslWord)