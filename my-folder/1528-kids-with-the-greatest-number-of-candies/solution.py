class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        ans = []
        max_num = max(candies)
        for i in range(len(candies)):
            if candies[i] + extraCandies >= max_num:
                ans.append(True)
            else:
                ans.append(False)
        return ans
