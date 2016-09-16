class Cdgame:
    def rescount(self, a, b):
        suma = sum(a)
        sumb = sum(b)
        count = set()
        for i in a:
            suma -= i
            for j in b:
                sumb -= j
                suma += j
                sumb += i
                count.add(suma*sumb)
                sumb -= i
                suma -= j
                sumb += j
            suma += i
        return len(set)