import java.util.*;
class Person
{
String name;
String address;
int age;
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("\nEnter the name");
name = sc.next();
System.out.println("Enter the age");
age = sc.nextInt();
System.out.println("Enter the address");
address = sc.next();
}
void display()
{
System.out.println("\nName = "+name);
System.out.println("Age = "+age);
System.out.println("Address = "+address);
}
}
class Student extends Person
{
int rno,sem;
void input()
{
super.input();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the roll number");
rno = sc.nextInt();
System.out.println("Enter the semester");
sem  =sc.nextInt();
}
void display()
{
super.display();
System.out.println("Roll number = "+rno);
System.out.println("Semester = "+sem);
}
}
class Exam extends Student
{
int m1,m2;
void input()
{
super.input();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the marks in 2 subjects");
m1 = sc.nextInt();
m2 = sc.nextInt();
}
float average()
{
return (float)(m1+m2)/2;
}
void display()
{
super.display();
}
}
class Topper
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of students");
int n = sc.nextInt();
int j=0;
Exam e[] = new Exam[n];
float top = 0;
for(int i=0;i<n;i++)
{
e[i] = new Exam();
e[i].input();
if(e[i].average()>top)
{
System.out.println("Average:"+e[i].average());
top = e[i].average();
j=i;
}
}
System.out.println("\nThe details of the topper are");
e[j].display();
}
}


