class ParenthesesDiv2Medium:
    def correct(self, s):
        stack = []
        index = []
        for i in range(len(s)):
            if s[i] == '(':
                stack.append((s[i], i))
            else:
                if len(stack) == 0:
                    index.append(i)
                    stack.append(('(', i))
                else:
                    stack.pop()
        while len(stack) !=0 :
            i, j = stack.pop()
            index.append(j)
            stack.pop()
        return index

if __name__ == '__main__':
    obj = ParenthesesDiv2Medium()
    print(obj.correct(")()()()()()("))