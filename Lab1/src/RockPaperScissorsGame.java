import java.util.Scanner;
public class RockPaperScissorsGame {

	public static void main(String[] args) 
	{
		int p1wins=0,p2wins=0;
		String c1,c2;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name of player 1: ");
		String name1=input.nextLine();
		System.out.println("Enter the name of player 2: ");
		String name2=input.nextLine();
		System.out.println("========\r\n" + 
				"Round 1:\r\n" + 
				"========");
		System.out.println("What does "+name1+" play? (R, P, or S)");
		c1=input.nextLine();
		System.out.println("What does "+name2+" play?");
		c2=input.nextLine();
		if (c1.equals("R")&&c2.contentEquals("R")) {
			
		}
		if (c1.equals("R")&&c2.contentEquals("P")) {
			p2wins++;
		}
		if (c1.equals("R")&&c2.contentEquals("S")) {
			p1wins++;
		}
		
		if (c1.equals("P")&&c2.contentEquals("R")) {
			p1wins++;
		}
		if (c1.equals("P")&&c2.contentEquals("P")) {
			
		}
		if (c1.equals("P")&&c2.contentEquals("S")) {
			p2wins++;
		}
		
		if (c1.equals("S")&&c2.contentEquals("R")) {
			p2wins++;
		}
		if (c1.equals("S")&&c2.contentEquals("P")) {
			p1wins++;
		}
		if (c1.equals("S")&&c2.contentEquals("S")) {
			
		}
		System.out.println("========\r\n" + 
				"Round 2:\r\n" + 
				"========");
		System.out.println("What does "+name1+" play? (R, P, or S)");
		c1=input.nextLine();
		System.out.println("What does "+name2+" play?");
		c2=input.nextLine();
		if (c1.equals("R")&&c2.contentEquals("R")) {
			
		}
		if (c1.equals("R")&&c2.contentEquals("P")) {
			p2wins++;
		}
		if (c1.equals("R")&&c2.contentEquals("S")) {
			p1wins++;
		}
		
		if (c1.equals("P")&&c2.contentEquals("R")) {
			p1wins++;
		}
		if (c1.equals("P")&&c2.contentEquals("P")) {
			
		}
		if (c1.equals("P")&&c2.contentEquals("S")) {
			p2wins++;
		}
		
		if (c1.equals("S")&&c2.contentEquals("R")) {
			p2wins++;
		}
		if (c1.equals("S")&&c2.contentEquals("P")) {
			p1wins++;
		}
		if (c1.equals("S")&&c2.contentEquals("S")) {
			
		}
		
		if (p1wins==p2wins) {
			System.out.println("========\r\n" + 
					"Round 3:\r\n" + 
					"========");
			System.out.println("What does "+name1+" play? (R, P, or S)");
			c1=input.nextLine();
			System.out.println("What does "+name2+" play?");
			c2=input.nextLine();
			if (c1.equals("R")&&c2.contentEquals("R")) {
				
			}
			if (c1.equals("R")&&c2.contentEquals("P")) {
				p2wins++;
			}
			if (c1.equals("R")&&c2.contentEquals("S")) {
				p1wins++;
			}
			
			if (c1.equals("P")&&c2.contentEquals("R")) {
				p1wins++;
			}
			if (c1.equals("P")&&c2.contentEquals("P")) {
				
			}
			if (c1.equals("P")&&c2.contentEquals("S")) {
				p2wins++;
			}
			
			if (c1.equals("S")&&c2.contentEquals("R")) {
				p2wins++;
			}
			if (c1.equals("S")&&c2.contentEquals("P")) {
				p1wins++;
			}
			if (c1.equals("S")&&c2.contentEquals("S")) {
				
			}
		}
		if (p1wins>p2wins) {
			System.out.println("Game over: "+name1+" wins!");
		}
		if (p1wins<p2wins) {
			System.out.println("Game over: "+name2+" wins!");
		}
		if (p1wins==p2wins) {
			System.out.println("Game over: a tie between "+name1+" and "+name2);
		}
		
		
	}

}
