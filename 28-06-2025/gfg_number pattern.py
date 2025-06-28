class Solution:
    def printPat(self, n):
        #write code here
        result = []
        N = n
        count = 0
        for i in range(n):
            x = n
            m = n - count
            counter = 0
            for j in range(n*N):
                result.append(x)
                counter+=1
                if counter == m:
                    x = x -1
                    counter = 0
            N = N - 1
            result.append(-1)
            count+=1
        return result
            
