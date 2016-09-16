class Quacking:
    def quack(self, s):
        q = ['q', 'u', 'a', 'c', 'k']
        m = {'q':list(), 'u':list(), 'a':list(), 'c':list(), 'k':list()}
        count = 0
        kremoved = list()
        for i in range(len(s)):
            if s[i] == 'q':
                m[s[i]].append(i)
            elif s[i] == 'u':
                m[s[i]].append(i)
                for j in range(len(q)-4):
                    if len(m[q[j]]) < len(m[s[i]]):
                        return -1
            elif s[i] == 'a':
                m[s[i]].append(i)
                for j in range(len(q) - 3):
                    if len(m[q[j]]) < len(m[s[i]]):
                        return -1
            elif s[i] == 'c':
                m[s[i]].append(i)
                for j in range(len(q) - 2):
                    if len(m[q[j]]) < len(m[s[i]]):
                        return -1
            else:
                m[s[i]].append(i)
                for j in range(len(q) - 1):
                    if len(m[q[j]]) < len(m[s[i]]):
                        return -1
                first = 0
                last = 0
                for k in range(len(q)):
                    if k == 0:
                        first = m[q[k]][0]
                    elif k == len(q) - 1:
                        last = m[q[k]][0]
                    m[q[k]].pop(0)
                if len(kremoved) > 0:
                    if kremoved[0] > first:
                        count+= 1
                    else:
                        kremoved.pop(0)
                else:
                    count += 1
                kremoved.append(last)
        for i in range(len(q)):
            if len(m[q[i]]) != 0:
                return -1
        if count>0:
            return count
        else:
            return -1


if __name__ == '__main__':
    obj = Quacking()
    print(obj.quack("quackqauckquack"))