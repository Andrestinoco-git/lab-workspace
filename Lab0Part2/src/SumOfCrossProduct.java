import java.util.Scanner;
public class SumOfCrossProduct {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the 1st integer in sequence 1: ");
		int a1=input.nextInt();
		System.out.println("Enter the 2nd integer in sequence 1: ");
		int a2=input.nextInt();
		System.out.println("Enter the 3rd integer in sequence 1: ");
		int a3=input.nextInt();
		System.out.println("Enter the 4rth integer in sequence 1: ");
		int a4=input.nextInt();
		
		System.out.println("Enter the 1st integer in sequence 2: ");
		int b1=input.nextInt();
		System.out.println("Enter the 2nd integer in sequence 2: ");
		int b2=input.nextInt();
		System.out.println("Enter the 3rd integer in sequence 2: ");
		int b3=input.nextInt();
		System.out.println("Enter the 4th integer in sequence 2: ");
		int b4=input.nextInt();
		int sum=a1*b1+a2*b2+a3*b3+a4*b4;
		System.out.println("sum(["+a1+", "+a2+", "+a3+", "+a4+"] * ["+b1+", "+b2+", "+b3+", "+b4+"]) = "+sum);
		
	}

}
