package SEE;
import java.util.*;
import CIE.*;
public class External extends Student
{
public int exter[];
public void getdata()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the SEE marks in 5 subjects");
for(int i=0;i<5;i++)
{
exter[i] = sc.nextInt();
}
}
public void display()
{
System.out.println("SEE marks in 5 subjects");
for(int i=0;i<5;i++)
{
System.out.print(exter[i]+" ");
}
System.out.print("\n");
}
}

