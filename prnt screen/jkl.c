#include<stdio.h>
int main()
{
 int n,d=0,i,j;
 printf("Enter number :");
 scanf("%d",&n);
 for(i=1;i<=n;i++)
 {
  while(n%i==0)
   {
    j=d++;
   }
  if(j==2)
   {
	   printf("prime");
   }
  else
  {
	  printf("NOt prime");
  }
 }
 return 0;
}
