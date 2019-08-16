import java.util.*;
class Largest
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter row size and column size");
int m = sc.nextInt();
int n = sc.nextInt();
int a[][] = new int[m][n];
System.out.println("Enter elements");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}
int large = a[0][0];
for(int arr[]:a)
{
for(int x:arr)
{
if(x>large)
{
large=x;
}
}
}
System.out.println("The largest element of 2D array is "+large);
}
}

