class BearPasswordAny:
    wordset = ['a', 'b']
    def findPassword(self, x):
        val = self.getWord("", len(x), self.wordset, x)
        if val is not None:
            return ''.join(val)
        else:
            return ''

    def check(self, password, l, x):
        for i in range(len(x)):
            subl = i + 1
            count = 0
            for j in range(len(password) - i):
                substr = password[j:j + subl]
                if len(set(substr)) == 1:
                    count += 1
            if count != x[i]:
                return 0
        return 1

    def getWord(self, pword, l, wordset, x):
        if len(pword) == l:
            if self.check(pword, l, x):
                return pword
            else:
                return None
        else:
            for i in wordset:
                newpass = list(pword)
                newpass.append(i)
                val = self.getWord(newpass, l, wordset, x)
                if val is not None:
                    return val
                else:
                    continue


if __name__ == '__main__':
    obj = BearPasswordAny()
    print(obj.findPassword([5,4,2,1,0]))