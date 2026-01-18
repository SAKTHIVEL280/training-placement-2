def exp(s,l,r):
 while l>=0 and r<len(s) and s[l]==s[r]:
  l-=1
  r+=1
 return r-l-1

def pal(s):
 i=0
 m=0
 while i<len(s):
  m=max(m,exp(s,i,i),exp(s,i,i+1))
  i+=1
 return m

s=input()
print(pal(s))
