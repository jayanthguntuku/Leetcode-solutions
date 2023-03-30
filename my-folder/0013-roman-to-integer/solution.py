class Solution:
    def romanToInt(self, s: str) -> int:
        val = 0
        di = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000,}
        i=0
        while(i < len(s)-1):
            if(di[s[i]]<di[s[i+1]]):
                val+=di[s[i+1]]-di[s[i]]
                i+=2
            else:
                val+=di[s[i]]
                i+=1
        if(i==len(s)-1):
            val+=di[s[i]]
        return val

