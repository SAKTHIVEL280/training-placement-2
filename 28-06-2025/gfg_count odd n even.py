class Solution:
	def countOddEven(self, arr):
		#Code here
		o=0
		e=0
		for i in arr:
		    if i % 2 == 0:
		        e+=1
		    else:
		        o+=1
	    return [o,e]
