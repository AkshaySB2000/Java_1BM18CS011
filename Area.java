import java.util.*;
abstract class TwoD
{
protected int l,b;
protected float area;
void getdata()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st dimension");
l = sc.nextInt();
System.out.println("Enter 2nd dimension");
b = sc.nextInt();
}
abstract float calculate();
void display()
{
System.out.println("Area = "+calculate());
}
}
class Rectangle extends TwoD
{
float calculate()
{
area = l*b;
return area;
}
}
class Triangle extends TwoD
{
float calculate()
{
area = (l*b)/2;
return area;
}
}
class Area
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter\n1 for rectangle\nAnything else for triangle");
int n = sc.nextInt();
TwoD ref;
if(n==1)
ref = new Rectangle();
else 
ref = new Triangle();
ref.getdata();
ref.calculate();
ref.display();
}
}

