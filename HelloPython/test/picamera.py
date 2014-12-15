'''
Created on 2014. 12. 15.

@author: Administrator
'''

import picamera
import time

'''camera = picamera.PiCamera()
camera.vflip=True
camera.capture('image.jpg')
'''
with picamera.PiCamera() as camera:
    camera.resolution = (1024, 768)
    camera.start_preview()
    # Camera warm-up time
    time.sleep(2)
    camera.capture('foo.jpg')