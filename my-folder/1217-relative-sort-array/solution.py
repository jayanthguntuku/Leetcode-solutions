class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        counts = [0] * 1001
        for x in arr1:
            counts[x] += 1
        res = []
        for x in arr2:
            res.extend([x] * counts[x])
            counts[x] = 0
        
        for i in range(1001):
            if counts[i] > 0:
                res.extend([i] * counts[i])
        return res

        
