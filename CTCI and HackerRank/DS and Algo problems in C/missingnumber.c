#include<stdio.h>

void main()
{
int n,i,a,b;

printf("\nEnter the number:");
scanf("%d",&n);
a=n*(n+1)*0.5;
for(i=1;i<=(n-1);i++)
{
scanf("%d",&b);
a=a-b;
}
printf("\n\nThe missing number is:%d",a);
}