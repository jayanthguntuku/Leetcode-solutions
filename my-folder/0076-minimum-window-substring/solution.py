class Solution:
    def minWindow(self, s: str, t: str) -> str:
        n = len(s)
        m = len(t)
        if m > n:
            return ""
        windowLen = float('inf')
        i = j = 0
        hm = Counter(t)
        count = len(hm)
        while j < n:
            if s[j] in hm:
                hm[s[j]] -= 1
                if hm[s[j]] == 0:
                    count -= 1
            while count == 0:
                if j - i + 1 < windowLen:
                    windowLen = j - i + 1
                    start = i
                if s[i] in hm:
                    hm[s[i]] += 1
                    if hm[s[i]] > 0:
                        count += 1
                i += 1
            j += 1
        return "" if windowLen == float('inf') else s[start: start+windowLen]
