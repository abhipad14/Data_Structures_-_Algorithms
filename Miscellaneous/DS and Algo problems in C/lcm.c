#include<stdio.h>

void main()
{
int n,i,b,max;
int a[10];
int count=2;
printf("\nEnter the Number of Digits:");
scanf("%d",&n);
max=0;
for(i=1;i<=n;i++)
{
	scanf("%d",&a[i]);
	if(a[i]>max)
	{
		max=a[i];
	}
}
b=max;
printf("\n\nmax=%d",b);
for(i=1;i<=n;i++)
{
	if(max%a[i]!=0)
	{
		max=b*count;
		count++;
		i=0;
	}
			
}
printf("\n\nLCM=%d",max);
}
