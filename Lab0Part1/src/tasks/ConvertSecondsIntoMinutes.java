package tasks;

import java.util.Scanner;

public class ConvertSecondsIntoMinutes {

	public static void main(String[] args) 
	{
		//keyboard created to allow user input
		Scanner keyboard=new Scanner(System.in);
		//System println to ask user for input
		System.out.println("What's your name? ");
		//store input into string variable name
		String name=keyboard.nextLine();
		//System println to ask user for input
		System.out.println("Enter an integer for seconds: ");
		//store user input into secs variable
		double secs=keyboard.nextDouble();
		int userSecs=(int)(secs);
		double mins=secs/60;
		double percent=(mins-(Math.floor(mins)))*100;
		int minsFinal=(int)(Math.floor(mins));
		int secsFinal=(int) ((Math.ceil(percent)*60)/100);
		System.out.println(name+", your input "+userSecs+" seconds can be divided into "+minsFinal+" minutes and "+secsFinal+" seconds.");
	}

}
