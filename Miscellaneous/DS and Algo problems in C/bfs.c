#include<stdio.h>
int a[20][20], level[20], count=0, que[20], r=0, r1=0;
char color[20];


void bsf(int vertex, int n)
{
	int i;
	while(vertex!=0 && vertex!=-1)
	{
		
		if(level[vertex-1]<0)
		{
			level[vertex-1]=count;
		}
		
		count++;
	
		for(i=0;i<n;i++)
		{
			
			if(a[vertex-1][i]==1 && color[i]=='w')
			{
				
				color[i]='g';
				level[i]=count;
				que[r]=i+1;
				r++;
			}
		}
		vertex=que[r1];
		r1++;
	}
	
}


void main()
{
	int n, i,j, vertex;
	printf("\n");
	scanf("%d", &n);
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			scanf("%d", &a[i][j]);
		}
	}
	for(i=0;i<n;i++)
	{
		level[i]=-1;
		color[i]='w';
		que[i]=-1;
	}
	
	
	printf("\n\n");
	scanf("%d", &vertex);
	
	color[vertex-1]='g';
	bsf(vertex, n);
	printf("\n\nVISITED VERTEX ARE:\n");
	i=0;
	while(que[i]!=0 && que[i]!=-1)
	{
		
		printf("%d\t", que[i]);
		i++;
	}
}

