def ords():
 o=[]
 k=1
 while 1:
  x=int(input())
  if x==1:
   o.append(k)
   print(k)
   k+=1
  elif x==2:
   if o:
    i=int(input())
    if i in o:
     o.remove(i)
     print("Cancelled")
    else:
     print("Invalid")
   else:
    print("Empty")
  elif x==3:
   if o:
    i=0
    while i<len(o):
     print(o[i],end=" ")
     i+=1
     print()
   else:
    print("NoOrders")
  else:
   break

ords()
