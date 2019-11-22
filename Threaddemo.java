import java.util.*;
class Newthread1 implements Runnable
{
Thread t1;
Newthread1()
{
t1 = new Thread(this,"T1");
t1.start();
}
public void run()
{
while(true)
{
try
{
System.out.println("BMSCE");
Thread.sleep(10000);
}
catch(InterruptedException e)
{
System.out.println("Caught exception in thread 1");
}
}
}
}
class Newthread2 implements Runnable
{
Thread t2;
Newthread2()
{
t2 = new Thread(this,"T2");
t2.start();
}
public void run()
{
while(true)
{
try
{
System.out.println("CSE");
Thread.sleep(2000);
}
catch(InterruptedException e)
{
System.out.println("Caught exception in thread 2");
}
}
}
}
class Threaddemo
{
public static void main(String args[])
{
Newthread1 ob1 = new Newthread1();
Newthread2 ob2 = new Newthread2();
}
}

