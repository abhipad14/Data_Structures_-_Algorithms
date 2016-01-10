#include<stdio.h>

void main()
{
	char a[1000];
	int i, num ,j;
	
	printf("\n");
	scanf("%s", &a);
	
	for(i=0;1<2;i++)
	{
		if(a[i]=='\0')
		{
			break;
		}
	}
	
	num=i-1;
	
	for(i=0;1<2;i++)
	{
		j=num-i;
		if(a[i]!=a[j] || i==j)
		{
			break;
		}
	}
	printf("\n");
	i--;
	j--;
	if(i==j)
	{
		printf("%s", a);
	}
	else
	{
		for(j=0;j<=i;j++)
		{
			printf("%c", a[j]);
		}
	}
}