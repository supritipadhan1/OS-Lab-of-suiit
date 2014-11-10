#include<stdio.h>
#include<math.h>
int main ()
{
int a,b,c;
float x,y,d;
printf("enter the value of a,b,c");
scanf("%d%d%d",&a,&b,&c);
d=(pow(b,2))-4*a*c;
if (d<=0)
{
	printf("no real root exist");
}
else (d>=0)
{
printf("there are real roots");
x=(-b(sqrt(d)))/2*a;
y=(-b(-sqrt(d)))/2*a;
printf("the root is %d",x);Z
printf("the root is %d",y);
 
}
return 0;
}  






































