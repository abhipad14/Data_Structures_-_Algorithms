class DecipherabilityEasy:
    def check(self, s, t):
        si = 0
        ti = 0
        count = 0
        if len(s) - len(t) != 1:
            return 'Impossible'
        while si<len(s) and ti<len(t):
            if s[si] == t[ti]:
                si+=1
                ti+=1
            else:
                count+=1
                si+=1
        if count>1:
            return 'Impossible'
        return 'Possible'
