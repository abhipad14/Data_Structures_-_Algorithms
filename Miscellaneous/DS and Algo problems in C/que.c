#include<stdio.h>
#include<stdlib.h>
int *front=NULL, *end=NULL;
void add(int value, int a[])
{
	if(end>front)
	{
		if((end-front)==9)
		{
			printf("\nARRAY IS FULL");
			return;
		}
			
	}
	if(end<front)
	{
		if(front-end==1)
		{
			printf("\nARRAY IS FULL");
			return;
		}
			
	}
	if(end==a+99)
	{
		*end=value;
		end=a;
	}
	else
	{
		*end=value;
		end=end+1;
	}
}


void delete (void)
{
	*front=-1;
	front=front+1;
}

void main()
{
	int i,a[10], n, value;
	
	printf("\n");
	scanf("%d", &n);
	
	for(i=0;i<n;i++)
	{
		scanf("%d", &a[i]);
	}
	front=a;
	end=a+i;
	
}