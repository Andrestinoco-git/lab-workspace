import java.util.Scanner;
public class BankApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a balance (e.g., 200.45): ");
		double balance=input.nextDouble();
		input.nextLine();
		if (0<balance&&balance<=1000) {
			
		} 
		else {
			System.out.println("Error: initial Balance "+balance+" is not in (0,1000).");
			
		}
		
		
		
		
		System.out.println("Enter a transaction type (\"d\" or \"w\"):");
		String type= input.nextLine();
		
		
		
		
		if (type.equals("d")) {
			
		}
		else if (type.equals("w")) {
			
		}
		else {
			System.out.println("Error transaction type "+type+" is neither d nor w.");
			
		}
		
		
		
		
		System.out.println("Enter an amount for "+type+":");
		double amount =input.nextDouble();
		input.nextLine();
		
		if (type.equals("d")) 
		{
			if (amount<=0) 
			{
				System.out.println("Error: deposit amount is not positive.");
			} 
			else if(balance+amount>1000){
				System.out.println("Error: deposit amount is not positive.");
			}
			else {
				balance+=amount;
			}
		}
		
		else if(type.equals("w")) 
		{
			if (amount<=0) 
			{
				System.out.println("Error: withdraw amount is not positive.");
			} 
			else if(amount>=balance){
				System.out.println("Error: withdraw amount is too large.");
			}
			else {
				balance-=amount;
			}
		}
		System.out.println("Resulting balance after performing transaction of "+type+" with $"+amount+": "+balance);
		
		
		
		input.close();
	}

}
