class Quorum:
    def count(self, arr, k):
        return sum(sorted(arr)[:k])

if __name__ == '__main__':
    obj = Quorum()
    print(obj.count([20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1], 14))