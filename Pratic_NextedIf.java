import java.util.Scanner;
class Pratic_NextedIf
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
		int age=scan.nextInt();
		if(age>18)
		{
            System.out.println("If You have Votter ID \n 1.yes \n 2.No");
            System.out.println("Enter yes or no");           
            String options=scan.next();
            if(options.equals("yes")){
               System.out.println("your aligible in votting");
            } 
            else{
            	System.out.println("your not Aligible in Votting");
            }  
		}
		else
		{
			System.out.println("Not aligible in voting");
		}
	}
}