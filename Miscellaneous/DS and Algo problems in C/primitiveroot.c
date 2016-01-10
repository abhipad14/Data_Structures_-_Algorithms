#include<stdio.h>
#include<math.h>
void main()
{
	int n,p,a[10000],i,arr[10000];
	
	scanf("%d", &n);
	scanf("%d", &p);
	
	for(i=1;i<p;i++)
	{
		
			a[i]=pow(n,i);
			a=a%p;
			arr[a]=a;
		
	}
	for(i=1;i<p;i++)
	{
		if(arr[i]!=i)
		{
			printf("\n%d", i);
			break;
		}
	}
	if(i==p)
		printf("\nYes");
}