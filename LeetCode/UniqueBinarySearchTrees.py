class Solution(object):
    def numTrees(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n <= 1:
            return 1
        count = [0]*(n+1)
        count[0] = 1
        count[1] = 1
        for i in range(2, n+1):
            for j in range(i):
                index = i-j-1
                count[i] += count[j] * count[i-j-1]
        return count[n]


if __name__ == '__main__':
    obj = Solution()
    print(obj.numTrees(3))