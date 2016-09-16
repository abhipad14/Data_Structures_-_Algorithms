class EightRooks:
    def isCorrect(self, board):
        if self.check(board, 0) and self.check(board, 1):
            return 'Correct'
        else:
            return 'Incorrect'

    def check(self, board, column):
        totalCount = 0
        for i in range(8):
            count = 0
            for j in range(8):
                if column:
                    if board[j][i] == 'R':
                        count += 1
                        totalCount += 1
                else:
                    if board[i][j] == 'R':
                        count += 1
                        totalCount += 1
            if count > 1:
                return 0
        if totalCount == 8:
            return 1
        else:
            return 0