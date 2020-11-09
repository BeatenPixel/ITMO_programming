import re
# Вариант 28
# Task1: 28 % 5 = 3

class test:
	strInput = ''
	strOutput = ''
	strTrueOutput = ''

	def __init__(self, _strInput, _strTrueOutput):
		self.strInput = _strInput
		self.strTrueOutput = _strTrueOutput

tests = []

tests.append(test(
'Студент Вася вспомнил, что на своей\n'+
'лекции Балакшин П.В. упоминал про\n'+
'старшекурсников, которые будут ему\n'+
'помогать: Анищенко А.А. и Машина Е.А.\n',
'Анищенко\n'
'Балакшин\n'
'Машина\n'
))

tests.append(test(
'Позавчера Анатолий повстречал Вассерман А.А.\n'+
'- А? Сколько мандаринов?\n'+
'- 8, ответил Иванов Анатолий\n'+
'- Я приеду, поем? - спросил Ященко К.Г.\n',
'Вассерман\n'
'Ященко\n'
))

tests.append(test(
'Однажды в шумной переполненной аудитории профессор Циалковский К.Э.\n'+
'одного из университетов громко спросил:\n'+
'"Кто из Вас Альберт Эйнштейн?"\n'+
'В гробовой тишине поднялся один из студентов.\n'+
'Этим студентом был Эйнштейн А.А.\n',
'Циалковский\n'
'Эйнштейн\n'
))

tests.append(test(
'Сегодня у нас в гостях Последний В.В.\n'+
'- Здравствуйте!\n'+
'- Добрый вечер.\n'+
'- Минин Д.А.?\n'+
'- Нет, Наконечный А.А.\n',
'Минин\n'+
'Наконечный\n'+
'Последний\n'
))

tests.append(test(
'28 лет была засуха\n'+
'Нас спас Дмитриев А.А.\n'+
'Какая-то бессмыслица! Это же\n'+
'Просто тестовый текст\n'+
'Жук Е.В.\n',
'Дмитриев\n'+
'Жук\n'
))

expr = re.compile(r"[А-Я][а-я]*\s[А-Я]{1}\.[А-Я]{1}\.")

for i in range(len(tests)):
	strRes = ''
	res = sorted([x[:-5]  for x in re.findall(expr,tests[i].strInput)])
	for x in res:
		strRes+=x+'\n'

	print('Test #'+str(i+1)+" "+str(strRes==tests[i].strTrueOutput))
	print('Regex result:\n'+strRes)

	print('True result:\n'+tests[i].strTrueOutput)
	#print('Text:\n'+tests[i].strInput)

