#include<stdio.h>


void main()
{
	int A[1000], X, N, output, i, len,arr[100],a,count, b=0;;
	
	count=0;
    a=0;
	printf("\n");
	scanf("%d", &X);
	scanf("%d", &N);
	
	for(i=0;i<N;i++)
	{
		scanf("%d", &A[i]);
	}
	for(i=0;i<X;i++)
    {
        arr[i]=0;
    }
    for(i=0;i<N;i++)
    {
        a=A[i];
        b=arr[a-1];
        arr[a-1]=b+1;
        if(arr[a-1]==1)
        {
            count=count+1;   
        }
        if(count==X)
        {
            break;
        }
    }
	printf("\n%d and time=%d", count, i);
    if(count==X) 
    {
        printf("\ntime=%d", i);
    }
    else
     {
          printf("\ntime=%d", -1);
     }
}