#include<stdio.h>
#include<math.h>

void main()
{
	int j,i,num,count=0, a[1000], x, y;
	
	printf("\n");
	scanf("%d", &num);
	for(i=0;i<num;i++)
	{
		scanf("%d", &a[i]);
	}
	
	for(i=0;i<num;i++)
	{
		for(j=i+1;j<num;j++)
		{
			x=pow(a[i], a[j]);
			y=pow(a[j], a[i]);
			if(x>y)
			{
				count++;
			}
				
		}
	}
	printf("\n%d", count);
}