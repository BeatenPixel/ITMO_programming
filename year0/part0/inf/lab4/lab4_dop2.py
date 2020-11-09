import re
# Вариант 28
# Task1: 28 % 6 = 4

class test:
	strInput = ''
	strOutput = ''
	strTrueOutput = ''

	def __init__(self, _strInput, _strTrueOutput):
		self.strInput = _strInput
		self.strTrueOutput = _strTrueOutput

tests = []

tests.append(test(
'Кривошеее сущессссство гуляет по парку гуляет ',
'гуляет\n'
))

tests.append(test(
'Собака съела большой яичный шелк ',
'яичный\n'
))

tests.append(test(
'Более или менее можо сделать ',
'Более\n'+
'менее\n'
))

tests.append(test(
'Сколько зоопарков будет закрыто? ',
'зоопарков\n'
))

tests.append(test(
'Почему гиены едят быстрее чем волки? ',
'гиены\n'+
'быстрее\n'
))

regex = r"\w*[AОУЫЭЯЁЕИЮаоуыяёеию]{2}\w*\s([AОУЫЭЯЁЕИЮаоуыяёеию]*[^AОУЫЭЯЁЕИЮаоуыяёеию\s][AОУЫЭЯЁЕИЮаоуыяёеию]*){0,3}[\s\n]"

for i in range(len(tests)):
	matches = re.finditer(regex, tests[i].strInput, re.MULTILINE)
	strRes = ""
	for match in matches:
		strRes += match.group().split()[0]+"\n"

	print('Test #'+str(i+1)+" "+str(strRes==tests[i].strTrueOutput))
	print('Regex result:\n'+strRes)

	print('True result:\n'+tests[i].strTrueOutput)
	#print('Text:\n'+tests[i].strInput)

"""

\w*([AОУЫЭЯЁЕИЮаоуыяёеию]{2})\w*\s([^\s]*[БВГДЖЗЙКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщ][^\s]*){0,3}[\s\n]

\w*([AОУЫЭЯЁЕИЮаоуыяёеию]{2})\w*\s(?:(\w*[^AОУЫЭЯЁЕИЮаоуыяёеию\s]\w*){4,})\s

"""