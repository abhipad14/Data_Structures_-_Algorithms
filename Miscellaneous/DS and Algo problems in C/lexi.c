#include<stdio.h>

void main()
{
int n,x,flag=0,i,j,k,m,b[100],a[100],z,c,d,e;

printf ("\n\nEnter the max number of digits:");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
	printf("\n\nEnter the element number %d:",i);
	scanf("%d",&a[i]);
}
e=n;
for(i=(n-1);(i>=1) && flag!=1;i--)
{

	for(j=i+1;j<=n;j++)
	{
		if(!(a[i]<a[j]))
		{
			d=a[i];
			e=i;
			m=1;
			for(k=i;k<=n;k++)
			{
				b[m]=a[k];
				m++;
			}
			flag=1;
			break;		
		}
		
	}
	if(flag==1)
	{
	for(i=1;i<=m-1;i++)
	{
		for(j=i+1; j<=m-1; j++)
		{
			if(b[i]<b[j])
			{
			x=b[i];
			b[i]=b[j];
			b[j]=x;
			}
		}
	}

	for (i=1;i<=m-1;i++)
	{
		if(b[i]==d)
		{
		z=b[i+1];
		c=i+1;
		break;
		}	
	}
	for(i=c;i>=2;i--)
	{
		b[i]=b[i-1];
	}
	b[1]=z;
	}
}
if(e==n)
{
	for(i=1;i<=n;i++)
	{
	printf("%d\t",a[i]);
	}
}
if(e!=n)
{
	for(i=1;i<=n && i<e;i++)
	{
		printf("%d\t",a[i]);
	}
	for(i=1;i<=m-1;i++)
	{
		printf("%d\t",b[i]);
	}
}
}
