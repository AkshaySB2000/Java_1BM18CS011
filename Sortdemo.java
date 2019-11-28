import java.util.*;
class Sort 
{
synchronized void sort(int a[],int n,int ch)
{
if(ch==1)
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
else if(ch==2)
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
}
class Newthread implements Runnable
{
Thread t;
Sort so;
int a[],n,ch;
Newthread(Sort s,int a[],int n,int ch)
{
so = s;
this.n = n;
this.a = a;
this.ch = ch;
t = new Thread(this,"T");
t.start();
}
public void run()
{
so.sort(a,n,ch);
}
}
class Sortdemo 
{
public static void main(String args[])
{
Sort s = new Sort();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements");
int n = sc.nextInt();
int a[] = new int[n];
System.out.println("Enter the numbers");
for(int i=0;i<n;i++)
{
a[i] = sc.nextInt();
}
Newthread n1 = new Newthread(s,a,n,1);
Newthread n2 = new Newthread(s,a,n,2);
try
{
n1.t.join();
n2.t.join();
}
catch(InterruptedException e)
{
System.out.println("Caught exception");
}
}
}
 

