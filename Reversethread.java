import java.util.*;
class Thread1 implements Runnable
{
Thread t;
Thread2 t2;
Thread1()
{
t = new Thread(this,"T1");
t2 = new Thread2();
t.start();
}
public void run()
{
try
{
t2.t.join();
}
catch(InterruptedException e)
{
System.out.println("Exception in Thread 1");
}
try
{
System.out.println("Hello from Thread 1!");
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println("Exception caught");
}
}
}
class Thread2 implements Runnable
{
Thread t;
Thread3 t2;
Thread2()
{
t = new Thread(this,"T2");
t2 = new Thread3();
t.start();
}
public void run()
{
try
{
t2.t.join();
}
catch(InterruptedException e)
{
System.out.println("Exception in Thread 2");
}
try
{
System.out.println("Hello from Thread 2!");
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println("Exception caught");
}
}
}
class Thread3 implements Runnable
{
Thread t;
Thread4 t2;
Thread3()
{
t = new Thread(this,"T3");
t2 = new Thread4();
t.start();
}
public void run()
{
try
{
t2.t.join();
}
catch(InterruptedException e)
{
System.out.println("Exception in Thread 3");
}
try
{
System.out.println("Hello from Thread 3!");
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println("Exception caught");
}
}
}
class Thread4 implements Runnable
{
Thread t;
Thread5 t2;
Thread4()
{
t = new Thread(this,"T4");
t2 = new Thread5();
t.start();
}
public void run()
{
try
{
t2.t.join();
}
catch(InterruptedException e)
{
System.out.println("Exception in Thread 4");
}
try
{
System.out.println("Hello from Thread 4!");
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println("Exception caught");
}
}
}
class Thread5 implements Runnable
{
Thread t;
Thread5()
{
t = new Thread(this,"T5");
t.start();
}
public void run()
{
try
{
System.out.println("Hello from Thread 5!");
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println("Exception caught");
}
}
}
class Reversethread 
{
public static void main(String args[])
{
new Thread1();
}
}
