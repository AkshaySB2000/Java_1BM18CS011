import java.util.*;
class Book
{
String name;
String author;
int price;
int pnum;
Book()
{
name="0";
author="0";
price=0;
pnum=0;
}
Book(String n, String a, int p, int num)
{
name=n;
author=a;
price=p;
pnum=num;
}
void set()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter name of the book");
name = sc.next();
System.out.println("Enter author of the book");
author = sc.next();
System.out.println("Enter price of the book");
price = sc.nextInt();
System.out.println("Enter number of pages of the book");
pnum = sc.nextInt();
}
public String toString()
{
String s = "Name : "+name+" Author : "+author+" Price : "+price+" Number of pages : "+pnum;
return s;
}
void get()
{
System.out.println("Name : "+name+"\nAuthor : "+author+"\nPrice : "+price+"\nNumber of pages : "+pnum);
}
}
public class Books
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
Book bo = new Book("LOTR:The Fellowship of the Ring","J.R.R Tolkien",300,500);
System.out.println(bo);
System.out.println("\nEnter the number of books");
int n = sc.nextInt();
Book b[] = new Book[n];
for(int i=0;i<n;i++)
{
b[i] = new Book();
System.out.println("\nEnter the details of book "+(i+1));
b[i].set();
System.out.println("\nThe details of the book are:");
b[i].get();
}
}
}

/*Output:

Name : LOTR:The Fellowship of the Ring Author : J.R.R Tolkien Price : 300 Number of pages : 500

Enter the number of books
2

Enter the details of book 1
Enter name of the book
abcd
Enter author of the book
efgh
Enter price of the book
100
Enter number of pages of the book
200

The details of the book are:
Name : abcd
Author : efgh
Price : 100
Number of pages : 200

Enter the details of book 2
Enter name of the book
ijkl
Enter author of the book
mnop
Enter price of the book
300
Enter number of pages of the book
600

The details of the book are:
Name : ijkl
Author : mnop
Price : 300
Number of pages : 600
*\




