class Solution:
    def isValid(self, s: str) -> bool:
        dict_s = {'(':')', '[':']', '{':'}'}
        stack = []
        for c in s:
            if c in "({[":
                stack.append(c)
            elif stack and dict_s.get(stack[-1]) == c:
                stack.pop()
            else:
                return False
        return len(stack) == 0
        
