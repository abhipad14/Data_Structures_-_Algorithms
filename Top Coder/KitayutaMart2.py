import math


class KitayutaMart2:
    def numBought(self, K, T):
        i = 0
        count = 0
        while T>0:
            T -= math.pow(2,i)*K
            count += 1
            i += 1
        return count