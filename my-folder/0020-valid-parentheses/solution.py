class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        di = {'(':')','{':'}','[':']',}
        for i in s:
            if i in '({[':
                stack.append(i)
            else:
                if(len(stack)!=0 and di[stack.pop()]== i):
                    continue
                else:
                    return False
        return len(stack)==0

