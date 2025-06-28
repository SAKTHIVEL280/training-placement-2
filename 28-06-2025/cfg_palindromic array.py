# Your task is to complete this function
# Function should return true/false
def isPalinArray(arr):
    # Code here
    for i in arr:
        i=str(i)
        if i!=i[::-1]:
            return False
    return True
            
            
