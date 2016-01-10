#include<stdio.h>

void main()
{
char a[65],ch;
int i,j,k,x,l;

printf("\n\nEnter the string:");

for(i=1;ch!='\n';i++)
{
	scanf("%c", &ch);
	if(ch!='\n')
	a[i]=ch;
}

l=i-2;

if(l%2==0)
{
x=(64-l)/2;
k=1;
for(j=1;j<=64;j++)
{
	if(j<(x+1) || j>(x+l))
	printf("_");
	else
	{
		printf("%c",a[k]);
		k=k+1;
	}
}
}

if(l%2==1)
{
x=0.5*(64-l)+0.5;
k=1;
for(j=1;j<65;j++)
{
	if(j<(x+1) || j>(x+l))
	printf("_");
	else
	{
		printf("%c",a[k]);
		k=k+1;
	}
}
}


}





