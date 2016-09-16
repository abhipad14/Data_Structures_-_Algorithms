def takeInput():
    h= [int(i) for i in input().strip().split(' ')]
    s=[i for i in input().strip().split(' ')]
    obj = LiveConcert()
    print(obj.maxHappiness(h, s))

class LiveConcert:
    def maxHappiness(self, h, s):
        map = {}
        for i in range(len(s)):
            if map.__contains__(s[i]):
                map[s[i]] = max(map[s[i]], h[i])
            else:
                map[s[i]] = h[i]
        ans = 0
        for value in map.values():
            ans += value
        return ans

if __name__ == '__main__':
    takeInput()