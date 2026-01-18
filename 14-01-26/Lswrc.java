import java.util.*;
class Main{
 static int len(String s){
  HashMap<Character,Integer> m=new HashMap<>();
  int i=0,j=0,ans=0;
  while(j<s.length()){
   if(m.containsKey(s.charAt(j)) && m.get(s.charAt(j))>=i)
    i=m.get(s.charAt(j))+1;
   m.put(s.charAt(j),j);
   ans=Math.max(ans,j-i+1);
   j++;
  }
  return ans;
 }
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  System.out.print(len(s));
 }
}
