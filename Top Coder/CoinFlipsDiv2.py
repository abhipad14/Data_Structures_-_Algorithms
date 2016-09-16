class CoinFlipsDiv2:
    def countCoins(self, string):
        count = 0
        for i in range(len(string)):
            value = string[i]
            if len(string)==1:
                return  0
            if value == 'H':
                if i ==0:
                    if string[i+1]=='T':
                        count+=1
                elif i == len(string) - 1:
                    if string[i - 1] == 'T':
                        count += 1
                else:
                    if string[i + 1] == 'T' or string[i - 1] == 'T':
                        count += 1
            else:
                if i == 0:
                    if string[i + 1] == 'H':
                        count += 1
                elif i == len(string) - 1:
                    if string[i - 1] == 'H':
                        count += 1
                else:
                    if string[i + 1] == 'H' or string[i - 1] == 'H':
                        count += 1
        return count
