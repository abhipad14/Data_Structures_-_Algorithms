class PalindromePrime:
    def count(self, l, r):
        count = 0
        for i in range(l, r+1):
            if self.isPalindrome(i):
                if self.isPrime(i):
                    count += 1
        return count

    def isPrime(self, n):
        string = str(n)
        length =len(string)
        for i in range(length):
            if string[i] != string[len(string)-1-i]:
                return 0
        return 1

    def isPalindrome(self, n):
        string = str(n)
        length = len(string)//2
        for i in range(length):
            if string[i] != string[len(string)-1-i]:
                return 0
        return 1
