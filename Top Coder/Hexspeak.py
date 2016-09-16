class Hexspeak:
    def decode(selfself, ciphertext):
        hexval = hex(int(ciphertext))[2:]
        ans = ''
        for i in hexval:
            if i >= '2' and i<='9':
                return 'Error!'
            else:
                if i == '1':
                    ans += 'I'
                elif i == '0':
                    ans += 'O'
                else:
                    ans += i
        return ans.upper()

if __name__ == '__main__':
    print(Hexspeak().decode(257))