#include<stdio.h>
#include<stdlib.h>

struct element
{
	int key;
	int in;
	int out;
	struct element *next;
};

typedef struct element ele;
ele *head;

void addele(ele *start, int value, int flag)
{
	ele *temp, *temp2;
	temp2=start->next;
	temp=(ele *)malloc(sizeof(ele));
	if(temp2==NULL)
	{
		temp->key=value;
		start->next=temp;
		if(flag==0)
		{
			temp->out=1;
			temp->in=0;
		}
		if(flag==1)
		{
			temp->in=1;
			temp->out=0;
		}
		temp->next=NULL;
	}
	else if(temp2!=NULL)
	{
		if(temp2->key==value)
		{
			if(flag==0)
			{
				temp2->out=(temp2->out)+1;
			}
			if(flag==1)
			{
				temp2->in=(temp2->in)+1;
			}
		}
		else
		{
			addele(temp2, value, flag);
		}
	}
}



void main()
{
	int vertex1, vertex2, i, num, min=2147483647, diff;
	head=(ele *)malloc(sizeof(ele));
	head->key=-1;
	head->in=0;
	head->out=0;
	head->next=NULL;
	printf("\n");
	scanf("%d", &num);
	
	for(i=0;i<num;i++)
	{
		scanf("%d", &vertex1);
		addele(head, vertex1, 0);
		scanf("%d", &vertex2);
		addele(head, vertex2, 1);
	}
	
	while(head!=NULL)
	{
		diff=abs((head->in)-(head->out));
		if(diff!=0)
		{
			if((head->key)<min)
			{
				min=head->key;
			}
		}
		head=head->next;
	}
	if(min==2147483647)
	{
		printf("\nYES");
	}
	else
	{
		printf("\n%d\n", min);
	}
}
