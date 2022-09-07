import java.util.Scanner;
class Pratic_SwitchStatement
{
    public static void main(String[] args)
    {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the input");
     int option=scan.nextInt();
     switch (option){
     case 1:
     	 System.out.println("Open to your account");
     	 int option1=scan.nextInt();
     	 switch(option1){
     	 case 1:
     	 	System.out.println("current account");
     	 }
     break;	 
     }		
    }	
}