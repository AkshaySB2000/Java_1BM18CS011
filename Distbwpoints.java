import java.util.*;
class Point
{
int x,y;
Point()
{
x=0;
y=0;
}
Point(int x,int y)
{
this.x=x;
this.y=y;
}
Point(Point p)
{
x=p.x;
y=p.y;
}
double distance(Point p)
{
return (Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)));
}
}
class Distbwpoints
{
public static void main(String args[])
{
Point p1=new Point();
System.out.println("Enter coordinates of point 2");
Scanner se=new Scanner(System.in);
int a=se.nextInt();
int b=se.nextInt();
System.out.println("Enter coordinates of point 4");
int i=se.nextInt();
int j=se.nextInt();
Point p2=new Point(a,b);
Point p3=new Point(p2);
Point p4=new Point(i,j);
double D1=p2.distance(p4);
System.out.println("Distance between p2 and p4 is :  " +D1);
double D2=p3.distance(p4);
System.out.println("Distance between p3 and p4 is :  " +D2);
System.out.println("The distances are equal");
}
}
