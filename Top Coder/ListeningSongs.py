class ListeningSongs:
    def listen(self, duration1, duration2, minutes, T):
        duration1 = list(duration1)
        duration2 = list(duration2)
        duration1.sort()
        duration2.sort()
        minutes *= 60
        i = 0
        if T>len(duration1) or T>len(duration2):
            return -1
        while i<T:
            minutes -= duration1[i]
            minutes-=duration2[i]
            i+=1
            if minutes<0:
                return  -1
        count = 2*T
        j = i
        flag = 0
        while i<len(duration1) and j<len(duration2) and minutes>0:
            if duration1[i] < duration2[j] and minutes>0:
                minutes -= duration1[i]
                count += 1
                i += 1
            elif duration1[i] >duration2[j] and minutes>0:
                minutes-=duration2[j]
                count+=1
                j+=1
            else:
                minutes-=duration1[i]
                count+=1
                i+=1
                if minutes<0:
                    continue
                minutes-=duration2[j]
                count+=1
                j+=1
        while i<len(duration1) and minutes>0:
            minutes-=duration1[i]
            count+=1
            i+=1
        while j<len(duration2) and minutes>0:
            minutes-=duration2[j]
            count+=1
            j+=1
        if minutes<0:
            count-=1
        return  count