import java.util.Scanner;
public class PrintBetweenNumbers1 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int i =0;
		System.out.println("Enter a lower bound: ");
		int low=input.nextInt();
		i=low;
		System.out.println("Enter a upper bound: ");
		int high=input.nextInt();
		if (low>high) {
			System.out.println("Error: lower bound is not less than or equal to the upper bound "+high);
			System.out.println("Bye!");
		} else {
			System.out.println("Numbers between "+low+" and "+high);
			while (low<=high) {
				System.out.println(i);
				low++;
				i++;
			}
			System.out.println("Bye!");
			
		}
	}

}
