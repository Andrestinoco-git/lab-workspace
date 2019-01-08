package tasks;
import java.util.Scanner;

public class SimpleUserInput1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		
		int i = input.nextInt();
		
		int square = i*i;
				
		System.out.println("The square of "+i+" is "+square+".");
		
		input.close();
				
	}

}
