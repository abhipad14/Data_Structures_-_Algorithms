from collections import Counter

class PeacefulLine:
    def makeLine(self, x):
        count = Counter(x)
        if len(x)%2==0:
            limit = len(x)//2
        else:
            limit =len(x)//2+1
        for val in count.values():
            if val >limit:
                return 'impossible'
        return 'possible'
