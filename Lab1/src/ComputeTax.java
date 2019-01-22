
import java.util.Scanner;
public class ComputeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=input.nextLine();
		int taxrate=0;
		System.out.println(name+", enter your filing status (1 - Single Filing; 2 - Married Filing): ");
		int status=input.nextInt();
		if (status==1||status==2) 
		{
			System.out.println(name+" enter your taxable income:");
			int income=input.nextInt();
			if (status==1) 
			{
				if (income<=8350&&income>=0) 
				{
					taxrate=10;
				}
				else if (income>8350&&income<=33950) {
					taxrate=15;
				}
				else if (income>33950) 
				{
					taxrate=25;
				}
			}
			else if (status==2) 
			{
				if (income<=16700&&income>=0) 
				{
					taxrate=10;
				}
				else if (income>16700&&income<=67900) {
					taxrate=15;
				}
				else if (income>67900) 
				{
					taxrate=25;
				}
			}
			
		}
		else {
			System.out.println("Illegal status: "+status);
		}
	}

}
