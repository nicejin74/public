'''
Created on 2014. 11. 13.

@author: greatjin
'''

print ("hello python")


n=0

def setup():
    global no
    n=100
    
def loop():
    global n 
    n += 1
    if((n%2)==0):
        print(n)
        
"""from datetime import datetime
from time import sleep
"""

'''while True:
    now = str(datetime.now())
    print(now)
    sleep(1)
'''

'''from datetime import datetime
from time import sleep

import random

log=open("c:\\temp\\python.log","w")

for i in range(5):
    now = str(datetime.now())
    data = random.randint(0,1024)
    log.write(now+" " + str(data)+"\n")
    sleep(.9)
log.flush()
log.close()    
    
    
def log(message):
    print(message)
    log.write(message)
    '''
    
import sys

if(len(sys.argv) !=2): 
    print("Usage python readfile.py filename")
    sys.exit()        

scriptname = sys.argv[0]
filename   = sys.argv[1]

file = open (filename, "r")
lines = file.readlines()
file.close()

for line in lines:
    print(line, end = '')


            
    