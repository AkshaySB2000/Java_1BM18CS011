import java.util.*;
interface Safedriving
{
final int safespeed = 50;
void speedofthevehicle(int s);
}
class Drive implements Safedriving
{
public void speedofthevehicle(int s)
{
if(s<=safespeed)
System.out.println("Safe driving");
else 
System.out.println("Drive slow");
}
}
class Drivedemo
{
public static void main(String args[])
{
Drive d = new Drive();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the speed of the vehicle");
int s = sc.nextInt();
d.speedofthevehicle(s);
}
}

