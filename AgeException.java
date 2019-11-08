import java.util.*;
class WrongAge extends Exception
{
public String toString()
{
return "Exception found in age";
}
}
class Father
{
int fage;
Father(int a) throws WrongAge
{
if(a<0)
{
throw new WrongAge();
}
fage = a;
}
}
class Son extends Father
{
int sage;
Son(int a, int b) throws WrongAge
{
super(a);
if(b<0)
throw new WrongAge();
if(a<(b+21))
throw new WrongAge();
sage = b;
}
void display()
{
System.out.println("Faher's age = "+fage+" years");
System.out.println("Son's age = "+fage+" years");
}
}
class AgeException
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter father's age");
int a = sc.nextInt();
System.out.println("Enter son's age");
int b = sc.nextInt();
try
{
Son s = new Son(a,b);
s.display();
}
catch(WrongAge w)
{
System.out.println(w);
}
}
}


