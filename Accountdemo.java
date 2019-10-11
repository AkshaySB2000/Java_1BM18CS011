import java.util.*;
class Account
{
String name;
int acno;
String type;
float bal,dep,with;
void getdata()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name");
name = sc.next();
System.out.println("Enter the account number");
acno = sc.nextInt();
System.out.println("Enter the type of account");
type = sc.next();
System.out.println("Enter the available balance");
bal = sc.nextFloat();
}
void display()
{
System.out.println("Balance available in the account = "+bal);
}
void deposit()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the amount to be deposited");
dep = sc.nextFloat();
bal = bal+dep;
System.out.println("Updated balance = "+bal);
}
void withdrawal()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the withdrawal amount");
with = sc.nextFloat();
bal = bal-with;
System.out.println("Updated balance = "+bal);
}
void compound(){}
void minbalance(){}
}
class Savings extends Account
{
float ci;
void compound()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the rate of interest");
int r = sc.nextInt();
System.out.println("Enter the time period");
int t = sc.nextInt();
ci = (float)(bal*(Math.pow((1+r/100),t)));
bal = bal+ci;
System.out.println("Updated balance = "+bal);
}
}
class Current extends Account
{
float sc;
void minbalance()
{
if(bal<5000)
{
sc = (float)0.05*bal;
System.out.println("Service charge to be paid within this month = "+sc);
}
}
}
class Accountdemo
{
public static void main(String args[])
{
Account ref = null;
int ch2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter\n1 for savings account\n2 for current account");
int ch = sc.nextInt();
switch(ch)
{
case 1: { ref = new Savings();
	  ref.getdata();
	  ref.compound();
	  do
	  {
	  System.out.println("\nEnter\n1 to deposit\n2 to withdraw\n3 to display balance");
	  int ch1 = sc.nextInt();
	  switch(ch1)
	  {
	  case 1 : { ref.deposit();
	   	     break; }
	  case 2 : { ref.withdrawal();
		     break; }
	  case 3 : { ref.display();
		     break; }
	  default: System.out.println("Enter valid option");
	  }
	  System.out.println("Enter 1 to exit and any value to continue");
	  ch2 = sc.nextInt();
	  }while(ch2!=1); 
	  break;
	}
case 2: { ref = new Current();
	  ref.getdata();
	  ref.minbalance();
	  do
	  {
	  System.out.println("\nEnter\n1 to deposit\n2 to withdraw\n3 to display balance");
	  int ch1 = sc.nextInt();
	  switch(ch1)
	  {
	  case 1 : { ref.deposit();
	   	     break; }
	  case 2 : { ref.withdrawal();
		     break; }
	  case 3 : { ref.display();
		     break; }
	  default: System.out.println("Enter valid option");
	  }
	  System.out.println("Enter 1 to exit and any value to continue");
	  ch2 = sc.nextInt();
	  }while(ch2!=1);
	  break;
	}
default: System.out.println("Invalid choice");
}
}
}



