import math

class MulitplicationTable2Easy:
    def isGoodSet(self, t, s):
        dup =set()
        n = int(math.sqrt(len(t)))
        for i in s:
            dup.add(i)
        for i in s:
            for j in s:
                if not(dup.__contains__(t[i*n+j])):
                    return 'Not Good'
        return 'Good'