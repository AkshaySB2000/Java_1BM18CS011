import java.util.*;
class Account
{
String name;
int cno,bal;
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter name");
name = sc.nextLine();
System.out.println("Enter the customer number");
cno = sc.nextInt();
System.out.println("Enter the bank balance");
bal = sc.nextInt();
}
void output()
{
System.out.println("\nName of Customer: "+name);
System.out.println("Customer number: "+cno);
System.out.println("Bank balance of Customer: "+bal);
}
}
class Savings extends Account
{
int rate,time;
void input()
{
super.input();
Scanner sa = new Scanner(System.in);
System.out.println("Enter the rate of interest");
rate = sa.nextInt();
System.out.println("Enter the time period");
time = sa.nextInt();
}
float si()
{
return(bal*rate*time/100);
}
void output()
{
super.output();
System.out.println("Rate of interest: "+rate);
System.out.println("Time Period: "+time+" years");
System.out.println("Interest Amount: "+si());
}
}
class Bank
{
public static void main(String args[])
{
Savings s = new Savings();
s.input();
s.output();
}
}

