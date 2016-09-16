class FallingSand:
    def simulate(self, board):
        queue = Queue()
        prev = ['']*len(board)

        for i in range(len(board)):
            prev[i] = list(board[i])

        for i in range(len(prev[0])):
            j = len(prev)-1
            queue.clear()
            while j>=0:
                if board[j][i] == '.':
                    queue.add(j)
                elif board[j][i] == 'x':
                    queue.clear()
                else:
                    if not queue.isEmpty():
                        prev[j][i] = '.'
                        queue.add(j)
                        prev[queue.peek()][i] = 'o'
                        queue.remove()
                j -= 1
        board = list()
        for i in prev:
            board.append(''.join(i))
        return board


class Queue:
    queue = list()
    def add(self, object):
        self.queue.append(object)
    def remove(self):
        self.queue.pop(0)
    def peek(self):
        return self.queue.__getitem__(0)
    def isEmpty(self):
        return len(self.queue)==0
    def size(self):
        return len(self.queue)
    def clear(self):
        self.queue = list()