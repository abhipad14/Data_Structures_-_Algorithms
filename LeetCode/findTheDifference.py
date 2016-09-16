from collections import Counter

class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        tmap = Counter(t)
        for i in s:
            if tmap.__contains__(i):
                val = tmap[i]
                val -= 1
                if val == 0:
                    tmap.__delitem__(i)
                else:
                    tmap[i] = val
            else:
                return i
        for key in tmap.keys():
            return key