package Databank;
import java.util.*;
public class Databank
{
String name;
double bal,add,sub,accno;
Scanner s=new Scanner(System.in);
public void getdata()
{
System.out.println("Enter User name:");
name=s.nextLine();
System.out.println("Enter Account number:");
accno=s.nextDouble();
System.out.println("Enter Total balance:");
bal=s.nextDouble();
}
public void addmoney()
{
System.out.println("Enter the amount to be added:");
add=s.nextDouble();
bal=bal+add;
System.out.println("The Current balance is:"+bal);
}
public void withdraw()
{
System.out.println("Enter the amount to be Withdrawn:");
sub=s.nextDouble();
bal=bal-sub;
System.out.println("The current balanc is:"+bal);
}
public void displaybal()
{
System.out.println("The current balance is:"+bal);
}
}
		
		

