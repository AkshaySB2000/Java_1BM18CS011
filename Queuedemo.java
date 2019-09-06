import java.util.*;
class Queue
{
int q[],f,r,size;
Queue(int n)
{
size=n;
q = new int[n];
f=0;
r=-1;
}
void qinsert(int item)
{
if(r==size-1)
{
System.out.println("Queue is full\n");
return;
}
r=r+1;
q[r]=item;
}
int qdelete()
{
if(f>r)
{
System.out.println("Queue is empty\n");
return -9999;
}
int e = q[f];
f=f+1;
return e;
}
void qdisplay()
{
if(f>r)
{
System.out.println("Queue is empty\n");
return;
}
System.out.println("\nContents of Queue are\n");
for(int i=f;i<=r;i++)
{
System.out.print(q[i]+" ");
}
System.out.println("\n");
}
}
class Queuedemo
{
public static void main(String args[])
{
int ch1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of the queue");
int n = sc.nextInt();
Queue q1 = new Queue(n);
do
{
System.out.println("Enter your choice");
System.out.println("1 for insertion\n2 for deletion\n3 for display");
int ch = sc.nextInt();
switch(ch)
{
case 1: {System.out.println("Enter the item to be inserted");
	 int item = sc.nextInt();
         q1.qinsert(item);
         break;}
case 2: {int e = q1.qdelete();	
	 System.out.println("The element deleted from the queue = "+e);
	 break;}
case 3: {q1.qdisplay();
	 break;}
default: System.out.println("Invalid Choice");
}
System.out.println("Enter any value to continue and 1 to exit");
ch1 = sc.nextInt();
}while(ch1!=1);
}
}

