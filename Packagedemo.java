import java.util.*;
import CIE.*;
import SEE.*;
class Packagedemo
{
public static void main(String args[])
{
Internal in = new Internal();
External ex = new External();
in.getdata();
ex.getdata();
in.display();
ex.display();
System.out.println("Final marks");
for(int i=0;i<5;i++)
{
System.out.print((in.inter[i]+ex.exter[i])+" ");
}
System.out.print("\n");
}
}

/*Enter the USN
1BM18CS011
Enter the name
Akshay
Enter the semester
3
Enter CIE marks in 5 subjects
45 45 45 45 45
Enter the SEE marks in 5 subjects
46 46 46 46 46
USN = 1BM18CS011
Name = Akshay
Semester = 3
CIE marks in 5 subjects: 
45 45 45 45 45 
SEE marks in 5 subjects
46 46 46 46 46 
Final marks
91 91 91 91 91 */
