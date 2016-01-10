#include<stdio.h>

void main()
{
int a,b,c,x,t;
printf("\n\nEnter a Number:");
scanf("%d",&a);
printf("\n\nEnter a Number:");
scanf("%d",&b);
printf("\n\nEnter a Number:");
scanf("%d",&c);
if (a<b && c==-1)
{
printf("\n\nThe Second Largest Number in the Sequence is %d",a);
}
if(b<a && c==-1)
{
printf("\n\nThe Second Largest Number in the Sequence is %d",b);	
}
while(c!=-1)
{
	if(b>a && a>c)
	{
		t=c;
		x=a;
		c=b;
		b=x;
		a=t;
	}
	if(c>a && a>b)
	{
		t=b;
		x=a;
		c=c;
		b=x;
		a=t;
	}
	if(b>c && c>a)
	{
		t=a;
		x=c;
		c=b;
		b=x;
		a=t;
	}
	if(a>c && c>b)
	{
		t=b;
		x=c;
		c=a;
		b=x;
		a=t;
	}
	if(a>b && b>c)
	{
		t=c;
		x=b;
		c=a;
		b=x;
		a=t;
	}
	a=b;
	b=c;
	printf("\n\nEnter a Number:");
	scanf("%d",&c);
}
printf("\n\nThe second largest number in the sequence is %d",a);
}