class BichromeBoard:
    def ableToDraw(self, board):
        newBoard = ['']*len(board)
        count  = 0
        for i in board:
            newBoard[count] = list(i)
            count+=1
        if self.fillboard(newBoard, 'W') or self.fillboard(newBoard, 'B'):
            return 'Possible'
        else:
            return 'Impossible'

    def fillboard(self, board, color):
        colormap = {'W':'B', 'B':'W'}
        curr = color
        for i in range(len(board)):
            for j in range(len(board[i])):
                if board[i][j] == '?':
                    board[i][j] == curr
                else:
                    if board[i][j] == colormap[curr]:
                        return 0
                    else:
                        board[i][j] = curr
                curr = colormap[curr]
            if len(board[i])%2==0:
                curr = colormap[curr]
        return 1