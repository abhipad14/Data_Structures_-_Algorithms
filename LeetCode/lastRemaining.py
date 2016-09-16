class Solution(object):
    def lastRemaining(self, n):
        """
        :type n: int
        :rtype: int
        """
        count = [0] * n
        left = 1
        right = 0
        flagcount = 0
        while flagcount < n-1:
            if left:
                counter = 1
                for i in range(n):
                    if count[i] == 0:
                        if counter %2 == 1 and flagcount < n-1:
                            count[i] = 1
                            flagcount += 1
                        counter += 1
                right = 1
                left = 0
            if flagcount == n-1:
                break
            if right:
                counter = 1
                for i in range(n-1, -1, -1):
                    if count[i] == 0:
                        if counter %2 == 1 and flagcount < n-1:
                            count[i] = 1
                            flagcount += 1
                        counter += 1
                right = 0
                left = 1
        for i in range(n):
            if count[i] == 0:
                return i+1


if __name__ == '__main__':
    obj = Solution()
    print(obj.lastRemaining(3785))