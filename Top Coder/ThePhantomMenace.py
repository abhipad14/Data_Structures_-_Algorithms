class ThePhantomMenace:
    def find(self, doord, droids):
        maxValue = -1
        minEd = 0
        for i in doord:
            count = 0
            for j in droids:
                if count == 0:
                    minEd = abs(j-i)
                    count +=1
                else:
                    minEd = min(minEd, abs(i-j))
            maxValue = max(maxValue, minEd)
        return maxValue