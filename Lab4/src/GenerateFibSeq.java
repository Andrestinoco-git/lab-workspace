import java.util.Scanner;
public class GenerateFibSeq {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		String cont="Y";
		while (cont.equals("Y")) {
			
		
		System.out.println("Enter the size of the Fibonacci Sequence: ");
		int length=input.nextInt();
		input.nextLine();
		int x = 0;
		int y = 1;
		int z = 1;
		
		if (length<1) {
			System.out.print("Error: Fibonacci Sequence must have size >=1.");
		}
		else if (length==1) {
			System.out.print("<1>");
		}
		else if (length>1) {
			System.out.println("Fibonacci Sequence of size "+length+":");
			System.out.print("<1, ");
			for (int i = 0; i < length-1; i++) {
				z=x+y;
				System.out.print(z);
				if (i<length-2) {
					System.out.print(", ");
				}
				x=y;
				y=z;
			}
			System.out.print(">");
		}
		System.out.println("\nWould you like to continue? (Y/N)");
		cont=input.nextLine();
		}
		System.out.println("BYE!!!!");

	}

}
