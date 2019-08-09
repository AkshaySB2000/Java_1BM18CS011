import java.util.*;
class Fibon
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n greater than 2");
int n=sc.nextInt();
int i;
int a=0,b=1;
System.out.println(a);
System.out.println(b);
fibo(n);
}

static void fibo(int n)
{
int a=0,b=1;
for(int i=3;i<=n;i++)
{
int c=a+b;
System.out.println(c);
a=b;
b=c;
}
}

}

