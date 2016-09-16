class NonDeterministicSubstring:
    def ways(self, A, B):
        lena = len(A)
        lenb = len(B)
        if lena < lenb:
            return 0
        substr = set()
        for i in range(lena - lenb + 1):
            substr.add(A[i:i+lenb])
        if lena == lenb:
            substr.add(A)
        count = 0
        for i in substr:
            flag = 1
            for j in range(lenb):
                if B[j] != '?':
                    if i[j] != B[j]:
                        flag = 0
            if flag:
                count += 1
        return count


if __name__ == '__main__':
    obj = NonDeterministicSubstring()
    print(obj.ways("11", "01"))