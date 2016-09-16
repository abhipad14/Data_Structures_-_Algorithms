def takeInput():
    colonies = [int(i) for i in input().strip().split(', ')]
    obj = BacteriesColony()
    print(obj.performTheExperiment(colonies))


class BacteriesColony:
    def performTheExperiment(self, colonies):
        currcol = list(colonies)
        flag = 1
        while flag:
            flag=0
            for i in range(1, len(currcol)-1):
                if colonies[i] > colonies[i-1] and colonies[i]>colonies[i+1]:
                    currcol[i] -= 1
                    flag = 1
                elif colonies[i] < colonies[i+1] and colonies[i] < colonies[i-1]:
                    currcol[i]+=1
                    flag = 1
            colonies = list(currcol)
        return colonies

if __name__ == '__main__':
    takeInput()