#include<stdio.h>
#include<stdlib.h>

struct node
{
	int key;
	struct node *next;
};

typedef struct node nod;

nod *head;
nod *tail;

void add(int key)
{
	
	nod *temp=(nod *)malloc(sizeof(nod));
	nod *temptail;	
	if(head->next==NULL)
	{
		temp->key=key;
		temp->next=NULL;
		head->next=temp;
		tail->next=temp;
	}
	else
	{
		temp->key=key;
		temp->next=NULL;
		temptail=tail->next;
		temptail->next=temp;
		tail->next=temp;
	}
}

void print(void)
{
	nod *temp;
	temp=head->next;
	while(temp!=NULL)
	{
		printf("\n%d", temp->key);
		temp=temp->next;
	}
	
}

void reverse(void)
{
	
	nod *current=head->next;
	nod *prev=NULL;
	nod *next;
	while(current!=NULL)
	{
		next=current->next;
		current->next=prev;
		prev=current;
		current=next;
	}
	head->next=prev;	
}

void main()
{
	int key;
	
	head=(nod *)malloc(sizeof(nod));
	head->key=-1;
	head->next=NULL;
	tail=(nod *)malloc(sizeof(nod));
	tail->key=-1;
	tail->next=NULL;
	printf("\n");
	scanf("%d", &key);
		
	while(key!=-1)
	{
		add(key);
		scanf("%d", &key);
	}
	
	reverse();
	print();	
}