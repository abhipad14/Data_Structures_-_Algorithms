def takeInput():
    nextLevel = [int(i) for i in input().strip().split(',')]
    obj = DevuAndGame()
    print(obj.canWin(nextLevel))


class DevuAndGame:
    def canWin(self, nextLevel):
        visited = set()
        i = 0
        visited.add(i)
        count = 0
        while count <= len(nextLevel):
            i = nextLevel[i]
            count += 1
            if visited.__contains__(i):
                return '"Lose"'
            else:
                if i == -1:
                    return '"Win"'
                else:
                    visited.add(i)
        return '"Lose"'


if __name__ == '__main__':
    takeInput()