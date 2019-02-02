import java.util.Scanner;
public class PrintBetweenNumbers4 {

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
			System.out.println("Error: lower bound "+low+" is not less than or equal to the upper bound "+high+".");
			System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
			cont=input.nextLine();
			while (!(cont.equals("Y"))&&!(cont.equals("N"))) {
				System.out.println("Invalid indication on continuation: "+cont);
				System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
				cont=input.nextLine();
			}
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
		System.out.println("Enter a middle number: ");
		int mid=input.nextInt();
		while (!(mid>=low)||!(mid<=high)) {
			input.nextLine();
			System.out.println("Error: middle number is not in-beween the lower and upper bounds.\r\n" + 
					"Would you like to continue printing? (Enter Y for yes; N for no)");
			cont=input.nextLine();
			while (!(cont.equals("Y"))&&!(cont.equals("N"))) {
				System.out.println("Invalid indication on continuation: "+cont);
				System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
				cont=input.nextLine();
			}
			if (cont.equals("Y")) {
				System.out.println("Enter a lower bound: ");
				low=input.nextInt();
				i=low;
				System.out.println("Enter a upper bound: ");
				high=input.nextInt();
				while (low>high)
				{
					input.nextLine();
					System.out.println("Error: lower bound "+low+" is not less than or equal to the upper bound "+high+".");
					System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
					cont=input.nextLine();
					while (!(cont.equals("Y"))&&!(cont.equals("N"))) {
						System.out.println("Invalid indication on continuation: "+cont);
						System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
						cont=input.nextLine();
					}
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
				System.out.println("Enter a middle number: ");
				mid=input.nextInt();
			}
			else if (cont.equals("N")) {
				System.out.println("Bye!");
				break;
				
			}
			
		}
		
		if (high>=low&&cont.equals("Y")) 
		{
			System.out.println("Odd numbers between "+low+" and "+mid+":");
			while (low<=mid&&cont.equals("Y")&&i<=mid) {
				if(!(i%2==0))
				{
					System.out.println(i);
				}
				low++;
				i++;
			}
			System.out.println("Even numbers between "+mid+" and "+high+":");
			i=mid;
			while (mid<=high&&cont.equals("Y")&&i<=high)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
				mid++;
				i++;
			}

		}
		input.nextLine();
		System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
		cont=input.nextLine();
		while (!(cont.equals("Y"))&&!(cont.equals("N"))) {
			System.out.println("Invalid indication on continuation: "+cont);
			System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
			cont=input.nextLine();
		}
		if (cont.equals("N")) {
			System.out.println("Bye!");
			break;
		}
		}
		
		
		
	}

}
