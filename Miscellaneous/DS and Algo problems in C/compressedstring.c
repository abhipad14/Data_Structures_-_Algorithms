#include<stdio.h>
#include<math.h>

void main()
{
char a[10000],b[100000],ch='o';
int i=0,n,m,j,x,y,z,d;

printf("Enter the number of words in the dictionary:");
scanf("%d", &n);
getchar();
printf("Enter you first word:");
while(1)
{			
	ch = getchar();
	if(ch == '\n')
	{
		break;
	}	
	a[i]=ch;
	i++;	
}
printf("\n\nEnter the rest of the words in the given format:\n");
ch='o';
for(i=1;i<n;i++)
{
	j=0;
	while(1)
	{
		ch=getchar();
		if(ch=='\n')
		{
			break;
		}
		b[j]=ch;
		if(ch==' ')
		m=j;
		j++;
	}
	b[j]='\0';
	x=m-1;
	y=m+1;
	z=0;
	for(j=x;j>=0;j--)
	{
		d=b[j]-'0';
		z=pow(10,x-j)*d+z;
			
	}
	
	for(j=z;b[y]!='\0';j++)
	{
		a[j]=b[y];
		y++;
		
	}
	a[j]='\0';
			
}
for(i=0;1<2;i++)
{
	if(a[i]=='\0')
	break;
	printf("%c",a[i]);
}
}
