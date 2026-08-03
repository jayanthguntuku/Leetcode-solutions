class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        if n <= 1: 
            return nums
        
        mid = n//2
        left = self.sortArray(nums[:mid])
        right = self.sortArray(nums[mid:])
        l_len = len(left)
        r_len = len(right)

        l = r = 0
        sorted_arr = []
        while l < l_len and r < r_len:
            if left[l] < right[r]:
                sorted_arr.append(left[l])
                l+=1
            else:
                sorted_arr.append(right[r])
                r+=1
        while l < l_len:
            sorted_arr.append(left[l])
            l+=1
        while r < r_len:
            sorted_arr.append(right[r])
            r+=1
        return sorted_arr   
        
