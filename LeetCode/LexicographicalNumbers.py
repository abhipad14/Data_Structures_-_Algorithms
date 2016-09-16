class Solution(object):
    def lexicalOrder(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        num = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
        order = list()
        for i in num:
            if i is not '0':
                self.addNumbers(i, n, order, num)
        return order

    def addNumbers(self, start, limit, order, num):
        if int(start) <= limit:
            order.append(int(start))
            for i in num:
                temp = start
                temp = start+i
                if self.addNumbers(temp, limit, order, num)==0:
                    break
            return 1
        else:
            return 0


if __name__ == '__main__':
    obj = Solution()
    print(obj.lexicalOrder(23489))