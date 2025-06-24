class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
            min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }return new Pair(min,max);
    }
}
