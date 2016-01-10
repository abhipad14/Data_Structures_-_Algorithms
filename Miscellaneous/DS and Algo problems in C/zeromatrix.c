#include<stdio.h>

void main()
{
	int i,j,n,a[100][100],r[100],c[100];
	
	printf("\n");
	scanf("%d", &n);
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			scanf("%d", &a[i][j]);
			if(a[i][j]==0)
			{
				r[i]=1;
				c[j]=1;
			}
		}
	}
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(r[i]==1 || c[j]==1)
			{
				a[i][j]=0;
			}
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