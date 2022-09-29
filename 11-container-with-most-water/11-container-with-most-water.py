class Solution:
    def maxArea(self, height: List[int]) -> int:
        x = 0
        y = len(height) - 1
        maximun = 0
        while(x < y):
            if height[x] > height[y]:
                maximun = max(maximun, (y-x)* height[y])
                y -= 1
            else:
                maximun = max(maximun, (y-x)* height[x])
                x += 1
        return maximun