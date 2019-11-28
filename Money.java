import java.util.*;
class Insufficient extends Exception
{
public String toString()
{
return "Insufficient balance... Cannot process request!";
}
}
class Bank
{
int acno,bal;
String name;
Bank(int a, int b, String n) throws Insufficient
{
acno = a;
name = n;
bal = b;
if(bal<2000)
throw new Insufficient();
}
void deposit(int a)
{
bal = bal+a;
}
void withdraw(int a) throws Insufficient
{
if((bal-a)<2000)
throw new Insufficient();
bal = bal-a;
}
void display()
{
System.out.println("Account number = "+acno);
System.out.println("Name  ="+name);
System.out.println("Balance = "+bal);
}
}
class Money
{
public static void main(String args[])
{
int ch1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the account number");
int a = sc.nextInt();
System.out.println("Enter the name");
String n = sc.next();
System.out.println("Enter the current balance");
int b = sc.nextInt();
try
{
Bank ob = new Bank(a,b,n);
do
{
System.out.println("Enter\n1 to deposit\n2 to withdraw\n3 to display");
int ch = sc.nextInt();
switch(ch)
{
case 1: System.out.println("Enter the amount to be deposited");
	int d = sc.nextInt();
	ob.deposit(d);
	break;
case 2: System.out.println("Enter the amount to be withdrawn");
	int w = sc.nextInt();
	ob.withdraw(w);
	break;
case 3: ob.display();
	break;
default: System.out.println("\nInvalid choice");
}
System.out.println("Enter 1 to exit and any other value to continue");
ch1 = sc.nextInt();
}while(ch1!=1);
}
catch(Insufficient i)
{
System.out.println(i);
}
}
}
