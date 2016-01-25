#include<stdio.h>

void main()
{
	char a[50],ch;
	int i,j,len, flag;
	printf("Enter a number:");
	for(i=0;ch!='\n';i++)
	{
		scanf("%c", &ch);
		if(ch!='\n')
		a[i]=ch;
	}
	i--;
	len =i;
	printf("%d\n\n", i);
	printf("Indian System:");
	for(j=0;j<i;j++)
	{
		printf("%c", a[j]);
		if((len-3)%2==1)
		{
			len++;
			printf(",");
			flag=1;
		}
		else 
		{
			if(flag==1 && j<i-3 && j%2==0)
				printf(",");
			else if(j%2==1 && j<i-3)
				printf(",");
				
		}
	}
	
}