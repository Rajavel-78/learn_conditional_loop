import java.util.Scanner;
class PraticIfstatement
{
	public static void main(String[] args)
	{
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter your name");
	 int age=scan.nextInt();
	 if(18>age)
	 {
        System.out.println("Allowed voting");    
	 }
	 else{
	 	System.out.println("Not Allowed Voting");
	 }
	}
	
}