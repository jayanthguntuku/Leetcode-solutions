class Solution:
    def getMinIndex(self, nums):
        n = len(nums)
        start, end = 0, n - 1
        while start < end:
            mid = start + (end - start) // 2
            if nums[mid] > nums[end]:
                start = mid + 1
            else:
                end = mid
        return start

    def search_target(self, nums, target, start, end):
        while(start <= end):
            mid = start + (end - start)//2
            if nums[mid] == target:
                return mid
            elif nums[mid] > target:
                end = mid - 1
            else:
                start = mid + 1
        return -1

    def search(self, nums: List[int], target: int) -> int:
        n = len(nums)
        if n == 1:
            if nums[0] == target:
                return 0
            return -1
        
        min_index = self.getMinIndex(nums)
        res1 = self.search_target(nums, target, 0, min_index)
        res2 = self.search_target(nums, target, min_index, n-1)

        return max(res1,res2)
