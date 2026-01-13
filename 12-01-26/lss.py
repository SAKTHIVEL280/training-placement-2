#longest substring without repeating chrs
def lsw(s):
 m={}
 i=0
 j=0
 mx=0
 while j<len(s):
  if s[j] in m and m[s[j]]>=i:
   i=m[s[j]]+1
  m[s[j]]=j
  if j-i+1>mx:
   mx=j-i+1
  j+=1
 return mx

s=input()
print(lsw(s))
