#include<stdio.h>

int colatz(int a, int i)
{
	if(a==1)
		return i;
	if(a%2==0)
	{
		a=a/2;
	}
	else
	{
		a=3*a+1;
	}
	i++;
	return colatz(a, i);
		
}
void main()
{
	int n, count=0;
	printf("\n\nEnter a number:");
	scanf("%d", &n);
	count=colatz(n, count);
	printf("\n\n%d", count);
}
	