class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maximum, minimum = 0, float('inf')
        for i in range(len(prices)):
            if prices[i] < minimum: minimum = prices[i]
            else: maximum = max(maximum, prices[i] - minimum)
        return maximum