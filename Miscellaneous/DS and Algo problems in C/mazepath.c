#include<stdio.h>

int maze_path(int i, int j, int n, int num, int mat[][50])
{
	if(mat[i][j]==0)
	{
		return num;
	}
	if(i==n-1 && j==n-1)
	{
		num++;
	}	
	else
	{
		num=maze_path(i, j+1, n, num, mat);
		num=maze_path(i+1, j, n, num, mat);
	}
	return num;
	
}

void main()
{
	int a[50][50], count,n,row, column, i, j;
	/*printf("Enter the size of the matrix:");*/
	scanf("%d", &n);
	/*printf("\n\nEnter the elements of the matrix:\n");*/
	for (i=0;i<n;i++)
		for(j=0;j<n;j++)
			scanf("%d", &a[i][j]);
	row=0;
	column=0;
	count=0;
	count=maze_path(row,column,n,count, a);
	if(count>0)
	{
		printf("\n\nPossible in %d different ways", count);
	}
	else
	{
			printf("\n\nNot Possible");
	}
	
}

