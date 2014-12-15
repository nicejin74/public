'''
Created on 2014. 12. 15.

@author: Administrator
'''

import picamera
from time import sleep

camera = picamera.PiCamera()
camera.vflip=True
camera.capture('image.jpg')