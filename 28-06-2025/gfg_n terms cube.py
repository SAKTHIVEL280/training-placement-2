#User function Template for python3

class Solution:
    def sumOfSeries(self,n):
        #code here
        result=0
        for i in range(1,n+1):
            result+=i**3
        return result
