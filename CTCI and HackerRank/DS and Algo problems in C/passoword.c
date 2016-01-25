#include<stdio.h>

void main()
{
	char a[100],s[100],ch,temp;
	int k,i=0,len=0,count=0,key, total,j,num=1;
	
	printf("\n");
	scanf("%c", &ch);
	while(ch!='\n')
	{
		a[i]=ch;
		i++;
		scanf("%c", &ch);
	}
	a[i]='\0';
	i=0;
	while(a[i]!='\0')
	{
		if(a[i]=='-')
		{
			count++;
		}
		else
		{
			len++;
		}
		
		i++;
	}
	scanf("%d", &k);
	if(count==0)
	{
		for(i=0;i<len;i++)
		{
			temp=a[i];
			if(!((temp>='0') && (temp<='9')))
			{
				if((temp>='a')&&(temp<='z'))
				{
					temp=temp-('a'-'A');
				}
			}
			s[i]=temp;
		}
		s[i]='\0';
	}
	else
	{
		if(k>=((count+len)/k))
		{
			printf("\nNOT POSSIBLE");
		}
		else
		{
			total=len+count-1;
			j=0;
			for(i=0;i<=total;i++)
			{
				if(a[i]!='-')
				{
					s[j]=a[i];
					j++;
				}
			}
			key=0;
			for(i=total;i>=0;i--)
			{
				if((key==k) && (num<=count))
				{
					temp='-';
					key=-1;
					num++;
				}
				else
				{
					temp=s[j-1];
					j--;
					if(!((temp>='0') && (temp<='9')))
					{
						if((temp>='a')&&(temp<='z'))
						{
							temp=temp-('a'-'A');
						}
					}
					
				}
				
				s[i]=temp;
				key++;
			}
			s[total+1]='\0';
			
		}
	}
	printf("%d\n", count);
	printf("\n%s", s);
	
	
}