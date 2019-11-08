package CIE;
import java.util.*;
public class Student
{
public String usn;
public String name;
public int sem;
public void getdata()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the USN");
usn = sc.next();
System.out.println("Enter the name");
name = sc.next();
System.out.println("Enter the semester");
sem = sc.nextInt();
}
public void display()
{
System.out.println("USN = "+usn);
System.out.println("Name = "+name);
System.out.println("Semester = "+sem);
}
}
