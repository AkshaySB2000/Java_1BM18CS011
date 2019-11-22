import java.util.*
class Insufficient extends Exception
{
public String toString()
{
return "Insufficient balance";
}
class Bank
{
int acno,bal;
String name;
Bank(int a, int b, String n) throws Insufficient
{
name = n;

bal = b;
if(bal<2000)
throw new Insufficient();
}
void 
void deposit(int a)
{
bal = bal+a;
}
void withdraw(int a) throws Insufficient
{
bal = bal-a;
if(bal<2000)
throw new Insufficient();
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
case 1: printf("Enter the amount to be deposited");
	int d = sc.nextInt();
	ob.deposit(d);
	break;

