#include<stdio.h>

 void merg (int a[], int i, int j)
{
	int b[1000],mid, x=i, l, k;
	l=i;
	mid=(i+j)*0.5;
	k=mid+1;
	while(i<=mid && k<=j)
	{
		if(a[i]<=a[k])
		{
			b[x]=a[i];
			x++;
			i++;
		}
		else
		{
			b[x]=a[k];
			x++;
			k++;
		}
	}
	if(i>mid)
	{
		while(k<=j)
		{
			b[x]=a[k];
			x++;
			k++;
		}
	}
	if(k>j)
	{
		while(i<=mid)
		{
			b[x]=a[i];
			x++;
			i++;
		}
	}
	for(k=l;k<=j;k++)
	{
		a[k]=b[k];
	}
	
}
 
 void mergsort(int a[], int i, int j)
{
	int mid;
	//printf("\nEntered with i=%d, j=%d", i,j);
	mid=(i+j)*0.5;
	if(i>=j) return;
	else
	{
		mergsort(a,i,mid);
		mergsort(a,mid+1,j);
		merg(a,i,j);
	}
}


void main()
{
	int a[1000],i,n;
	
	printf("\n");
	scanf("%d", &n);
	for(i=0;i<n;i++)
	{
		scanf("%d", &a[i]);
	}
	mergsort(a,0,n-1);
	printf("\n");
	printf("\n");
	printf("\n");
	for(i=0;i<n;i++)
	{
		printf("%d\t", a[i]);
	}
}