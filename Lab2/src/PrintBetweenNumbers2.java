import java.util.Scanner;
public class PrintBetweenNumbers2 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int i =0;
		String cont="Y";
		while (cont.equals("Y"))
		{
			
		System.out.println("Enter a lower bound: ");
		int low=input.nextInt();
		i=low;
		System.out.println("Enter a upper bound: ");
		int high=input.nextInt();
		while (low>high)
		{
			input.nextLine();
			System.out.println("Error: lower bound is not less than or equal to the upper bound.");
			System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
			cont=input.nextLine();
			if (cont.equals("Y")) {
				System.out.println("Enter a lower bound: ");
				low=input.nextInt();
				i=low;
				System.out.println("Enter a upper bound: ");
				high=input.nextInt();
			}
			else if (cont.equals("N")) {
				System.out.println("Bye!");
				break;
			}
		}  
		if (high>=low) 
		{
			System.out.println("Numbers between "+low+" and "+high);
		}
		while (low<=high) {
			System.out.println(i);
			low++;
			i++;
		}
		input.nextLine();
		System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
		cont=input.nextLine();
		if (cont.equals("Y")) {
			System.out.println("Enter a lower bound: ");
			low=input.nextInt();
			i=low;
			System.out.println("Enter a upper bound: ");
			high=input.nextInt();
		}
		else if (cont.equals("N")) {
			System.out.println("Bye!");
			break;
		}
		}
		
		
	}

}
