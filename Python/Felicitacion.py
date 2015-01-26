'''
Created on Jan 26, 2015

@author: gotrecillo
'''

edad = int (raw_input("Introduce tu edad: "))
bebe = 0
while bebe < edad:
    print "Has pasado tu cumple numero: " +str(bebe)
    bebe = bebe + 1
print "Tienes "+str(edad)+" tacos"
