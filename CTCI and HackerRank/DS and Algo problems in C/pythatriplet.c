#include<stdio.h>
void main()
{
int a,b,c;
printf("Please Enter Your First Number:");
scanf("%d",&a);
printf("\nPlease Enter Your Second Number:");
scanf("%d",&b);
printf("\nPlease Enter Your Third Number:");
scanf("%d",&c);  
if (a>b && a>c)
 {
  if (a*a==b*b+c*c)
   {
   printf("\nThe Given Triplet is pythagorean.");
   }
  else
   {
   printf("\nThe Given Triplet is not pythagorean.");
   }
 }
if (b>a && b>c)
 {
  if (b*b==a*a+c*c)
   {
   printf("\nThe Given Triplet is pythagorean.");
   }
  else
   {
   printf("\nThe Given Triplet is not pythagorean.");
   }
 }
if (c>a && c>b)
 {
  if (c*c==b*b+a*a)
   {
   printf("\nThe Given Triplet is pythagorean.");
   }
  else
   {
   printf("\nThe Given Triplet is not pythagorean.");
   }
 }

}
