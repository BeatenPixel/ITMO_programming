import os
import time

iterationsCount = 10
startTime = time.time()

for i in range(iterationsCount):
	os.system('python parser.py')

myTime = time.time()-startTime
print("--- MyParser: %s sec ---" % (myTime))

startTime = time.time()

for i in range(iterationsCount):
	os.system('python json2xml/json2xml_parser.py')

json2xmlTime = time.time()-startTime
print("--- json2xml: %s sec ---" % (json2xmlTime))

print("json2xml is " + ('%.3f' % (json2xmlTime/myTime)) + " times slower ")