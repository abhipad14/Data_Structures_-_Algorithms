from collections import Counter

class Solution(object):
    def longestSubstring(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: int
        """
        maxLen = 0
        charCount = Counter(s)
        charMoreK = set()
        for (key, count) in charCount.items():
            if count >= k:
                charMoreK.add(key)
        if len(charMoreK) > 0:
            fptr = 0
            sptr = 0
            uniqueCharCount = dict()
            charAtleastK = set()
            while sptr < len(s):
                if charMoreK.__contains__(s[sptr]):
                    if uniqueCharCount.__contains__(s[sptr]):
                        value = uniqueCharCount[s[sptr]]
                        value += 1
                        uniqueCharCount[s[sptr]] = value
                        if value >= k:
                            charAtleastK.add(s[sptr])
                    else:
                        uniqueCharCount[s[sptr]] = 1
                        value = 1
                        if value >= k:
                            charAtleastK.add(s[sptr])
                else:
                    if len(uniqueCharCount) == len(charAtleastK) and len(uniqueCharCount)>0:
                        maxLen = max(maxLen, (sptr-fptr))
                    else:
                        consecCount = 1
                        prevChar = None
                        currChar = None
                        for i in range(fptr, sptr):
                            currChar = s[i]
                            if i == fptr:
                                prevChar =  currChar
                            else:
                                if currChar == prevChar:
                                    consecCount += 1
                                else:
                                    consecCount = 1
                                    prevChar = currChar
                            if consecCount >= k:
                                maxLen = max(maxLen, consecCount)
                        uniqueCharCount.clear()
                        charAtleastK.clear()
                    fptr = sptr
                sptr += 1
            if len(uniqueCharCount) == len(charAtleastK):
                if fptr == 0:
                    maxLen = sptr
                else:
                    maxLen = max(maxLen, (sptr-fptr-1))
        return maxLen


if __name__ == '__main__':
    obj = Solution()
    print(obj.longestSubstring("aaabbbcdefcdefcde", 3))