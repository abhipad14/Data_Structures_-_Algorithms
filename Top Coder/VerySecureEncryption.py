class VerySecureEncryption:
    def encrypt(self, message, key, k):
        message = list(message)
        length = len(message)
        for i in range(k):
            newMessage = ['']*length
            for j in range(length):
                newMessage[key[j]] = message[j]
            for j in range(length):
                message[j] = newMessage[j]
        return ''.join(message)
