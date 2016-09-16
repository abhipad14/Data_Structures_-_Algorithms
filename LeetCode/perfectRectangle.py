class Solution(object):
    def isRectangleCover(self, rectangles):
        cornerMap = {}
        subArea = 0
        x1, y1 = (0, 0)
        x2, y2 = (0, 0)
        for i in range(len(rectangles)):
            blX, blY = (rectangles[i][0], rectangles[i][1])
            trX, trY = (rectangles[i][2], rectangles[i][3])
            tlX, tlY = (rectangles[i][0], rectangles[i][3])
            brX, brY = (rectangles[i][2], rectangles[i][1])
            subArea += (trX-blX) * (trY - blY)
            if i == 0:
                x1, y1 = (blX, blY)
                x2, y2 = (trX, trY)
            else:
                x1, y1 = min((blX, blY), (x1, y1))
                x2, y2 = max((trX, trY), (x2, y2))
            if cornerMap.__contains__((blX, blY)):
                cornerMap[(blX, blY)] += 1
            else:
                cornerMap[(blX, blY)] = 1
            if cornerMap.__contains__((tlX, tlY)):
                cornerMap[(tlX, tlY)] += 1
            else:
                cornerMap[(tlX, tlY)] = 1
            if cornerMap.__contains__((brX, brY)):
                cornerMap[(brX, brY)] += 1
            else:
                cornerMap[(brX, brY)] = 1
            if cornerMap.__contains__((trX, trY)):
                cornerMap[(trX, trY)] += 1
            else:
                cornerMap[(trX, trY)] = 1
        maxArea = (y2-y1) * (x2-x1)
        if maxArea != subArea:
            return False
        if not cornerMap.__contains__((x1, y1)):
            return False
        else:
            cornerMap[(x1, y1)] += 1
        if not cornerMap.__contains__((x1, y2)):
            return False
        else:
            cornerMap[(x1, y2)] += 1
        if not cornerMap.__contains__((x2, y1)):
            return False
        else:
            cornerMap[(x2, y1)] += 1
        if not cornerMap.__contains__((x2, y2)):
            return False
        else:
            cornerMap[(x2, y2)] += 1

        for val in cornerMap.values():
            if val % 2 == 1:
                return False

        return True


if __name__ == '__main__':
    obj = Solution()
    print(obj.isRectangleCover([[0,0,2,2],[1,1,3,3],[2,0,3,1],[0,3,3,4]]))