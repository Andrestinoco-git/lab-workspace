import java.util.Scanner;
public class IfStatementApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter an integer balance: ");
		int  initalBalance = input.nextInt();
		System.out.println("Enter an amount to withdraw: ");
		int amount = input.nextInt();
		
		if(initalBalance<0)
		{
			System.out.println("Error: Initial balance should not be negative.");
		}
		else if(amount<0)
		{
			System.out.println("Error: Amount to withdraw should not be negative.");
		}
		else if(amount>=initalBalance)
		{
			System.out.println("Error: Amount to withdraw should be smaller than the balance.");
		}
		else {
			int resultingBalance=initalBalance-amount;
			System.out.println("Initial balance "+initalBalance+" after withdrawing "+amount);
			System.out.println(" has the resulting balance "+resultingBalance);
		}
		input.close();
	}

}
