class Solution {

    static int search(int arr[], int x) {

        // Your code here
        for(int i =0 ;i < arr.length;i++)
        {
            if(x==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
}
