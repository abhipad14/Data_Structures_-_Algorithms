#include<stdio.h>

void main()
{
	int i,num, a[9],index=0, value=10;
	for(i=0;i<9;i++)
	{
		a[i]=value;
		value--;
	}
	
	num=1009;
	i=0;
	
	while(num<10000 && a[i]>1)
	{
		if(num%a[i]==(a[i]-1))
		{
			i++;
			
			if(i==8)
			{
				i=0;
				printf("%d\n", num);
				num=num+10;
			}
		}
		else
		{
			
			num=num+10;
			i=0;
		}
	}
	
}