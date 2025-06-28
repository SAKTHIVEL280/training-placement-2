class Solution:
    def closestNumber(self, n, m):
        # code here 
        q = n // m
        n1 = m * q
        n2 = m * (q + 1)
        if abs(n - n1) < abs(n - n2):
            return n1
        elif abs(n - n1) > abs(n - n2):
            return n2
        else:
            return n1 if abs(n1) > abs(n2) else n2

