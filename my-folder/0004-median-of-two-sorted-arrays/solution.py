class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        combinedLength = len(nums1) + len(nums2)
        index = combinedLength // 2
        count = i = j = 0
        prev = curr = None

        while count <= index:
            if i < len(nums1) and (j >= len(nums2) or nums1[i] <= nums2[j]):
                prev = curr
                curr = nums1[i]
                i += 1
            else:              
                prev = curr
                curr = nums2[j]
                j += 1
            count += 1
        if combinedLength % 2 == 0:
            return (prev + curr)/2
        else:
            return curr
