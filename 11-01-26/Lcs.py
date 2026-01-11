def lcs(a,n):
 s=set(a)
 m=0
 i=0
 while i<n:
  if a[i]-1 not in s:
   x=a[i]
   c=1
   while x+1 in s:
    x+=1
    c+=1
   if c>m:
    m=c
  i+=1
 return m

n=int(input())
a=list(map(int,input().split()))
print(lcs(a,n))
