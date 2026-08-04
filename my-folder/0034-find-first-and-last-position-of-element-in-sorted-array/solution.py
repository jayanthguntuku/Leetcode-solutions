class Solution:
    def first_occurence(self, nums, target, n):
        res = -1
        start = 0
        end = n - 1
        while(start <= end):
            mid = start + (end -start)//2

            if nums[mid] == target:
                res = mid
                end = mid-1
            elif target < nums[mid]:
                end = mid - 1
            else:
                start = mid + 1
        return res
    
    def last_occurence(self, nums, target, n):
        res = -1
        start = 0
        end = n - 1
        while(start <= end):
            mid = start + (end -start)//2

            if nums[mid] == target:
                res = mid
                start = mid + 1
            elif target < nums[mid]:
                end = mid - 1
            else:
                start = mid + 1
        return res
    
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        if n == 0:
            return [-1,-1]
        if n == 1 and nums[0] == target:
            return [0,0]
        elif n == 1 and nums[0] != target:
            return [-1,-1]
        
        first_occ = self.first_occurence(nums, target, n)
        last_occ = self.last_occurence(nums, target, n)

        return [first_occ, last_occ]
