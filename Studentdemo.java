import java.util.*;
class Student
{
String usn;
String name;
int n;
float sgpa;
int credit[];
int marks[];
Student(int x)
{
n=x;
credit=new int[x];
marks=new int[x];
}
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the usn and name");
usn = sc.next();
name = sc.next();
System.out.println("Enter credits for "+n+" subjects");
for(int i=0;i<n;i++)
{
credit[i] = sc.nextInt();
}
System.out.println("Enter marks in "+n+" subjects");
for(int i=0;i<n;i++)
{
marks[i]=sc.nextInt();
}
}
void sgpa()
{
int x=0,sum=0;
int gp[] = new int[n];
for(int i=0;i<n;i++)
{
if(marks[i]>=90)
{
gp[i]=10;
}
else if(marks[i]>=75 && marks[i]<90)
{
gp[i]=9;
}
else if(marks[i]>=60 && marks[i]<75)
{
gp[i]=8;
}
else if(marks[i]>=50 && marks[i]<60)
{
gp[i]=7;
}
else if(marks[i]>=40 && marks[i]<50)
{
gp[i]=6;
}
else 
{
gp[i]=0;
}
x+=credit[i]*gp[i];
sum+=credit[i];
}
sgpa=(float)x/sum;
}
void display()
{
System.out.println("USN = "+usn);
System.out.println("Name = "+name);
System.out.println("Marks in "+n+" subjects is as follows");
for(int i=0;i<n;i++)
{
System.out.println(marks[i]+" ");
}
System.out.print("SGPA = "+sgpa);
}
}
class Studentdemo
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of subjects");
int x = sc.nextInt();
Student s = new Student(x);
s.input();
s.sgpa();
s.display();
}
}

