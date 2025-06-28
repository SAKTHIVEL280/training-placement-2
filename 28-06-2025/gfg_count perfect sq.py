class Solution:
    def countSquares(self, n):
        c = 0
        i = 1
        while i * i < n:
            c += 1
            i += 1
        return c
