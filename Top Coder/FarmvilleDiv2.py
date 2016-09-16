class FarmvilleDiv2:
    def minTime(self, time, cost, budget):
        obj = [(0,0)]*len(time)
        totalTime = 0
        for i in range(len(time)):
            obj[i] = (cost[i], time[i])
            totalTime += time[i]
        obj.sort()
        for (c, t) in obj:
            quotienst = budget//c
            mini = min(quotienst, t)
            budget -= mini*c
            totalTime -= mini
        return totalTime