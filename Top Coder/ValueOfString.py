class ValueOfString:
    def findValue(self, s):
        count=[0]*26
        sum=[0]*26
        val = 0
        for i in s:
            index = ord(i)-ord('a')
            count[index]+=1
        for i in range(26):
            if i==0:
                sum[i]=count[i]
            else:
                sum[i]+=sum[i-1]+count[i]
        for i in s:
            order = ord(i)-ord('a')+1
            val+=order*sum[order-1]
        return val