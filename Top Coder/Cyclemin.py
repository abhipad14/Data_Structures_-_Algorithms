class Cyclemin:
    def bestmod(self, s, k):
        t=[]
        for i in range(len(s)):
            t.append(s[i:]+s[:i])
        k2=k
        derp=[]
        for asdf in t:
            k =k2
            m=[j for j in asdf]
            for i in range(len(m)):
                if m[i]!='a' and k>=1:
                    m[i] = 'a'
                    k-=1
            derp.append(''.join(m))
        return min(derp)