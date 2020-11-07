from json2xml import json2xml
from json2xml.utils import readfromjson

data = readfromjson("schedule.json")

o = open('schedule_generated.xml', 'a+')
o.write(json2xml.Json2xml(data).to_xml())
