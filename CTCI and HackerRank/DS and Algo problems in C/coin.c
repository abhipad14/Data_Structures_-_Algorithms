#include<stdio.h>
int count( int S[], int m, int n )
{
    if (n == 0)
        return 1;
    if (n < 0)
        return 0;
    if (m <=0 && n >= 1)
        return 0;
    return count( S, m - 1, n ) + count( S, m, n-S[m-1] );
}
int main()
{
 int N;
 scanf("%d", &N);
    int arr[] = {1, 5, 3};
    printf("%d\n", count(arr, 3, N));
    return 0;
}