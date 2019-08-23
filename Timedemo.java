import java.util.*;
class Time
{
int h,m,s;
Time()
{
h=0;
m=0;
s=0;
}
Time(int a, int b, int c)
{
h=a;
m=b;
s=c;
}
void currenttime(int a, int b, int c)
{
h=a;
m=b;
s=c;
}
void advance(int p,int q, int r)
{
s=s+r;
m=m+q+(s/60);
s=s%60;
h=h+p+(m/60);
m=m%60;
h=h%24;
}
void print()
{
System.out.println("Hours = "+h);
System.out.println("Minutes = "+m);
System.out.println("Seconds = "+s);
}
}
class Timedemo
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
while(true)
{
System.out.println("Enter your choice");
System.out.println("1 to enter current time using default constructor");
System.out.println("2 to enter currentt time using parameterized constructor");
System.out.println("3 to advance time");
int n = sc.nextInt();
switch(n)
{
case 1:{ Time t=new Time();
         System.out.println("Enter hours,minutes and seconds");
         int h=sc.nextInt();
         int m=sc.nextInt();
         int s=sc.nextInt();
         t.currenttime(h,m,s);
         t.print();
         break;
       }  
case 2:{ System.out.println("Enter hours,minutes and seconds");
         int h=sc.nextInt();
         int m=sc.nextInt();
         int s=sc.nextInt();
         Time t=new Time(h,m,s);
         t.print();
         break; 
       }
case 3:{ System.out.println("Enter hours,minutes and seconds");
         int h=sc.nextInt();
         int m=sc.nextInt();
         int s=sc.nextInt();
         Time t=new Time(h,m,s);
         t.print();
         System.out.println("Enter hours, minutes and seconds to advance time by");
         int x=sc.nextInt();
         int y=sc.nextInt();
         int z=sc.nextInt();
         t.advance(x,y,z);
         t.print();
         break;
         }
}
System.out.println("Enter y to continue and n to exit");
char ch=sc.next().charAt(0);
if(ch=='n' && ch=='N');
break;
}
}
}



