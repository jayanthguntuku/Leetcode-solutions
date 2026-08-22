class Solution:
    def apply_op(self, a, b, op):
        if op == "+":
            return a + b
        elif op == "-":
            return a - b
        elif op == "*":
            return a * b
        elif op == "/":
            return int(a / b)

    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        operators = ["+","-","*","/"]
        for x in tokens:
            if x  not in operators:
                stack.append(int(x))
            else:
                op = x
                b = stack.pop()
                a = stack.pop()
                stack.append(self.apply_op(a, b, op))
        return stack.pop()
