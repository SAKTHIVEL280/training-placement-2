import java.util.*;
class Main{
 static int cnt(int a[],int n,int k){
  HashMap<Integer,Integer> m=new HashMap<>();
  m.put(0,1);
  int s=0,c=0,i=0;
  while(i<n){
   s+=a[i];
   if(m.containsKey(s-k))
    c+=m.get(s-k);
   m.put(s,m.getOrDefault(s,0)+1);
   i++;
  }
  return c;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[n];
  int i=0;
  while(i<n){
   a[i]=sc.nextInt();
   i++;
  }
  int k=sc.nextInt();
  System.out.print(cnt(a,n,k));
 }
}
