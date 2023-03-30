class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        di = {}
        for i in range(0,len(nums)):
            if(di.get(target-nums[i],-1)!=-1):
                return (i,di[target-nums[i]])
            else:
                di[nums[i]]=i
