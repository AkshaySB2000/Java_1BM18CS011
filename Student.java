import java.util.*;
class Noargs extends Exception
{
public String toString()
{
return "No arguments in command line";
}
}
class Negative extends Exception
{
public String toString()
{
return "Marks cannot be negative";
}
}
class Student 
{
public static void main(String args[])
{
try
{
if(args.length<=0)
throw new Noargs();
for(int i=3;i<(args.length);i++)
{
if(Integer.parseInt(args[i])<0)
throw new Negative();
}
System.out.println("USN = "+args[0]);
System.out.println("Name = "+args[1]);
System.out.println("Marks in 3 subjects are");
for(int i=2;i<(args.length);i++)
{
System.out.print(Integer.parseInt(args[i])+" ");
}
System.out.print("\n");
}
catch(Noargs no)
{
System.out.println(no);
}
catch(Negative ne)
{
System.out.println(ne);
}
}
}


