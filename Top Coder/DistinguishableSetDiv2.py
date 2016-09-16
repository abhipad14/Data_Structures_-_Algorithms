import math


class DistinguishableSetDiv2:
    def count(self, answer):
        n, m = len(answer), len(answer[0])
        ans = 0
        for i in range(int(math.pow(2, m))):
            binary = ''.join(bin(i)[2:].zfill(m))
            strset = set()
            flag = 1
            for j in range(n):
                subset = list()
                for k in range(len(binary)):
                    if binary[k] == '1':
                        subset.append(answer[j][k])
                if strset.__contains__(''.join(subset)):
                    flag = 0
                    break
                else:
                    strset.add(''.join(subset))
            if flag:
                ans+=1
        return ans