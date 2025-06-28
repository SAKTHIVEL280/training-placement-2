#User function Template for python3

class Solution:
    #Function to return list containing first n fibonacci numbers.
    def fibonacciNumbers(self,n):
        # your code here
        l=[]
        a = 0
        b = 1
        for i in range(n):
            l.append(a)
            a,b=b,a+b
        return l
