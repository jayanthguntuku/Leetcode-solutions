class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        n = len(s)
        i = j = 0
        k = len(p)
        res =[]

        hmP = Counter(p)
        count = len(hmP)
        
        while j < n:
            if s[j] in hmP:
                hmP[s[j]] -= 1
                if hmP[s[j]] == 0:
                    count -= 1
            
            if j - i + 1 < k:
                j += 1
            
            elif j - i + 1 == k:
                if count == 0:
                    res.append(i)
                if s[i] in hmP:
                    if hmP[s[i]] == 0:
                        count += 1
                    hmP[s[i]] += 1
                i += 1
                j += 1
        return res
