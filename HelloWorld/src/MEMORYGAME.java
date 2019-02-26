
//MEMORY GAME
//This program will run a memory game which creates 3 random numbers to be replaced into a string array "- - - -" like this.
//The user will then be asked to remember the numbers and input them into JOptionPane for each line.
//The programs checks if the user is correct for each line and if they remember they move on to the second round.
//Second round has more numbers and if they beat this round they win the game.
//ANDRES TINOCO
//20/01/2017

import javax.swing.JOptionPane;
//Import JOptionPane to be able to display message to user
import java.util.ArrayList;
//import java arrays class to compare numbers to user input
import java.util.Arrays;
//import random numbers for lines
import java.util.Random;
public class MEMORYGAME
{

	public static void main(String[] args)
	{
		//Intro to the game and the user is greeted with a welcome to initiate the program
		JOptionPane.showMessageDialog(null, "WELCOME TO THE MEMORY GAME");
		
		//The game then explains its main purpose with a JOptionPane message
		JOptionPane.showMessageDialog(null, "In this Game you will be tested for your\n memory intelligence skill...");
		//JOptionPane to ask if the user is ready to commence the program
		//Answer will be stored in string answer
		String answer=JOptionPane.showInputDialog("ARE YOU READY???");
		//Verification for the user input using if statements 
		if (answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("yeah")||answer.equalsIgnoreCase("ya")||answer.equalsIgnoreCase("totally")||answer.equalsIgnoreCase("sure"))
		{
			//Asking the user if they want to see the tutorial
			String Answer2=JOptionPane.showInputDialog("Do you want the tutorial?\n(Type the word \"hacks\" to get 2000 lives)");
			if (Answer2.equalsIgnoreCase("yes")||Answer2.equalsIgnoreCase("yeah")||Answer2.equalsIgnoreCase("ya")||Answer2.equalsIgnoreCase("totally")||Answer2.equalsIgnoreCase("sure"))
			{
				//Showing JOptionPane dialog boxes to instruct the user in the tutorial
				JOptionPane.showMessageDialog(null, "GREAT! There will be 4 rounds. \nThe Game will begin with 3 lines \nwith 4 characters to remember...");
				JOptionPane.showMessageDialog(null, "Like so: \n- - - -\n- - - -\n- - - -\nEach dash in these 3 lines will be replaced by a random number..");
				JOptionPane.showMessageDialog(null, "Like this:\n- - 1 -\n9 - - -\n- 4 - -\nIt will be your responsibility to remember where the numbers go and...");
				JOptionPane.showInputDialog( "Input the numbers into the inbox below\nfor each line!!\n |\n |\n |\nV");
				JOptionPane.showMessageDialog(null, "GREAT WORK!!!11!!1!");
				JOptionPane.showMessageDialog(null, "EXAMPLE\n\n- - 4 -\n7 - - -\n- 9 - -\nIn this example, the numbers are 4, 7, and 9...");
				JOptionPane.showMessageDialog(null, "so this round you will have to input them into each line...");
				String number1=JOptionPane.showInputDialog("Line 1 (hint: input 4):");
				//Verification for tutorial example
				if (number1.equals("4"))
				{
					JOptionPane.showMessageDialog(null,"Good. You will have to do this for the three lines.\n But if you guess one of the numbers incorrectly...\nYou will lose one of your guesses!\nYou have 3 guesses throughout the Game");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "INCORRECT! Every time you get a wrong answer, you lose one of your guesses! You have 3 guesses in the game but you will not be deducted any points in the tutorial.");
				}
			}
			//If statement for hack initiation
			if (Answer2.equalsIgnoreCase("hacks"))
			{
				JOptionPane.showMessageDialog(null, "|InTiAtInG HaCkxSS012134999|");
			}
			//MemoryGame method is called to initiate game startup and to make code more tidy
			JOptionPane.showMessageDialog(null, "GamE STARts");
			MemoryGame(Answer2);
		}
		//else if statement to test if answer is no
		else if (answer.equalsIgnoreCase("no")||answer.equalsIgnoreCase("nope")||answer.equalsIgnoreCase("nay"))
		{
			JOptionPane.showMessageDialog(null, "Well ok then...");
			System.exit(0);
		}
		//else statement for answer that is not yes or no
		else 
		{
			JOptionPane.showMessageDialog(null, "AAHH!!11 INCORRECT RESPONSEEE eeE SHuTTTttInG DOwnN SYSTEMMMSSS000ERR0RR");
			System.exit(0);
		}
	}
	
	//method that takes Answer2 from main method to verify if hacks are on
	public static void MemoryGame(String Answer2)
	{
		//initialize guesses with 3 tries


		int guesses = 3;
		
		//if statement to verify hacks
		if (Answer2.equalsIgnoreCase("hacks"))
		{
			//change guesses to 2000
			guesses=2000;
		}
		
		//calls method numberGenerator to generate 3 random numbers and places them into an integer array for round 1
		int numbers[]=NumberGenerator();
		
		//calls method to create three random positions and places them into integer array called positions
		int position[]=RandomPosition();
				
		//Sends positions and numbers to the 3 lines for the first round 
		ArrayList<String> line1=line1(numbers,position);
		ArrayList<String> line2=line2(numbers,position);
		ArrayList<String> line3=line3(numbers,position);
		
		//round 1 header
		JOptionPane.showMessageDialog(null,"Round 1\n"+line1.get(0)+line1.get(1)+line1.get(2)+line1.get(3)
			+"\n"+line2.get(0)+line2.get(1)+line2.get(2)+line2.get(3)
			+"\n"+line3.get(0)+line3.get(1)+line3.get(2)+line3.get(3));
		
		//LINE 1 round 1
		
		String LINE1=JOptionPane.showInputDialog("Guesses: "+guesses+"\nline 1: ");
		
		char answer[]=LINE1.toCharArray();
		char number=Character.forDigit(numbers[0], 10);
		
		System.out.println(LINE1+":"+numbers[0]);
		
		if (answer[0]==number)
		{
			JOptionPane.showMessageDialog(null,"YES!!!!");
		}
		while(answer[0]!=number)
		{
			guesses--;
			JOptionPane.showMessageDialog(null,"INCORRECT\nguesses: "+guesses);
			if(guesses!=0)
			{
				JOptionPane.showMessageDialog(null,"Round 1\n"+line1.get(0)+line1.get(1)+line1.get(2)+line1.get(3)
				+"\n"+line2.get(0)+line2.get(1)+line2.get(2)+line2.get(3)
				+"\n"+line3.get(0)+line3.get(1)+line3.get(2)+line3.get(3));
				LINE1=JOptionPane.showInputDialog("Guesses: "+guesses+"\nline 1: ");
				answer=LINE1.toCharArray();
				if (answer[0]==number)
				{
					JOptionPane.showMessageDialog(null,"YES!!!!");
				}
			}
			if (guesses==0)
			{
				System.exit(0); 
				
			}
		}
		
		//LINE 2 round 1
		
		String LINE2=JOptionPane.showInputDialog("Guesses: "+guesses+"\nline 2: ");
		
		char answer2[]=LINE2.toCharArray();
		char number2=Character.forDigit(numbers[1], 10);
		
		System.out.println(LINE2+":"+numbers[1]);
		
		if (answer2[0]==number2)
		{
			JOptionPane.showMessageDialog(null,"YES!!!!");
		}
		while(answer2[0]!=number2)
		{
			guesses--;
			JOptionPane.showMessageDialog(null,"INCORRECT\nguesses: "+guesses);
			if(guesses!=0)
			{
				JOptionPane.showMessageDialog(null,"Round 1\n"+line1.get(0)+line1.get(1)+line1.get(2)+line1.get(3)
				+"\n"+line2.get(0)+line2.get(1)+line2.get(2)+line2.get(3)
				+"\n"+line3.get(0)+line3.get(1)+line3.get(2)+line3.get(3));
				LINE2=JOptionPane.showInputDialog("Guesses: "+guesses+"\nline 2: ");
				answer2=LINE2.toCharArray();
				if (answer2[0]==number2)
				{
					JOptionPane.showMessageDialog(null,"YES!!!!");
				}
			}
			if (guesses==0)
			{
				System.exit(0); 
				
			}
		}
		
		//LINE 3 round 1
		
		String LINE3=JOptionPane.showInputDialog("Guesses: "+guesses+"\nline 3: ");
		
		char answer3[]=LINE3.toCharArray();
		char number3=Character.forDigit(numbers[2], 10);
		
		System.out.println(LINE3+":"+numbers[2]);
		
		if (answer3[0]==number3)
		{
			JOptionPane.showMessageDialog(null,"YES!!!!");
		}
		while(answer3[0]!=number3)
		{
			guesses--;
			JOptionPane.showMessageDialog(null,"INCORRECT\nguesses: "+guesses);
			if(guesses!=0)
			{
				JOptionPane.showMessageDialog(null,"Round 1\n"+line1.get(0)+line1.get(1)+line1.get(2)+line1.get(3)
				+"\n"+line2.get(0)+line2.get(1)+line2.get(2)+line2.get(3)
				+"\n"+line3.get(0)+line3.get(1)+line3.get(2)+line3.get(3));
				LINE3=JOptionPane.showInputDialog("Guesses: "+guesses+"\nline 3: ");
				answer3=LINE3.toCharArray();
				if (answer3[0]==number3)
				{
					JOptionPane.showMessageDialog(null,"YES!!!!");
				}
			}
			if (guesses==0)
			{
				System.exit(0); 
				
			}
		}
		
		//made it past round 1
		JOptionPane.showMessageDialog(null, "Good job you made it past round 1!");
		
		
		//calls numberGenerator method to create 6 random numbers into an array for round 2
		int numbers2_1[]=NumberGenerator();
		int numbers2_2[]=NumberGenerator();	
		
		//calls method to create 6 random positions and places them into array for round 2
		int BING1[]=BING1();
		int BING2[]=BING2();
		
		System.out.println(BING1[0]+" "+BING1[1]);
		System.out.println(BING2[0]+" "+BING2[1]);
		
		//Sends positions and numbers to the 3 lines for the second round
		ArrayList<String> line1_2=line1_2(numbers2_1,numbers2_2,BING1,BING2);
		ArrayList<String> line2_2=line2_2(numbers2_1,numbers2_2,BING1,BING2);
		ArrayList<String> line3_2=line3_2(numbers2_1,numbers2_2,BING1,BING2);
		
		
		//round 2 header
		JOptionPane.showMessageDialog(null,"Round 2\n"+line1_2.get(0)+line1_2.get(1)+line1_2.get(2)+line1_2.get(3)
		+"\n"+line2_2.get(0)+line2_2.get(1)+line2_2.get(2)+line2_2.get(3)
		+"\n"+line3_2.get(0)+line3_2.get(1)+line3_2.get(2)+line3_2.get(3));
		
		
		
		
		
		
		
		
		
		
		//Line 1 round 2
		System.out.println(numbers2_1[0]+" "+numbers2_2[0]);
		
		String LINE1_2=JOptionPane.showInputDialog("Guesses: "+guesses+"\nline 1: ");
		char answer1_2[]=LINE1_2.toCharArray();
		
		System.out.println(LINE1_2+":"+numbers2_1[0]+" "+numbers2_2[0]);
		while (answer1_2.length<2)
		{
			LINE1_2=JOptionPane.showInputDialog("Error answer must contain 2 numbers");
			answer1_2=LINE1_2.toCharArray();
			
		}
		if (line1_2.contains(answer1_2[0]+" ") && line1_2.contains(answer1_2[1]+" "))
		{
				JOptionPane.showMessageDialog(null,"YES!!!!");
		}
		
		while (!line1_2.contains(answer1_2[0]+" ") || !line1_2.contains(answer1_2[1]+" "))
		{
			guesses--;
			JOptionPane.showMessageDialog(null,"INCORRECT\nguesses: "+guesses);
			if (guesses!=0)
			{
				JOptionPane.showMessageDialog(null,"Round 2\n"+line1_2.get(0)+line1_2.get(1)+line1_2.get(2)+line1_2.get(3)
				+"\n"+line2_2.get(0)+line2_2.get(1)+line2_2.get(2)+line2_2.get(3)
				+"\n"+line3_2.get(0)+line3_2.get(1)+line3_2.get(2)+line3_2.get(3));
			
				LINE1_2=JOptionPane.showInputDialog("Guesses: "+guesses+"\nline 1: ");
				answer1_2=LINE1_2.toCharArray();
				System.out.println(answer1_2);
				while (answer1_2.length<2)
				{
					LINE1_2=JOptionPane.showInputDialog("Error answer must contain 2 numbers");
					answer1_2=LINE1_2.toCharArray();
				}
				if (line1_2.contains(answer1_2[0]+" ") && line1_2.contains(answer1_2[1]+" "))
				{
						JOptionPane.showMessageDialog(null,"YES!!!!");
				}
			}
			
			if (guesses==0)
			{
				System.exit(0); 
				
			}
		}
		
		
		
		//Line 2 Round 2
		System.out.println(numbers2_1[1]+" "+numbers2_2[1]);
		
		String LINE2_2=JOptionPane.showInputDialog("Guesses: "+guesses+"\nline 2: ");
		char answer2_2[]=LINE2_2.toCharArray();
		
		System.out.println(LINE2_2+":"+numbers2_1[1]+" "+numbers2_2[1]);
		while (answer2_2.length<2)
		{
			LINE2_2=JOptionPane.showInputDialog("Error answer must contain 2 numbers");
			answer2_2=LINE2_2.toCharArray();
		}
		if (line2_2.contains(answer2_2[0]+" ") && line2_2.contains(answer2_2[1]+" "))
		{
				JOptionPane.showMessageDialog(null,"YES!!!!");
		}
		
		while (!line2_2.contains(answer2_2[0]+" ") || !line2_2.contains(answer2_2[1]+" "))
		{
			guesses--;
			JOptionPane.showMessageDialog(null,"INCORRECT\nguesses: "+guesses);
			if (guesses!=0)
			{
				JOptionPane.showMessageDialog(null,"Round 2\n"+line1_2.get(0)+line1_2.get(1)+line1_2.get(2)+line1_2.get(3)
				+"\n"+line2_2.get(0)+line2_2.get(1)+line2_2.get(2)+line2_2.get(3)
				+"\n"+line3_2.get(0)+line3_2.get(1)+line3_2.get(2)+line3_2.get(3));
			
				LINE2_2=JOptionPane.showInputDialog("Guesses: "+guesses+"\nline 2: ");
				answer2_2=LINE2_2.toCharArray();
				System.out.println(answer2_2);
				while (answer2_2.length<2)
				{
					LINE2_2=JOptionPane.showInputDialog("Error answer must contain 2 numbers");
					answer2_2=LINE2_2.toCharArray();
				}
				if (line2_2.contains(answer2_2[0]+" ") && line2_2.contains(answer2_2[1]+" "))
				{
						JOptionPane.showMessageDialog(null,"YES!!!!");
				}
			}
			
			if (guesses==0)
			{
				System.exit(0); 
				
			}
		}
		
		
		
		//LINE 3 round 2
		System.out.println(numbers2_1[2]+" "+numbers2_2[2]);
		
		String LINE3_2=JOptionPane.showInputDialog("Guesses: "+guesses+"\nline 3: ");
		char answer3_2[]=LINE3_2.toCharArray();
		
		System.out.println(LINE2_2+":"+numbers2_1[2]+" "+numbers2_2[2]);
		while (answer3_2.length<2)
		{
			LINE3_2=JOptionPane.showInputDialog("Error answer must contain 2 numbers");
			answer3_2=LINE3_2.toCharArray();
		}
		if (line3_2.contains(answer3_2[0]+" ") && line3_2.contains(answer3_2[1]+" "))
		{
				JOptionPane.showMessageDialog(null,"YES!!!!");
		}
		
		while (!line3_2.contains(answer3_2[0]+" ") || !line3_2.contains(answer3_2[1]+" "))
		{
			guesses--;
			JOptionPane.showMessageDialog(null,"INCORRECT\nguesses: "+guesses);
			if (guesses!=0)
			{
				JOptionPane.showMessageDialog(null,"Round 2\n"+line1_2.get(0)+line1_2.get(1)+line1_2.get(2)+line1_2.get(3)
				+"\n"+line2_2.get(0)+line2_2.get(1)+line2_2.get(2)+line2_2.get(3)
				+"\n"+line3_2.get(0)+line3_2.get(1)+line3_2.get(2)+line3_2.get(3));
			
				LINE3_2=JOptionPane.showInputDialog("Guesses: "+guesses+"\nline 3: ");
				answer3_2=LINE3_2.toCharArray();
				System.out.println(answer3_2);
				while (answer3_2.length<2)
				{
					LINE3_2=JOptionPane.showInputDialog("Error answer must contain 2 numbers");
					answer3_2=LINE3_2.toCharArray();
				}
				if (line3_2.contains(answer3_2[0]+" ") && line3_2.contains(answer3_2[1]+" "))
				{
						JOptionPane.showMessageDialog(null,"YES!!!!");
				}
			}
			
			if (guesses==0)
			{
				System.exit(0); 
				
			}
		}
		
		//found on http://textart4u.blogspot.ca/2012/04/thumbs-up-and-big-like-text-art.html
		JOptionPane.showMessageDialog(null,"________$$$$____________________\n"
										 + "_______$$__$____________________\n"
										 + "_______$___$$___________________\n"
										 + "_______$___$$___________________\n"
										 + "_______$$___$$__________________\n"
										 + "________$____$$_________________\n"
										 + "________$$____$$$_______________\n"
										 + "_________$$_____$$______________\n"
										 + "_________$$______$$_____________\n"
										 + "__________$_______$$____________\n"
										 + "____$$$$$$$________$$___________\n"
										 + "__$$$_______________$$$$$$______\n"
										 + "_$$____$$$$____________$$$______\n"
										 + "_$___$$$__$$$____________$$_____\n"
										 + "_$$________$$$____________$_____\n"
										 + "__$$____$$$$$$____________$_____\n"
										 + "__$$$$$$$____$$___________$_____\n"
										 + "__$$_______$$$$___________$_____\n"
										 + "___$$$$$$$$$__$$_________$$_____\n"
										 + "____$________$$$$_____$$$$______\n"
										 + "____$$____$$$$$$____$$$$$$______\n"
										 + "_____$$$$$$____$$__$$___________\n"
										 + "_______$_____$$$_$$$____________\n"
										 + "________$$$$$$$$$$______________\n"
										 + ""
										 + "        you win                 ");
		JOptionPane.showMessageDialog(null,"It looks to me like you have good memory bye");
		
	}
	

	
	
	
	
	//LINES FOR ROUND 1
	
	 //line1 round 1
	public static ArrayList<String> line1(int numbers[],int[] positions)
	{
		ArrayList<String> line1 = new ArrayList<String>();
		
		//for loop creates array that looks like "- - - - "
		for (int i = 0; i < 4; i++)
		{
			line1.add("- ");
		}
		
		//adds random number to random position in first line
		line1.add(positions[0],numbers[0]+" ");
		
		//returns line 1 back to memory game
		return line1;
	}
	
	//line 2 round 1
	public static ArrayList<String> line2(int numbers[],int[] positions)
	{
		ArrayList<String> line2 = new ArrayList<String>();
		
		//for loop creates array that looks like "- - - - "
		for (int i = 0; i < 4; i++)
		{
			line2.add("- ");
		}
		//adds random number to random position in second line
		line2.add(positions[1],numbers[1]+" ");
		
		//returns line 2 back to memory game
		return line2;
	}

	//line 3 round 1
	public static ArrayList<String> line3(int numbers[],int[] positions)
	{
		ArrayList<String> line3 = new ArrayList<String>();
		
		//for loop creates array that looks like "- - - - "
		for (int i = 0; i < 4; i++)
		{
			line3.add("- ");
		}
		//adds random number to random position in third line
		line3.add(positions[2],numbers[2]+" ");
		
		//returns line 3 back to memory game
		return line3;
	}
	
	
	
	//LINES FOR ROUND 2
	
	
	
	//number either 0 and 1 BING1
	public static int[] BING1()
	{
		Random randomNum= new Random();
		
		//initializes randomPosition integer array to be able to hold 3 numbers 
		int randomPosition[]=new int [2];
		
		//For loop to create 2 random numbers
		for (int i = 0; i < randomPosition.length; i++)
		{
			int numberPosition=randomNum.nextInt(2);
			randomPosition[i]=numberPosition;
		}
		
		return randomPosition;
	}
	
	//number either 2 or 3  BING2
	public static int[] BING2()
	{
		Random randomNum= new Random();
		
		//initializes randomPosition integer array to be able to hold 3 numbers 
		int randomPosition[]=new int [2];
		int AvailablePositions[]={2,3};
		int positions[]=new int [2];
		//For loop to create 2 random numbers
		for (int i = 0; i < randomPosition.length; i++)
		{
			int numberPosition=randomNum.nextInt(2);
			randomPosition[i]=numberPosition;
		}
		for (int i = 0; i < positions.length; i++)
		{
			positions[i]=AvailablePositions[randomPosition[i]];
		}
		
		return positions;
	}
	
	
	
	
	//line 1 round 2
	public static ArrayList<String> line1_2(int [] numbers1,int [] numbers2,int [] BING1,int [] BING2)
	{
		ArrayList<String> line1 = new ArrayList<String>();
		
		//for loop creates array that looks like "- - - - "
		for (int i = 0; i < 4; i++)
		{
			line1.add("- ");
		}
		
		//adds random number to random position in first line
		line1.add(BING1[0],numbers1[0]+" ");
		line1.add(BING2[0],numbers2[0]+" ");
		
		return line1;
	}
	
	//line 2 round 2
	public static ArrayList<String> line2_2(int [] numbers1,int [] numbers2,int [] BING1,int [] BING2)
	{
		ArrayList<String> line2 = new ArrayList<String>();
		
		//for loop creates array that looks like "- - - - "
		for (int i = 0; i < 4; i++)
		{
			line2.add("- ");
		}
		
		//adds random number to random position in first line
		line2.add(BING1[1],numbers1[1]+" ");
		line2.add(BING2[1],numbers2[1]+" ");
		
		return line2;
	}

	//line 3 round 2
	public static ArrayList<String> line3_2(int [] numbers1,int [] numbers2,int [] BING1,int [] BING2)
	{
		ArrayList<String> line3 = new ArrayList<String>();
		
		//for loop creates array that looks like "- - - - "
		for (int i = 0; i < 4; i++)
		{
			line3.add("- ");
		}
		
		//adds random number to random position in first line
		line3.add(BING1[1],numbers1[2]+" ");
		line3.add(BING2[0],numbers2[2]+" ");
		
		return line3;
	}
	
	//To generate the positions where the numbers go in
	public static int[] RandomPosition()
	{
		Random randomNum= new Random();
		
		//initializes randomPosition integer array to be able to hold 3 numbers 
		int randomPosition[]=new int [3];
		
		//For loop to create 3 random numbers
		for (int i = 0; i < randomPosition.length; i++)
		{
			int numberPosition=randomNum.nextInt(4);
			randomPosition[i]=numberPosition;
		}
		
		return randomPosition;
	}
	
	
	//Creates 3 random numbers between 1 and 9 into an array
	public static int[] NumberGenerator()
	{
		Random randomNum= new Random();
		int randomNumbers[]=new int [3];
		for (int i = 0; i < randomNumbers.length; i++)
		{
			int number=randomNum.nextInt(10);
			randomNumbers[i]=number;
		}
		return randomNumbers;
	}

}



