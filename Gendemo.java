import java.util.*;
class Generics<A,B>
{
private A a;
private B b;
public Generics(A a,B b) 
{
this.a = a;
this.b = b;
}
public A getFirst() 
{
return a;
}
public B getSecond() 
{
return b;
}
}
class Gendemo 
{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter an Integer"); 
int num = s.nextInt();
System.out.println("Enter a String"); 
String str = s.next();
Generics<Integer,String> ob = new Generics<Integer,String>(num,str);
System.out.println("Integer value : "+ob.getFirst());
System.out.println("String value : "+ob.getSecond());
}
}



