'''
Created on 2014. 11. 18.

@author: greatjin
'''

import pygame
from turtle import Screen

width = 640
height=480
radius=100
fill =0

pygame.init()

'''window=pygame.display.set_mode((width, height))

window.fill((pygame.Color(255,255,255)))

while True:
    pygame.draw.circle(window,
                       pygame.Color(255,0,0),
                       (width/2, height/2),
                       radius, fill)
    pygame.display.update()'''


'''for fontname in pygame.font.get_fonts():
    print fontname                        
                       
screen = pygame.display.set_mode((725, 92))

font = pygame.font.SysFont("freeserif",72,bold =1)
textSurface = font.render("1 Theremin Per Child",1,
                          pygame.Color(255,255,255))
screen.blit(textSurface, (10,10))
while True:
    pygame.display.update()  '''
    
    
import pygame.mixer
from time import sleep

'''pygame.mixer.init(4800, -16 , 1,1024)
sound = pygame.mixer.Sound("go.wav")
channelA = pygame.mixer.Channel(0)
channelA.play(sound) 
sleep(2.0)          ''' 

import pygame.midi

'''pygame.midi.init()
for id in range(pygame.midi.get_count()):
    print pygame.midi.get_device_info(id)            '''
    
'''instrument=0
note = 74
volume=127

pygame.init()
pygame.midi.init()

port=1

midiOutput = pygame.midi.Output(port,0)
midiOutput.set_instrument(instrument)

for note in range(0,127):
    midiOutput.note_on(note,volume)
    sleep(.1)
    midiOutput.note_off(note,volume)
del midiOutput
pygame.midi.quit()  '''  


'''pygame.init()
screen= pygame.display.set_mode((30,20))
movie=pygame.movie.Movie("xxx.mpg")
movie.play()
while True:
    if not(movie.get_busy()):
        print("rewind")
        movie.rewide()
        movie.play()
    if pygame.QUIT in [e.type for e in pygame.event.get()]:
        break
    '''