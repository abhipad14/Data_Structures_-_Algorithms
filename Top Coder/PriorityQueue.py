def takeInput():
    order = input().strip()
    annoyanceFactor = [int(i) for i in input().strip().split(' ')]
    obj = PriorityQueue()
    print(obj.findAnnoyance(order, annoyanceFactor))

class PriorityQueue:
    def findAnnoyance(self, order, annoyanceFactor):
        totalDispleasure = 0
        displeasure = [0] * len(order)
        for i in range(len(order)):
            if order[i] == 'b':
                for j in range(i):
                    displeasure[j] += annoyanceFactor[j]
                    totalDispleasure += annoyanceFactor[j]
        return totalDispleasure

if __name__ == '__main__':
    takeInput()

