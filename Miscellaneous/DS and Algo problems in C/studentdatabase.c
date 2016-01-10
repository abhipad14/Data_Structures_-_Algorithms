#include<stdio.h>
#include<stdlib.h>

struct studentinfo
{
	char name[128];
	int p,c,m;
	struct studentinfo *left, *right;
};

typedef struct studentinfo student;

student *newnode(int phy, int cem, int mat, char nav[])
{
	int j;
	student *temp =(student *)malloc(sizeof(student));
	temp->p=phy;
	temp->c=cem;
	temp->m=mat;
	for(j=0;1<2;j++)
	{
		if(nav[j]!='\0')
		temp->name[j]=nav[j];
		else
		{
			temp->name[j]='\0';
			break;
		}
	}
	temp->left=NULL;
	temp->right=NULL;
	return temp;
}

student *insert(int phy, int cem, int mat, char nav[], student *root)
{
	int j;
	if(root==NULL)
	{
		return newnode(phy,cem,mat,nav);
	}
	if(phy< root->p)
	{
		root->left=insert(phy,cem,mat,nav, root->left);
	}
	if(phy>root->p)
	{
		root->right=insert(phy,cem,mat,nav, root->right);
	}
	if(phy==root->p)
	{
		if(cem< root->c)
		{
			root->left=insert(phy,cem,mat,nav, root->left);
		}
		if(cem>root->c)
		{
			root->right=insert(phy,cem,mat,nav, root->right);
		}
		if(cem==root->c)
		{
			if(mat< root->m)
			{
				root->left=insert(phy,cem,mat,nav, root->left);
			}
			if(mat>root->m)
			{
				root->right=insert(phy,cem,mat,nav, root->right);
			}
			if(mat==root->m)
			{
				for(j=0;1<2;j++)
				{
					if(nav[j]!=root->name[j])
					{
						if(nav[j]<root->name[j])
						{
							root->left=insert(phy,cem,mat,nav, root->left);
							break;
						}
						if(nav[j]>root->name[j])
						{
							root->right=insert(phy,cem,mat,nav, root->right);
							break;
						}
					}
				}
			}
		}
	}
	return root;
}

void inorder(student *root)
{
	if(root!=NULL)
	{
		inorder(root->left);
		printf("%s\t", root->name);
		printf("%d\t", root->p);
		printf("%d\t", root->c);
		printf("%d\n", root->m);
		inorder(root->right);
	}
}

void main()
{
	int num, i,p,c,m;
	char nav[128];
	student *student1=NULL;
	
	printf("Enter the number of students:\n");
	scanf("%d", &num);
	for(i=0;i<num;i++)
	{
		scanf("%s", nav);
		scanf("%d", &p);
		scanf("%d", &c);
		scanf("%d", &m);
		if(i==0)
		{
			student1=insert(p,c,m,nav, student1);
		}
		else
		{
			insert(p,c,m,nav, student1);
		}
	}
	printf("\n\nSorted List is:\n\n");
	inorder (student1);
}