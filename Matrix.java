import java.util.*;
class Matrix
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the row size and column size of the two matrices");
int m=sc.nextInt();
int n=sc.nextInt();
System.out.println("Enter matrix A");
int a[][] = new int[m][n];
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Enter matrix B");
int b[][] = new int[m][n];
int c[][] = new int[m][n];
int d[][] = new int[m][n];
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
b[i][j]=sc.nextInt();
c[i][j]=a[i][j]+b[i][j];
d[i][j]=a[i][j]-b[i][j];
}
}
System.out.println("The sum of matrices A and B is the matrix below");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(c[i][j]+" ");
}System.out.print("\n");
}
System.out.println("The difference of matrices A and B is the matrix below");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(d[i][j]+" ");
}System.out.print("\n");
}
}
}


