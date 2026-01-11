def bal(s):
 st=[]
 i=0
 while i<len(s):
  x=s[i]
  if x=='(' or x=='{' or x=='[':
   st.append(x)
  else:
   if len(st)==0:
    return 0
   t=st.pop()
   if x==')' and t!='(':
    return 0
   if x=='}' and t!='{':
    return 0
   if x==']' and t!='[':
    return 0
  i+=1
 if len(st)==0:
  return 1
 return 0

s=input()
if bal(s)==1:
 print("Balanced")
else:
 print("Not Balanced")
