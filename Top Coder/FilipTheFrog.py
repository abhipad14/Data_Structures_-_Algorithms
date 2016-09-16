class FilipTheFrog:
    def countReachableIslands(self, position, L):
        start = position[0]
        position = list(position)
        position.sort()
        count = 0
        index = 0
        for i in range(len(position)):
            if position[i] == start:
                index = i
                count += 1
                break
        prev = start
        for i in range(index+1, len(position)):
            if position[i] <= prev+L:
                count += 1
                prev = position[i]
            else:
                break
        prev = start
        for i in range(index-1, -1, -1):
            if position[i] >= prev - L:
                count += 1
                prev = position[i]
            else:
                break
        return count

