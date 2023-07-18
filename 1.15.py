from math import sqrt

x1 = int(input())
y1 = int(input())
r1 = int(input())
x2 = int(input())
y2 = int(input())
r2 = int(input())

dist = sqrt((y2-y1)**2+(x2-x1)**2)

totalr = r1 + r2

sonuc = dist - totalr


if sonuc > 0:
 print("%.2f"% sonuc)

else: print("0")