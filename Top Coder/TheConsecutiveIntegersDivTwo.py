def takeInput():
    numbers = [int(i) for i in input().strip().split(', ')]
    k = int(input().strip())
    obj = TheConsecutiveIntegersDivTwo()
    print(obj.find(numbers, k))


class TheConsecutiveIntegersDivTwo:
    def find(self, numbers, k):
        numbers = list(numbers)
        numbers.sort()
        if k==1:
            return 0
        count  = 0
        for i in range(len(numbers)-1):
            if i ==0:
                count = abs(numbers[i]-numbers[i+1])-1
            else:
                count = min(abs(numbers[i]-numbers[i+1])-1, count)
        return count


if __name__ == '__main__':
    takeInput()