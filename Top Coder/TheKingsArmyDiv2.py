def takeInput():
    state = [i for i in input().strip().split(',')]
    obj = TheKingsArmyDiv2()
    print(obj.getNumber(state))


class TheKingsArmyDiv2:
    def getNumber(self, state):
        isH = 0
        for i in range(len(state)):
            for j in range(len(state[i])):
                if state[i][j]!='S':
                    isH = 1
                    if i+1 <len(state):
                        if state[i+1][j] == 'H':
                            return 0
                    if i-1 > 0:
                        if state[i-1][j] == 'H':
                            return 0
                    if j+1<len(state[i]):
                        if state[i][j+1] == 'H':
                            return 0
                    if j-1>0:
                        if state[i][j-1] == 'H':
                            return 0
        if isH:
            return 1
        return 2


if __name__ == '__main__':
    takeInput()