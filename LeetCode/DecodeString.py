class Solution(object):
    def decodeString(self, s):
        """
        :type s: str
        :rtype: str
        """
        stack = list()
        l = len(s)
        i = l -1
        currNum = 0
        actualStr = ''
        lookForNum = False
        end = 0
        start = 0
        bracketStack = list()
        count = 0
        while i >=0:
            if lookForNum:
                if ord(s[i]) >= ord('0') and ord(s[i]) <= ord('9'):
                    start = i
                    currNum = -1
                    i -= 1
                else:
                    currNum = int(s[start:end])
                    stack.append(actualStr*currNum)
                    stack.append('[')
                    count = 0
                    actualStr = ''
                    lookForNum = False
                continue
            if s[i] == ']':
                stack.append(']')
            elif s[i] == '[':
                stack.append('[')
                bracketStack.append('[')
                flag = True
                stackStr = ''
                while flag:
                    currChar = stack.pop()
                    if currChar == ']':
                        bracketStack.pop()
                        if len(bracketStack) == 0:
                            flag = False
                            stack.append(']')
                    else:
                        if currChar is not '[':
                            stackStr += currChar
                        else:
                            count += 1
                            if count>1:
                                bracketStack.append('[')


                actualStr = stackStr
                lookForNum = True
                end = i
            else:
                stack.append(s[i])
            i-=1
        currString = ''
        actualStr = ''
        if currNum == -1:
            actualStr += stackStr*int(s[start:end])
        while len(stack) > 0:
            currChar = stack.pop()
            if currChar is not '[' and currChar is not ']':
                currString += currChar
        actualStr += currString
        return str(actualStr)


if __name__ == '__main__':
    obj = Solution()
    print(obj.decodeString("sd2[f2[e]g]i"))