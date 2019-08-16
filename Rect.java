import java.util.*;
class Rectangle
{
int l;
int b;
double area;
void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the length and width");
l = sc.nextInt();
b = sc.nextInt();
}
void area()
{
area=(double)l*b;
}
void output()
{
System.out.println("Length of rectangle = "+l);
System.out.println("Width of rectangle = "+b);
System.out.println("Area of rectangle = "+area);
}
}
class Rect
{
public static void main(String args[])
{
Rectangle r1 = new Rectangle();
Rectangle r2 = new Rectangle();
System.out.println("First Rectangle");
r1.input();
r1.area();
r1.output();
System.out.println("\nSecond Rectangle");
r2.input();
r2.area();
r2.output();
}
}



