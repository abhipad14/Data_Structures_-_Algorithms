def takeInput():
    t = int(input().strip())
    ans = [58553796517,44872705826,17241564509,27752117992,6812570629,11478650984,9375959261,14395858131,9298074745,7520357050,0,1,1,1,1,2,2,1,2,2,0,1,1,99999999901,99999999899,11000001,8888886666,6,5,6,1,2,1,70,0,0,0,0,100000000000,99999999997,151920,2,99999996568,99999999998,1111111111,1,9999988624,10000000000,100000000,1,1,99999997769,10000000000,100000000000,11,1]
    obj = Dubs()
    flag = 0
    for i in range(t):
        L, R = input().strip().split(',')
        L, R = int(L), int(R)

        returnval = obj.count(L, R)
        if returnval != ans[i]:
            print("Failed for L = ", L, " R = " , R, " expected ", ans[i], " Received " ,returnval)
            flag = 1
    if flag:
        print("Failed")
    else:
        print("Passed")



class Dubs:
    def count(self, L, R):
        if L%100 != 0:
            hh = (L//100 + 1 ) * 100
        else:
            hh = L
        if R//100 == 0:
            lh = 0
        else:
            lh = (R//100) * 100
        if hh > lh:
            return self.getDubs(L,R)
        else:
            if L%100 == 0:
                L = 100
            else:
                L = self.getLastTwoDigits(L)
            if R%100 == 0:
                R = 0
            else:
                R = self.getLastTwoDigits(R)
            diff = lh-hh
            return self.getDubs(L, 100) + self.getDubs(1, R) + 10*(diff//100)


    def getDubs(self, l, r):
        count = 0
        for i in range(l, r+1):
            rem1 = i%10
            i = i//10
            rem2 = i%10
            if rem1 == rem2:
                count+=1
        return count


    def getLastTwoDigits(self, num):
        numstr = str(num)
        if len(numstr) <= 2:
            return int(numstr)
        else:
            return int(numstr[len(numstr)-2:])


if __name__ == '__main__':
    takeInput()