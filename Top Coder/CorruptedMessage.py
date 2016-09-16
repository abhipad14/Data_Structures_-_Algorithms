from collections import Counter

class CorruptedMessage:
    def reconstructMessage(self, s, k):
        count = Counter(s)
        char = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
        for i in char:
            if count.__contains__(i):
                charcount =count[i]
                if len(s)-charcount==k:
                    ans = [i] * len(s)
                    return ''.join(ans)
        for i in char:
            if not count.__contains__(i):
                ans = [i]*len(s)
                return ''.join(ans)
