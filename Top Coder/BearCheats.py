class BearCheats:
    def eyesight(self, a, b):
        stra = str(a)
        strb = str(b)
        if len(stra) == len(strb):
            count  = 0
            for i in range(len(stra)):
                if stra[i] != strb[i]:
                    count += 1
                if count>1:
                    return 'glasses'
            return 'happy'
        return 'glasses'