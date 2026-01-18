def mx(a,n,k):
 s=sum(a[:k])
 m=s
 i=k
 while i<n:
  s+=a[i]-a[i-k]
  if s>m:
   m=s
  i+=1
 return m

n=int(input())
a=list(map(int,input().split()))
k=int(input())
print(mx(a,n,k))
