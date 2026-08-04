class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        n = len(nums)
        maxx = max(nums)
        minn = min(nums)
        if n == maxx - minn + 1:
            return []

        counts = [0] * (maxx - minn + 1)
        for x in nums:
            counts[x -minn]+=1

        res = []
        for x in range(maxx - minn + 1):
            if counts[x] == 0:
                res.append(x+minn)

        return res        
