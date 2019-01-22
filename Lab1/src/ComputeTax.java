
import java.util.Scanner;
public class ComputeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double t1=0,t2=0,t3=0,totalTax=0;
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
					t1=(income)*0.1;
					t2=0;
					totalTax=t1+t2+t3;
					System.out.println(name+", you should pay $"+totalTax);
					System.out.println("Calculation is based on the scheme of Single Filing: ");
					System.out.println("Part I: $"+t1);
				}
				else if (income>8350&&income<=33950) {
					taxrate=15;
					t1=835.0;
					t2=(income-8350)*0.15;
					totalTax=t1+t2+t3;
					System.out.println(name+", you should pay $"+totalTax);
					System.out.println("Calculation is based on the scheme of Single Filing: ");
					System.out.println("Part I: $"+t1+"\r\n" + 
							"Part II: $"+t2);
				}
				else if (income>33950) 
				{
					taxrate=25;
					t1=835.0;
					t2=3840.0;
					t3=(income-33950)*0.25;
					totalTax=t1+t2+t3;
					System.out.println(name+", you should pay $"+totalTax);
					System.out.println("Calculation is based on the scheme of Single Filing: ");
					System.out.println("Part I: $"+t1+"\r\n" + 
							"Part II: $"+t2+"\r\n" + 
							"Part III: $"+t3+"");
				}
			}
			else if (status==2) 
			{
				if (income<=16700&&income>=0) 
				{
					taxrate=10;
					t1=(income)*0.1;
					t2=0;
					totalTax=t1+t2+t3;
					System.out.println(name+", you should pay $"+totalTax);
					System.out.println("Calculation is based on the scheme of Married Filing: ");
					System.out.println("Part I: $"+t1);
					
				}
				else if (income>16700&&income<=67900) {
					taxrate=15;
					t1=1670.0;
					t2=(income-16700)*0.15;
					totalTax=t1+t2+t3;
					System.out.println(name+", you should pay $"+totalTax);
					System.out.println("Calculation is based on the scheme of Married Filing: ");
					System.out.println("Part I: $"+t1+"\r\n" + 
							"Part II: $"+t2);
				}
				else if (income>67900) 
				{
					taxrate=25;
					t1=1670.0;
					t2=7680.0;
					t3=(income-67900)*0.25;
					totalTax=t1+t2+t3;
					System.out.println(name+", you should pay $"+totalTax);
					System.out.println("Calculation is based on the scheme of Married Filing: ");
					System.out.println("Part I: $"+t1+"\r\n" + 
							"Part II: $"+t2+"\r\n" + 
							"Part III: $"+t3+"");
				}
			}
			
		}
		else {
			System.out.println("Illegal status: "+status);
		}
	}

}
