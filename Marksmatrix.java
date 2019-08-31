import java.util.*;
class Marks
{
float m[][];
int ns,nm;
void input()
{
System.out.println("Enter number of students and number of subjects");
Scanner sc=new Scanner(System.in);
ns=sc.nextInt();
nm=sc.nextInt();
m=new float[ns+2][nm+2];
System.out.println("Enter marks in matrix");
for(int i=0;i<ns;i++)
{
for(int j=0;j<nm;j++)
{
m[i][j]=se.nextFloat();
}
}
}
void calculate()
{
float sum=0;
float avg=0;
for(int i=0;i<ns;i++)
{
for(int j=0;j<nm;j++)
{
sum=sum+m[i][j];
}
m[i][nm]=sum;
avg=(float)sum/nm;
m[i][nm+1]=avg;
sum=0;
}
for(int j=0;j<nm;j++)
{
for(int i=0;i<ns;i++)
{
sum=sum+m[i][j];
}
m[ns][j]=sum;
avg=(float)sum/ns;
m[ns+1][j]=avg;
sum=0;
}
}
void print()
{
System.out.println("Details are");
for(int i=0;i<ns+2;i++)
{
for(int j=0;j<nm+2;j++)
{
System.out.print(m[i][j]+" ");
}
System.out.print("\n");
}
}
}
class Marksmatrix
{
public static void main(String args[])
{
Marks m1=new Marks();
m1.input();
m1.calculate();
m1.print();
}
}
