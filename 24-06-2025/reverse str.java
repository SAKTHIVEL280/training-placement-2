class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder sb= new StringBuilder();
        for(int i = s.length()-1; i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
