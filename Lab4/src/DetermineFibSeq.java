import java.util.Scanner;
public class DetermineFibSeq {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String cont="Y";
		while (cont.equals("Y")) {
			
		int num=0;
		int check=0;
		int[] userFib=new int[20];
		int i=0;
		int[] fib = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181};
		while (num!=-1) 
		{
			System.out.println("Enter a positive integer value, or -1 to stop:");
			num=input.nextInt();
			input.nextLine();
			if (num!=-1) {
				userFib[i]=num;
				i++;
			}
		}
		System.out.print("The sequence you entered <");
		for (int j = 0; j < i; j++) {
			System.out.print(userFib[j]);
			if (j<i-1) {
				System.out.print(", ");
			}
		}
		System.out.print(">");
		for (int j = 0; j < i; j++) 
		{
			if (userFib[j]==fib[j]) {
				check++;
			}
		}
		if (check==i) {
			System.out.println("\nis the first "+i+" numbers in the Fibonacci sequence.");
		}
		else {
			System.out.println("\nis not the first "+i+" numbers in the Fibonacci sequence.");
		}
		System.out.println("Would you like to try another sequence? (Y/N)");
		cont=input.nextLine();
		}
		System.out.println("BYE!!!!");
	}
}
