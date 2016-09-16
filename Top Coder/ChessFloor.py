class ChessFloor:
    def minimumChanges(self, floor):
        minValue = 20*20*20
        for i in range(26):
            for j in range(26):
                if i!=j:
                    minValue = min(minValue, self.getMin(floor, i, j))
                    minValue= min(minValue, self.getMin(floor, j, i))
        return  minValue

    def getMin(self, floor, a, b):
        curr = a
        if len(floor)%2==0:
            curr=b
        count = 0
        for i in range(len(floor)):
            if len(floor)%2==0:
                if curr ==a:
                    curr = b
                else:
                    curr = a
            for j in range(len(floor)):
                charVal = ord(floor[i][j])-ord('a')
                if charVal!=curr:
                    count+=1
                if curr == a:
                    curr = b
                else:
                    curr=a
        return count