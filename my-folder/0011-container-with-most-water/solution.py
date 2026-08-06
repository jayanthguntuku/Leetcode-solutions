class Solution:
    def maxArea(self, height: List[int]) -> int:
        start = 0
        end = len(height) - 1
        res = 0
        while(start < end):
            area = (end - start) * min(height[start], height[end])
            if height[start] <= height [end]:
                start += 1
            else:
                end -= 1
            res = max(res, area)
        return res
        

        
