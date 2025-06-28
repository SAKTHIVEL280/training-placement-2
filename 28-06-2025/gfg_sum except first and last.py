class Solution:
    def sumExceptFirstLast(self,arr):
        # Parr:  list of pair
        #code here
        t=0
        if len(arr)>2:
            for i in range(1,len(arr)-1):
                t+=arr[i]
            return t
        else:
            return 0
