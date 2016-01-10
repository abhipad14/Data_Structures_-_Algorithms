#include<stdio.h>
#include<math.h>
void main()
{
int n, sum=0, i;
printf("Enter a number:");
scanf("%d", &n);
for (i=1;i<=n;i++)
{
	sum=sum+i*i*i*i;
}
printf("\nSum of Powers=%d",sum);
}