class Solution:
    def isPalindrome(self, x: int) -> bool:
        y = x
        temp = 0
        while(y > 0):
            temp = temp* 10 + y%10
            y = int (y/10)
        if x == temp: return True
        return False
            