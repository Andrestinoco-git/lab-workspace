import java.util.Scanner;
public class MathSequence {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String cont="Y";
		int nums=0;
		int max=10;
		String contNum="Y";
		int term=0;
		int diff=0;
		int numTerm=0;
		int ratio=0;
		int sum=0;
		int difference=0;
		int difference2=0;
		int countSameDifference=0;
		int[] sequence3=new int[10];
		while(cont.equals("Y"))
		{
			System.out.println("What kind of processing task would you like to perform?");
			System.out.println("1: Generate an arithmetic sequence.\r\n" + 
					"2: Generate a geometric sequence.\r\n" + 
					"3: Determine an arithmetic sequence.");
	//////////
			int choice=input.nextInt();
			input.nextLine();
			while (choice>3||choice<1)
			{
				System.out.println("Error: task number must be 1, 2, or 3.\r\n" + 
						"What kind of processing task would you like to perform?\r\n" + 
						"1: Generate an arithmetic sequence.\r\n" + 
						"2: Generate a geometric sequence.\r\n" + 
						"3: Determine an arithmetic sequence.");
	/////////////
				choice=input.nextInt();
				input.nextLine();
			}
			if (choice==1) 
			{
				sum=0;
				System.out.println("Enter the first term in the arithmetic sequence:");
	/////////////
				term=input.nextInt();
				input.nextLine();
				System.out.println("Enter the common difference in the arithmetic sequence:");
	/////////////////
				diff=input.nextInt();
				input.nextLine();
				System.out.println("Enter the number of terms in the arithmetic sequence:");
	///////////////
				numTerm=input.nextInt();
				input.nextLine();
				int[] sequence=new int[numTerm];
				for (int i = 0; i < sequence.length; i++) 
				{
					sequence[i]=term;
					term+=diff;
				}
				System.out.print("<");
				for (int i = 0; i < sequence.length; i++) {
					System.out.print(sequence[i]);
					sum+=sequence[i];
					if (i<(sequence.length-1)) {
						System.out.print(", ");
					}
				}
				System.out.print(">");
				System.out.println("\nSum of the arithmetic sequence: "+sum);
			}
			if (choice==2) {
				sum=0;
				System.out.println("Enter the first term in the geometric sequence:");
				term=input.nextInt();
				input.nextLine();
				System.out.println("Enter the common ratio in the geometric sequence:");
				ratio=input.nextInt();
				input.nextLine();
				System.out.println("Enter the number of terms in the geometric sequence:");
				numTerm=input.nextInt();
				input.nextLine();
				int[] sequence=new int[numTerm];
				for (int i = 0; i < sequence.length; i++) 
				{
					sequence[i]=term;
					term*=ratio;
				}
				System.out.print("<");
				for (int i = 0; i < sequence.length; i++) {
					System.out.print(sequence[i]);
					sum+=sequence[i];
					if (i<(sequence.length-1)) {
						System.out.print(", ");
					}
				}
				System.out.print(">");
				System.out.println("\nSum of the geometric sequence: "+sum);
			}
			if (choice==3) 
			{
				nums=0;
				term=0;
				sum=0;
				difference=0;
				difference2=0;
				countSameDifference=0;
				sequence3=new int[10];
				contNum="Y";
				while (contNum.equals("Y")&&nums<=max) {
					nums++;
					System.out.println("Enter a new number:");
					sequence3[nums-1] = input.nextInt();
					input.nextLine();
					if (nums==max) {
						System.out.println("You have entered the maximum number of numbers!\r\n" + 
								"We will start processing your sequence right away.");
						contNum="N";
					}
					if (contNum.contentEquals("Y")) 
					{
						System.out.println("You have entered "+nums+" numbers.");
						System.out.println("You may still enter "+(max-nums)+" numbers.");
						System.out.println("Would you like to enter another new number? (Y/N)");
						contNum=input.nextLine();
					}
					if (nums==1&&contNum.equals("N"))
					{
						System.out.println("Error: we cannot infer the common difference from a sequence of size one.");
						break;
					}
					if (contNum.equals("N")) {
						int[] userSequence=new int[nums];
						for (int i = 0; i < userSequence.length; i++) {
							userSequence[i]=sequence3[i];
						}
						for (int i = 0; i < userSequence.length; i++) {
							sum+=userSequence[i];
						}
						if (nums>2) {
							for (int i = 2; i < userSequence.length; i++)
							{
								difference=userSequence[i-1]-userSequence[i-2];
								difference2=userSequence[i]-userSequence[i-1];
								if (difference==difference2) 
								{
									countSameDifference++;
								}
							}
						}
						else {
							difference=userSequence[1]-userSequence[0];
							countSameDifference=nums-2;
						}
						if (countSameDifference==nums-2)
						{
							System.out.print("<");
							for (int i = 0; i < userSequence.length; i++) {
								System.out.print(userSequence[i]);
								if (i<(userSequence.length-1)) {
									System.out.print(", ");
								}
							}
							for (int i = 0; i < userSequence.length; i++) {
								sum+=userSequence[i];
							}
							System.out.print(">");
							System.out.print(" is an arithmetic sequence with");
							System.out.println("\nfirst term "+sequence3[0]+", common difference "+difference+", length "+nums+", and sum "+sum/2);
						}
						else {
							System.out.print("<");
							for (int i = 0; i < userSequence.length; i++) {
								System.out.print(userSequence[i]);
								if (i<(userSequence.length-1)) {
									System.out.print(", ");
								}
							}
							System.out.print(">");
							System.out.println(" is not an arithmetic sequence");
						}
					}
				}
			}
			System.out.println("Would you like to process another sequence? (Y/N)");
	/////////
			cont=input.nextLine();
			while (!(cont.equals("Y"))&&!(cont.equals("N")))
			{
				System.out.println("Error: Must be Y or N. " + 
						"Would you like to process another sequence? (Y/N)");
	/////////////
				cont=input.nextLine();
			}
		}
		System.out.println("BYE!");
		input.close();
	}

}
