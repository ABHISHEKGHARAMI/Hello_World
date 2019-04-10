import java.util.Scanner;
public class ass33
{
	public static void main(String args[])
	{ 
	 Scanner s1=new Scanner(System.in);
	 System.out.println("Please enter the first name:");
	 String name1=s1.nextLine();
	 Scanner s2=new Scanner(System.in);
	 System.out.println("Please enter the last name:");
	 String  lname2=s2.nextLine();
	 Scanner s3=new Scanner(System.in);
	 System.out.println("Please enter the dob:");
	 String dob1=s3.nextLine();
	 Scanner s4=new Scanner(System.in);
	 System.out.println("Please enter the domain:");
	 String email2=s4.nextLine();
	 info i1=new info(name1,lname2,dob1,email2);
	 i1.show();
	}
	
}