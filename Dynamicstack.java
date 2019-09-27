import java.util.*;
interface Stack
{
void push(int item);
int pop();
void display();
}
class StackTest implements Stack
{
int s[],top,n;
StackTest()
{
n = 5;
s = new int[5];
top = -1;
}
public void push(int item)
{
if(top==n-1)
{
n=n*2;
int temp[] = new int[n];
for(int i=0;i<=top;i++)
temp[i] = s[i];
s=temp;
}
s[++top]=item;
}
public int pop()
{
int item;
if(top==-1)
{
System.out.println("Stack underflow");
return -9999;
}
item=s[top--];
return item;
}
public void display()
{
if(top==-1)
{
System.out.println("Stack underflow");
return;
}
System.out.println("Contents of Stack are");
for(int i=top;i>=0;i--)
{
System.out.println(s[i]+" ");
}
}
}
class Dynamicstack
{
public static void main(String args[])
{
int ch1;
Scanner sc = new Scanner(System.in);
StackTest s1 = new StackTest();
do
{
System.out.println("Enter your choice");
System.out.println("1 for push\n2 for pop\n3 for display");
int ch = sc.nextInt();
switch(ch)
{
case 1: {System.out.println("Enter the item to be inserted");
	 int item = sc.nextInt();
         s1.push(item);
         break;}
case 2: {int e = s1.pop();	
	 System.out.println("The element deleted from the queue = "+e);
	 break;}
case 3: {s1.display();
	 break;}
default: System.out.println("Invalid Choice");
}
System.out.println("Enter any value to continue and 1 to exit");
ch1 = sc.nextInt();
}while(ch1!=1);
}
}






