#include<stdio.h>
void main()
{
	int num,j,i,kill,save,dead,a[100000];
	printf("Enter the number of prisoners:");
	scanf("%d", &num);
	printf("\nSurviving Prisoner:");
	for (i=0;i<num;i++)
	{
		a[i]=1;		
	}	
	i=0;
	save=1;
	dead =0;
	while(i<num)
	{		
		if(save==1)
		{
			if(a[i]!=0)
			{
				save=0;
				kill=1;				
			}
			i++;
			if(i==num)
			{
				i=0;
			}			
		}
		
		if(kill==1 && num!=1)
		{
			if(a[i]!=0)
			{
				a[i]=0;
				kill=0;
				dead++;
				save=1;				
			}			
			i++;
			if(i==num)
			{
				i=0;
			}			
		}
		
		if (dead==num-1)
		{
			i=num+1;
		}		
	}
	for(j=0;j<num;j++)
	{
		if(a[j]==1)
			printf("%d", j+1);	
	}	
}