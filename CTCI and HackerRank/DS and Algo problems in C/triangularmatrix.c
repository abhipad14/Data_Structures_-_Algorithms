#include<stdio.h>

void main()
{
int m,l,n,i,j,k,a;

printf("\nEnter the size of the matrix:");
scanf("%d",&n);

for(i=1;i<=n;i++)
{
	printf("\nEnter elements row %d of the matrix separated by a space:",i);
	for(j=1;j<=n;j++)
	{
		scanf("%d",&a);
		if(j>i && a!=0)
		{
			l=1;
			break;
		}
		if(j<i && a!=0)
		{
			m=1;
		}
	}
	
}

if (l==1 && m==1)
{
	printf("\nNO\n");
}
else
{
printf("\nYES\n");
}
}