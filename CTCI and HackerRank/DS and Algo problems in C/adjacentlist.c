#include<stdio.h>
#include<stdlib.h>

struct element 
{
	int key;
	struct element *list;
};

typedef struct element ele;

ele *head;
ele *tail;

int insert(int value, int num)
{
	int i;
	ele *temp1, *temp2;
	for(i=0;i<num+1;i++)
	{
		temp1=head+i;
		if(temp1->key==value)
		{
			return i;
		}
		if(temp1->key==-1)
		{			
			temp1->key=value;
			temp1->list=NULL;
			temp2=tail+i;
			temp2->list=temp1;
			return i;
		}		
	}
}


void add2list(int value, int position)
{
	ele *temp, *temp2;
	temp=(ele *)malloc(sizeof(ele));
	temp->key=value;
	temp->list=NULL;
	temp2=tail+position;
	temp2=temp2->list;
	temp2->list=temp;
	temp2=tail+position;
	temp2->list=temp;
}


void print(ele *current)
{
	while(current!=NULL)
	{
		printf("\n%d", current->key);
		current=current->list;
	}
}


void main()
{
	int num, n, i,j, vertex1, vertex2;
	ele *temp;

	printf("\n");
	scanf("%d", &num);
	head=(ele *)malloc((num+1)*sizeof(ele));
	if(head==NULL)
	{
		printf("\nNOT ENOUGH MEMORY");
		exit(1);
	}
	tail=(ele *)malloc((num+1)*sizeof(ele));
	if(tail==NULL)
	{
		printf("\nNOT ENOUGH MEMORY");
		exit(1);
	}
	
	
	for(i=0;i<num+1;i++)
	{
		temp=head+i;
		temp->key=-1;
		temp->list=NULL;
		temp=tail+i;
		temp->key=-1;
		temp->list=NULL;
	}
	
	for(i=0;i<num;i++)
	{
		scanf("%d", &vertex1);
		j=insert(vertex1, num);
		scanf("%d", &vertex2);
		add2list(vertex2,j);
		j=insert(vertex2, num);
		add2list(vertex1,j);
	}
	
	scanf("%d", &n);
	j=insert(n, num);
	temp=head+j;
	temp=temp->list;
	print(temp);
	free(head);
	free(tail);
}