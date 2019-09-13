import java.util.*;
class Patients
{
	int patient_id;
	String patient_name,doc;
	int patient_age;
	Patients()
	{
		patient_id="\0";patient_name="\0";patient_age=0;doc="\0";
	}
	void getdata()
	{
		System.out.println("Enter Patient_ID ,Patient_NAME , DOCTORS_NAME and  Patient_AGE:");
		Scanner s=new Scanner(System.in);
		patient_id=s.nextInt();
		patient_name=s.nextLine();
		doc=s.next();
		patient_age=s.nextInt();
	}
	void display()
	{
		System.out.println("Patient_NAME:"+patient_name+"\nPatient_ID:"+patient_id+"\nPatient_AGE:"+patient_age);
		
	}
}
class Patientdemo
{
	public static void main(String args[])
	{
		int i;
		String d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Patients:");
		int n=sc.nextInt();
		Patients ob[]=new Patients[n];
		for(i=0;i<n;i++)
		{
			ob[i]=new Patients();
			ob[i].getdata();
		}
		System.out.println("Enter the name of the Doctor:");
		d =sc.next();
		System.out.println("List of  Patients under doctor "+d+":\n");		
		for(i=0;i<n;i++)
		{
			if((ob[i].doc).equals(d))
			{	System.out.println("----------------------");
				ob[i].display();
			}
		}
	}
}
