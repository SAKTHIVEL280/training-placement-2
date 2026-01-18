import java.util.*;
class Main{
 static void nge(int a[],int n){
  Stack<Integer> st=new Stack<>();
  int r[]=new int[n];
  int i=n-1;
  while(i>=0){
   while(!st.isEmpty() && st.peek()<=a[i])
    st.pop();
   r[i]=st.isEmpty()?-1:st.peek();
   st.push(a[i]);
   i--;
  }
  i=0;
  while(i<n){
   System.out.print(r[i]+" ");
   i++;
  }
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
  nge(a,n);
 }
}
