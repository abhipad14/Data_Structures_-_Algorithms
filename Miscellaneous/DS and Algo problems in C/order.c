#include <stdio.h>
#define MAXLEN 10
void printChar(char c, int times) {
int i;
for (i = 0; i < times; i++)
printf("%c", c);
}
int main() {
/* Buffers to hold 2 words */
char word1[MAXLEN + 1], word2[MAXLEN + 1];
/* The array used for counting sort */
/* Chars can be treated as integers */
int hash[26] = {0};
int i = 0; // Iterator
/* Read both the lines */
scanf("%s", word1);
scanf("%s", word2);
for (i = 0; i < MAXLEN + 1 && word1[i] != '\0'; i++)
hash[word1[i] - 'a']++;
for (i = 0; i < MAXLEN + 1 && word2[i] != '\0'; i++)
hash[word2[i] - 'a']++;
for (i = 0; i < 26; i++)
printChar(i + 'a', hash[i]);
printf("\n");
return 0;
}