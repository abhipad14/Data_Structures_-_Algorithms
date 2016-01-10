#include<stdio.h>

void printsubarray(char *a, int S,int E)
{
	
int i;

for(i=S;i<=E;i++)
{
	printf("%c", a[i]);
}

}


void main()
{

char a[10000],ch;
int i,s,e;

printf("\n\nEnter a string:");

for(i=0;ch!='\n';i++)
{
	scanf("%c", &ch);
	a[i]=ch;
}

printf("\n\nEnter the start index:");
scanf("%d", &s);
printf("\n\nEnter the end index:");
scanf("%d", &e);

printsubarray(a, s, e);

}
