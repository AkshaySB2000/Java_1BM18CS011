package CIE;
import java.util.*;
public class Internal extends Student
{
public int inter[];
public Internal()
{
inter = new int[5];
}
public void getdata()
{
super.getdata();
Scanner sc = new Scanner(System.in);
System.out.println("Enter CIE marks in 5 subjects");
for(int i=0;i<5;i++)
{
inter[i] = sc.nextInt();
}
}
public void display()
{
super.display();
System.out.println("CIE marks in 5 subjects: ");
for(int i=0;i<5;i++)
{
System.out.print(inter[i]+" ");
}
System.out.print("\n");
}
}





