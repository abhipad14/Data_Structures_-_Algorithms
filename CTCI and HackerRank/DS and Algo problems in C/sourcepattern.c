#include<stdio.h>

void main()
{
char ch=0,a[100000],b[100000];
int i,j,k,l,count=0;

printf("\n\nEnter the source string:");
j=1;
k=1;
for(i=1;(i>0 && ch!='\n');i++)
{
	scanf("%c", &ch);
	a[i]=ch;
	j++;
}

printf("\n\nEnter the patern string:");

ch=0;
for (i=1;(i>0 && ch!='\n');i++)
{
	scanf("%c", &ch);
	b[i]=ch;
	k++;
}

for(i=1;i<j-1;i++)
{
	
		for (l=1;l<k-1;l++)
		{
			if(a[i+l-1]!=b[l])
			break;
		}
		if(l==k-1)
		count=count+1;
	
}

printf("\n\nOccurance=%d",count);
}
