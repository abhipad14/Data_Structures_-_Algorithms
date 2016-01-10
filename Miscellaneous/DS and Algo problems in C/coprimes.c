#include<stdio.h>
int gcd(int a, int b)
{
int r=1;
while(r!=0)
{
	r=a%b;
	if(r!=0)
	{
		a=b;
		b=r;
	}
}
return b;
}
void main()
{
int count=0, n, x, i;
printf("\n\nEnter the Number of digits:");
scanf("%d",&n);
for (i=1;i<=n;i++)
{
	x=gcd(n,i);
	if(x==1)
	{
		count++;
	}

}
printf("\n\nTotal Number of Co-Primes = %d",count);
}