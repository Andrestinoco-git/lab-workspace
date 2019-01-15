
public class LogicalOperations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean p=false;
		boolean q=false;
		boolean conjunction=p&&q;
		System.out.println("Conjunction of "+p+" and "+q+" is: "+conjunction);
		System.out.println("Disjunction of "+p+" and "+q+" is: "+(p||q));

		p=false;
		q=true;
		conjunction=p&&q;
		System.out.println("Conjunction of "+p+" and "+q+" is: "+conjunction);
		System.out.println("Disjunction of "+p+" and "+q+" is: "+(p||q));
		
		p=true;
		q=false;
		conjunction=p&&q;
		System.out.println("Conjunction of "+p+" and "+q+" is: "+conjunction);
		System.out.println("Disjunction of "+p+" and "+q+" is: "+(p||q));
		
		p=true;
		q=true;
		conjunction=p&&q;
		System.out.println("Conjunction of "+p+" and "+q+" is: "+conjunction);
		System.out.println("Disjunction of "+p+" and "+q+" is: "+(p||q));
	}

}
