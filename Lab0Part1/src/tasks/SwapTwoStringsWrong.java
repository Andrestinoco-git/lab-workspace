package tasks;

public class SwapTwoStringsWrong {

	public static void main(String[] args) {
		String person1="Alan";
		String person2="Tom";
		
		System.out.print("Before the swap: ");
		System.out.print("person1 is "+person1+"and ");
		System.out.println("person2 is "+person2+".");
		
		String temp=person1;
		person1=person2;
		
		person2=temp;
		
		System.out.print("After the swap: ");
		System.out.print("person1 is "+person1+" and");
		System.out.println(" person2 is "+person2+".");

	}

}
