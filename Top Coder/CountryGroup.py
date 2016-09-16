class CountryGroup:
    def solve(self, a):
        curr = 0
        count = 0
        con = 0
        for i in range(len(a)):
            curr=a[i]
            if i==0:
                curr=a[i]
                count=1
            else:
                if curr !=a[i-1]:
                    if count%a[i-1]==0:
                        con+=count//a[i-1]
                        count=1
                    else:
                        return -1
                else:
                    count+=1
        if count%a[i-1]==0:
            con+=count//a[i-1]
        else:
            return -1
        return con