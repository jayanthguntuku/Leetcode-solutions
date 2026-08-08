class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        n = len(nums)
        i = j = 0
        summ = 0
        avgg = float('-inf')
        while j < n:
            summ = summ + nums[j]
            if j - i + 1 < k:
                j += 1
            elif j - i + 1 == k:
                avgg = max(avgg, summ/k)
                summ -= nums[i]
                i += 1
                j += 1
        return avgg

