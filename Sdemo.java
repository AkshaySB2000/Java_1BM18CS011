import java.util.*;
class Student
{
String usn;
String name;
int sem;
int n;
Student(int x)
{
n=x;
}
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the usn");
usn = sc.next();
System.out.println("Enter the name");
name = sc.next();
System.out.println("Enter the semester");
sem = sc.nextInt();
}
void display()
{
System.out.println("USN = "+usn);
System.out.println("Name = "+name);
}
}
class Test extends Student
{
int credit[];
int ciemarks[];
Test(int x)
{
super(x);
credit=new int[x];
ciemarks=new int[x];
}
void input()
{
super.input();
Scanner sc  = new Scanner(System.in);
System.out.println("Enter credits for "+n+" subjects");
for(int i=0;i<n;i++)
{
credit[i] = sc.nextInt();
}
System.out.println("Enter cie marks in "+n+" subjects out of 50");
for(int i=0;i<n;i++)
{
ciemarks[i]=sc.nextInt();
}
}
void display()
{
super.display();
System.out.println("The cie marks in "+n+" subjects are");
for(int i=0;i<n;i++)
{
System.out.print(ciemarks[i]+" ");
}
}
}
class Exam extends Test
{
int seemarks[];
Exam(int x)
{
super(x);
seemarks = new int[x];
}
void input()
{
super.input();
Scanner sc  = new Scanner(System.in);
System.out.println("Enter see marks in "+n+" subjects out of 50");
for(int i=0;i<n;i++)
{
seemarks[i]=sc.nextInt();
}
}
void display()
{
super.display();
System.out.println("\nThe see marks in "+n+" subjects are");
for(int i=0;i<n;i++)
{
System.out.print(seemarks[i]+" ");
}
}
}
class Result extends Exam
{
float sgpa;
int marks[];
Result(int x)
{
super(x);
marks = new int[x];
}
void input()
{
super.input();
for(int i=0;i<n;i++)
{
marks[i] = seemarks[i] + ciemarks[i];
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
System.out.println("Grade in "+(i+1)+" subject = S");
}
else if(marks[i]>=75 && marks[i]<90)
{
gp[i]=9;
System.out.println("Grade in "+(i+1)+" subject = A");
}
else if(marks[i]>=60 && marks[i]<75)
{
gp[i]=8;
System.out.println("Grade in "+(i+1)+" subject = B");
}
else if(marks[i]>=50 && marks[i]<60)
{
gp[i]=7;
System.out.println("Grade in "+(i+1)+" subject = C");
}
else if(marks[i]>=40 && marks[i]<50)
{
gp[i]=6;
System.out.println("Grade in "+(i+1)+" subject = D");
}
else 
{
gp[i]=0;
System.out.println("Grade in "+(i+1)+" subject = F");
}
x+=credit[i]*gp[i];
sum+=credit[i];
}
sgpa=(float)x/sum;
}
void display()
{
super.display();
System.out.println("\nSGPA = "+sgpa);
}
}
class Sdemo
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of students");
int n = sc.nextInt();
Result r[] = new Result[n];
for(int i=0; i<n; i++)
{
System.out.println("Enter the number of subjects");
int x = sc.nextInt();
r[i] = new Result(x);
r[i].input();
r[i].sgpa();
r[i].display();
}
}
}

