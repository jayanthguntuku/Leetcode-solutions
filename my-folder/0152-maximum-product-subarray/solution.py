class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        currMin = nums[0]
        currMax = nums[0]
        res= nums[0]

        for num in nums[1:]:
            if num < 0:
                currMax, currMin = currMin, currMax
            currMax = max(num, currMax * num)
            currMin = min(num, currMin * num)
            res = max(res, currMax)
        return max(currMax, res)
            
