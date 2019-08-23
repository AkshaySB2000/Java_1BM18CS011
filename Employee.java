import java.util.*;
class Emp
{
int num;
String name;
float basic,da,it,nsal,gsal;
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the employee number");
num=sc.nextInt();
System.out.println("Enter the employee's name");
name=sc.next();
System.out.println("Enter the basic salary of the employee");
basic=sc.nextFloat();
}
void netsal()
{
da=basic*(3/4);
gsal=basic+da;
it=gsal*(3/10);
nsal=gsal-it;
}
void output()
{
System.out.println("Employee number = "+num);
System.out.println("Employee name = "+name);
System.out.println("Employee's basic salary = "+basic);
System.out.println("DA of employee = "+da+" and IT of employee = "+it);
System.out.println("Employee's net salary = "+nsal);
}
}
class Employee
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of employees");
int n = sc.nextInt();
for(int i=0;i<n;i++)
{
Emp e = new Emp();
e.input();
e.netsal();
e.output();
}
}
}
