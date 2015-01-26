'''
Created on Jan 22, 2015

@author: gotrecillo
'''

a = [11, False, "Relaxing Cup"]
c = [11, False, "Relaxing Cup"]
b = ["una lista", a]
print a[0]
print a[1]
print a[2]
print b
print b[1][2]
a[0] = 99
print a[0]
print a
a[2] = a
print a
print a[2]
print a[2][0]