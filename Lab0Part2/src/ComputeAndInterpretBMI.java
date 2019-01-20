import java.util.Scanner;
public class ComputeAndInterpretBMI {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=input.nextLine();
		System.out.println(name+", enter your height in inches: ");
		int height=input.nextInt();
		System.out.println(name+", enter your weight in pounds: ");
		int weight=input.nextInt();
		double BMI=(weight/2.2)/(Math.pow(height/39.37,2));
		System.out.println(name+", your BMI is "+BMI);
		if (BMI<18.5) {
			System.out.println("You are underweight!");
			
		}
		else if (BMI>=18.5&&BMI<25) {
			System.out.println("You are normal!");
		}
		else if (BMI>=25&&BMI<30) {
			System.out.println("You are overweight!");
		}
		else {
			System.out.println("You are obese!");
		}
	}

}
