#include<stdio.h>

void main()
{
	int a[100][100], i, j,n, temp;
	printf("\n");
	scanf("%d", &n);
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			scanf("%d", &a[i][j]);
		}
	}
	
	for(i=0;i<n;i++)
	{
		for(j=i;j<n;j++)
		{
			temp=a[i][j];
			a[i][j]=a[j][i];
			a[j][i]=temp;
		}
	}
	for(i=0;i<(n/2);i++)
	{
		for(j=0;j<n;j++)
		{
			temp=a[j][i];
			a[j][i]=a[j][n-1-i];
			a[j][n-1-i]=temp;
		}
	}
	printf("\n\n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("%d\t", a[i][j]);
		}
		printf("\n");
	}
}