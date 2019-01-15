import java.util.Scanner;

public class LogicalOperationApp1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int i =input.nextInt();
		
		boolean isPositive=i>0;
		System.out.println("The number you entered was positive: "+isPositive);
		
		
		input.close();
	}

}
