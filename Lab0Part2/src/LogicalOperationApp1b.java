import java.util.Scanner;

public class LogicalOperationApp1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int i =input.nextInt();
		
		boolean isLessThanOrEqualToZero=i<=0;
		System.out.println("The number you entered was positive: "+!isLessThanOrEqualToZero);
		
		
		input.close();
	}

}
