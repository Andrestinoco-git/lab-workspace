package tasks;

import java.util.Scanner;

public class ComputePerimeterAndAreaOfCircle {

	public static void main(String[] args) 
	{
		//keyboard created to allow user input
		Scanner keyboard = new Scanner(System.in);
		//System println to ask user for input
		System.out.println("Enter an integer for radius: ");
		//store user input into radius variable
		double radius=keyboard.nextDouble();
		//system println asks for users name
		System.out.println("What's your name? ");
		keyboard.nextLine();
		//store input into string variable name
		String name=keyboard.nextLine();
		//perimeter calculation stored in variable p
		double p= 2*3.14*radius;
		//area calculated in a double variable named a
		double a= (3.14)*(Math.pow(radius, 2));
		System.out.println(name+", your input circle with radius 9 has perimeter "+p+" and area "+a);
		
	}

}
