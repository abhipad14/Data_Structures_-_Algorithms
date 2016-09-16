class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        countSet = dict()
        delItem = set()

        for i in range(len(s)):
            if countSet.__contains__(s[i]):
                countSet.__delitem__(s[i])
                delItem.add(s[i])
            elif not delItem.__contains__(s[i]):
                countSet[s[i]] = i

        if len(countSet) == 0:
            return -1
        count = 0
        minIndex = -1
        for index in countSet.values():
            if count == 0:
                minIndex = index
                count += 1
            else:
                minIndex = min(minIndex, index)
        return  minIndex

if __name__ == '__main__':
    obj = Solution()
    print(obj.firstUniqChar("aadadaad"))