def sp(m,r,c):
 t=0
 b=r-1
 l=0
 ri=c-1
 while t<=b and l<=ri:
  i=l
  while i<=ri:
   print(m[t][i],end=" ")
   i+=1
  t+=1
  i=t
  while i<=b:
   print(m[i][ri],end=" ")
   i+=1
  ri-=1
  if t<=b:
   i=ri
   while i>=l:
    print(m[b][i],end=" ")
    i-=1
   b-=1
  if l<=ri:
   i=b
   while i>=t:
    print(m[i][l],end=" ")
    i-=1
   l+=1

r,c=map(int,input().split())
m=[]
i=0
while i<r:
 m.append(list(map(int,input().split())))
 i+=1
sp(m,r,c)
