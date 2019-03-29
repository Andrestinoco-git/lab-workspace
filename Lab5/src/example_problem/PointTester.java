package example_problem;

public class PointTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point(3.2,-4.8);
		Point p2=new Point('y',8.3);
		
		String desc1=p1.getDescription();
		
		String desc2=p2.getDescription();
		System.out.println("=============");
		System.out.println("p1 is: "+desc1);
		System.out.println("p2 is: "+desc2);
		
		p1.move('U', 3.4);
		p2.move('L', 3.2);
		
		System.out.println("After moving p1 and p2.");
		
		desc1=p1.getDescription();
		desc2=p2.getDescription();
		System.out.println("=========");
		System.out.println("p1 is "+desc1);
		System.out.println("p2 is ");
		

	}

}
