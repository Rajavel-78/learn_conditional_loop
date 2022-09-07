import java.util.Scanner;
class Nexted_forLoop
{
	public static void main(String[] args) 
	{
	  Scanner scan=new Scanner(System.in);
	  System.out.println("-------Print pyramid");
	  System.out.println("Enter your length"); 
      int number=scan.nextInt();
	  for(int i=1;i<number;i++)
	  {
	  	for(int j=number-i;j>0;j--)
	  	{
	  	  System.out.print(" ");	
	  	}
	  	for(int k=0;k<i;k++)
	  	{
           System.out.print((char)(64+i)+" ");//convert int to char;
	  	}
	  	System.out.println("");
	  } 

	}
}