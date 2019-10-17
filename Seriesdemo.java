import java.util.*;
abstract class Series
{
int a,d,n;
abstract void getdata();
abstract void getnterm();
abstract void getsum();
}
class AP extends Series
{
void getdata()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first term");
a = sc.nextInt();
System.out.println("Enter common difference");
d = sc.nextInt();
System.out.println("Enter the number of terms/value of n");
n = sc.nextInt();
}
void getnterm()
{
int nt = a+((n-1)*d);
System.out.println("The "+n+"th term of the AP = "+nt);
}
void getsum()
{
float sum = (float)0.5*(n*((2*a)+((n-1)*d)));
System.out.println("The sum of "+n+" terms of the AP = "+sum);
}
}
class GP extends Series
{
void getdata()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first term");
a = sc.nextInt();
System.out.println("Enter common ratio");
d = sc.nextInt();
System.out.println("Enter the number of terms/value of n");
n = sc.nextInt();
}
void getnterm()
{
int nt = (int)(a*(Math.pow(d,(n-1))));
System.out.println("The "+n+"th term of the GP = "+nt);
}
void getsum()
{
float sum = (int)(a*(Math.pow(d,n)-1))/(d-1);
System.out.println("The sum of "+n+" terms of the GP = "+sum);
}
}
class Seriesdemo
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the total number of series");
int n = sc.nextInt();
Series s[] = new Series[n];
for(int i=0;i<n;i++)
{
s[i] = null;
System.out.println("Enter\n1 for AP\n2 for GP");
int ch = sc.nextInt();
switch(ch)
{
case 1: s[i] = new AP();
	break;
case 2: s[i] = new GP();
	break;
default: System.out.println("Invalid choice");
}
s[i].getdata();
s[i].getnterm();
s[i].getsum();
}
}
}
