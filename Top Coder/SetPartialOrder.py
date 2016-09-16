from collections import Counter

def takeINput():
    t = int(input().strip())
    obj = SetPartialOrder()
    ans = ["LESS","GREATER","INCOMPARABLE","EQUAL","EQUAL","INCOMPARABLE","INCOMPARABLE","INCOMPARABLE","EQUAL","INCOMPARABLE","INCOMPARABLE","INCOMPARABLE","INCOMPARABLE","INCOMPARABLE","INCOMPARABLE","GREATER","INCOMPARABLE","INCOMPARABLE","EQUAL","EQUAL","INCOMPARABLE","GREATER","LESS","INCOMPARABLE","INCOMPARABLE","INCOMPARABLE","GREATER","INCOMPARABLE","LESS","INCOMPARABLE","INCOMPARABLE","INCOMPARABLE","INCOMPARABLE","INCOMPARABLE","INCOMPARABLE","GREATER","INCOMPARABLE"]
    flag = 0
    for i in range(t):
        x = [int(i) for i in input().strip().split(',')]
        y = [int(i) for i in input().strip().split(',')]
        returnedvalue = obj.compareSets(x, y)
        if ans[i] != returnedvalue:
            print("Failed expected ", ans[i] , " but was ", returnedvalue, " for index ", (i+1))
            flag = 1
    if flag:
        print("Failed")
    else:
        print("Passed")

class SetPartialOrder:
    def compareSets(self, x, y):
        setx = Counter(x)
        sety = Counter(y)
        if len(set(setx.items())^set(sety.items())) == 0:
            return 'EQUAL'
        elif self.isLess(x, y):
            return 'LESS'
        elif self.isLess(y, x):
            return 'GREATER'
        else:
            return 'INCOMPARABLE'

    def isLess(self, x, y):
        setx = Counter(x)
        sety = Counter(y)
        if set(setx.items()).issubset(set(sety.items())):
            return 1
        else:
            return 0


if __name__ == '__main__':
    takeINput()