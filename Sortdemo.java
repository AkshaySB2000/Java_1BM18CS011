import java.util.*;
class Ascsort implements Runnable
{
Thread t;
int a[],n;
Ascsort(int a[])
{
t = new Thread(this,"T1");
t.start();
this.a = a;
n = a.length;
}
synchronized public void run()
{
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-i-1;j++)
{
if(a[j]>a[j+1])
{
int temp = a[j];
a[j] = a[j+1];
a[j+1] = temp;
}
}
}
System.out.println("Numbers in ascending order");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
class Descsort implements Runnable
{
Thread t;
int a[],n;
Descsort(int a[])
{
t = new Thread(this,"T2");
t.start();
this.a = a;
n = (a.length);
}
synchronized public void run()
{
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-i-1;j++)
{
if(a[j]<a[j+1])
{
int temp = a[j];
a[j] = a[j+1];
a[j+1] = temp;
}
}
}
System.out.println("Numbers in descending order");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
class Sortdemo 
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements");
int n = sc.nextInt();
int a[] = new int[n];
System.out.println("Enter the numbers");
for(int i=0;i<n;i++)
{
a[i] = sc.nextInt();
}
Ascsort as = new Ascsort(a);
Descsort de = new Descsort(a);
}
}
 

