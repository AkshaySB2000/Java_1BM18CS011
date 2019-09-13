import java.util.*;
class Customer
{
	long Customer_number;
	String customer_name;
	int quantity;
	double price, total_price, discount,net_price;
	Customer(int a,String b,int c,double d)
	{
		Customer_number=a;
		customer_name=b;
		quantity=c;
		price=d;
	}
	void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Customer_number, customer_name, quantity, price");
		Customer_number=in.nextLong();
		customer_name=in.next();
		quantity=in.nextInt();
		price=in.nextDouble();
		CalDiscount();
	}
	void CalDiscount()
	{
		total_price=price*quantity;
		if(total_price>=50000)
		{
			discount=0.25*total_price;
		}
		if(total_price>=25000 && total_price<=50000)
		{

			discount=0.1*total_price;
		}
		net_price=total_price-discount;
	}
	void Show()
	{
		System.out.println("Customer_number:"+Customer_number);
		System.out.println("customer_name:"+customer_name);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		System.out.println("total_price:"+total_price);
		System.out.println("discount:"+discount);
		System.out.println("net_price:"+net_price);
	}
}
class CustomerDemo
{	
	public static void main(String args[])
	{	
		int i,n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of Customers");
		n=in.nextInt();
		Customer ob[]=new Customer[n];
		for(i=0;i<n;i++)
		{	
			ob[i]=new Customer(0,"\0",0,0.0);
			ob[i].input();
			ob[i].Show();
		}
	}
}
