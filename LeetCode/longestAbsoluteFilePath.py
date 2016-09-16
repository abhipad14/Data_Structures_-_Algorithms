class Solution(object):
    def lengthLongestPath(self, input):
        """
        :type input: str
        :rtype: int
        """
        maxlen = 0
        pathlen = {0: 0}
        for line in input.splitlines():
            name = line.lstrip('\t')
            depth = len(line) - len(name)
            if '.' in name:
                maxlen = max(maxlen, pathlen[depth] + len(name))
            else:
                pathlen[depth + 1] = pathlen[depth] + len(name) + 1
        return maxlen


if __name__ == '__main__':
    obj = Solution()
    print(obj.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"))