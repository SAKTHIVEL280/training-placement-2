class Solution {
    public void printNos(int n) {
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printNos(n - 1);
        
        System.out.print(n+" ");
        
        return;
    }
}
