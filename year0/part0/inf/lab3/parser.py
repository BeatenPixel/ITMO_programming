#!/usr/bin/env python3

import re

tabs=0
tabsArg = { 0 : 'a'}

#SubParsers

def stripValue(s):
	return s.strip().strip(':').strip().strip('"')

def printTabs():
	o.write("\t"*tabs)
	return

def parseObjectStart(l):
	global tabs
	if re.match(r"\".*\"?: {",l):
		printTabs()

		match = re.search(r'\".*\"', l)
		o.write("<" + match.group(0).strip('"')+">\n")
		tabsArg[tabs] = match.group(0).strip('"')
		tabs+=1
	return

def parseValue(l):
	if re.match(r"\".*\"\s?:?\s?\".*\"",l):
		keyMatch = re.search(r"\".*\"\s?:",l)
		key = stripValue(keyMatch.group(0))

		valueMatch = re.search(r":\s?\".*\"",l)
		value = stripValue(valueMatch.group(0))

		printTabs()
		o.write("<"+key+">"+value+"</"+key+">\n");

	return

def parseArrayStart(l):
	global tabs
	global tabsArg

	if re.match(r"\"[^\"].*\"*\[$", l):
		arrNameMatch = re.search(r"\".*\"\s?:",l)
		arrName = stripValue(arrNameMatch.group(0))
		tabsArg[tabs]=arrName

	return

def parseArrayElemStart(l):
	global tabs
	global tabsArg

	if l.strip()=="{":
		printTabs()
		o.write("<"+tabsArg[tabs]+">\n");
		tabs+=1

	return

def parseArrayElemOrObjectEnd(l):
	global tabs
	global tabsArg

	if re.match(r"},?",l):	

		if(tabs in tabsArg.keys()):			
			tabs -= 1
			printTabs()
			o.write("</"+tabsArg[tabs]+">\n")
			return

		printTabs()
		o.write(tabsArg[tabs-1]);	

	return

def parseArrayElemInRow(l):
	global tabs
	global tabsArg

	if re.match(r"\".*\"\s?,\s?\".*\"",l):
		groups = re.finditer("\".[^\"]*\"",l)		
		for match in groups:
			printTabs()
			o.write("<"+tabsArg[tabs]+">" + match.group(0).strip("\"")
				+ "</"+tabsArg[tabs]+">" + "\n")

	return

# Start
with open("schedule.json") as f:
    content = f.readlines()

content = [x.strip() for x in content] 

open('schedule_generated.xml', 'w').close()
o = open('schedule_generated.xml', 'a+')

o.write('<?xml version="1.0" encoding="UTF-8" ?>\n')

counter = 0

for l in content:
	
	if counter < 1 or counter > len(content)-2:
		counter+=1
		continue
	
	parseObjectStart(l)
	parseValue(l)
	parseArrayStart(l)
	parseArrayElemStart(l)
	parseArrayElemOrObjectEnd(l)
	parseArrayElemInRow(l)

	counter += 1

o.close()