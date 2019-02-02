import java.util.Scanner;

public class ForLoopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int total=0;
		for (int i = 0; i <=4; i++) {
			System.out.println("Enter integer");
			int x=input.nextInt();
			total+=x;
		}
		double average = ((double)total)/5;
		System.out.println("Average is "+average);
		
		input.close();
	}

}
