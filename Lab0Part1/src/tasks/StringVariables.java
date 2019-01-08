package tasks;

public class StringVariables {

	public static void main(String[] args) 
	{
		String firstName="";
		String lastName="";
		int i=0;
		System.out.println("Person"+i+":"+lastName+firstName);
		
		firstName="Heeyeon";
		lastName="Kang";
		i=i+1;
		System.out.println("Person" + i+ ":" +lastName+firstName);
		firstName="Jihye";
		lastName="Park";
		i=i+1;
		System.out.println("Person"+i+":"+lastName+","+lastName);
	}

}
