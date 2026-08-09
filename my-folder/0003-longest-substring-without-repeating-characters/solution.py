class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        n = len(s)
        i = j = 0
        hm = Counter()
        res = 0

        while j < n:
            hm[s[j]] += 1
            while hm[s[j]] > 1:
                hm[s[i]] -= 1
                i += 1
            res = max(res, j - i + 1)
            j += 1
        return res


