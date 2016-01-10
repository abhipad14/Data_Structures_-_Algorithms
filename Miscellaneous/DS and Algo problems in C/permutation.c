#include<stdio.h>
void main()
{
	int i,N, A[1000],arr[1000], small=0, big=0, diff=0, count=0, a=0, b=0;
	printf("\n");
	scanf("%d", &N);
	for(i=0;i<N;i++)
	{
		scanf("%d", &A[i]);
	}
    for(i=0;i<N;i++)
    {
        arr[i]=0;
    }
    for(i=0;i<N;i++)
    {
        if(i==0)
		{
			small=A[i];
		}
		else if(A[i]<small)
		{
			small=A[i];
		}
        if(A[i]>big)
        {
            big=A[i];
        }
    }
	printf("\nBIG=%d, SMALL=%d", big, small);
    diff=big-small;
    for(i=0;i<N;i++)
    {
        a=big-A[i];
		a=diff-a;
        b=arr[a];
        arr[a]=b+1;
        if(arr[a]==1)
        {
            count=count+1;
        }
        if(arr[a]>1)
        {
            break;
        }
    }
    if(count==(diff+1))
    {
        printf("\n%d", 1);
    }
    else
    {
        printf("\n%d", 0);
    }
}