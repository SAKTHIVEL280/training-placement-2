//Longest Subarray with Sum = K

import java.util.*;

class Main{
 static int sub(int a[],int n,int k){
  HashMap<Integer,Integer> m=new HashMap<>();
  int s=0;
  int mx=0;
  int i=0;
  while(i<n){
   s+=a[i];
   if(s==k){
    if(i+1>mx) mx=i+1;
   }
   if(m.containsKey(s-k)){
    int t=i-m.get(s-k);
    if(t>mx) mx=t;
   }
   if(!m.containsKey(s)) m.put(s,i);
   i++;
  }
  return mx;
 }

 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[n];
  int i=0;
  while(i<n){
   a[i]=sc.nextInt();
   i++;
  }
  int k=sc.nextInt();
  System.out.println(sub(a,n,k));
 }
}
