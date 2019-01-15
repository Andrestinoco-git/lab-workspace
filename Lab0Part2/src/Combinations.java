import java.util.Scanner;
public class Combinations {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the 1st string: ");
		String a=input.nextLine();
		System.out.println("Enter the 2nd string: ");
		String b=input.nextLine();
		System.out.println("Enter the 3rd string: ");
		String c=input.nextLine();
		System.out.println("Enter the 4th string: ");
		String d=input.nextLine();
		System.out.println("Enter the 1st integer: ");
		int a1=input.nextInt();
		System.out.println("Enter the 2nd integer: ");
		int b1=input.nextInt();
		System.out.println("Enter the 3rd integer: ");
		int c1=input.nextInt();
		System.out.println("Enter the 4th integer: ");
		int d1=input.nextInt();
		System.out.println("Here are all 16 possible combinations: ");
		System.out.println("("+a+", "+a1+")");
		System.out.println("("+a+", "+b1+")");
		System.out.println("("+a+", "+c1+")");
		System.out.println("("+a+", "+d1+")");
		
		System.out.println("("+b+", "+a1+")");
		System.out.println("("+b+", "+b1+")");
		System.out.println("("+b+", "+c1+")");
		System.out.println("("+b+", "+d1+")");
		
		System.out.println("("+c+", "+a1+")");
		System.out.println("("+c+", "+b1+")");
		System.out.println("("+c+", "+c1+")");
		System.out.println("("+c+", "+d1+")");

		System.out.println("("+d+", "+a1+")");
		System.out.println("("+d+", "+b1+")");
		System.out.println("("+d+", "+c1+")");
		System.out.println("("+d+", "+d1+")");
	}

}
