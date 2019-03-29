package points_v1;

public class PointTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point(3,-4);
		Point p2=new Point(-2,-7);
		Point p3=new Point('y',8);
		Point p4=new Point('x',-5);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1 and p2 store different addresses: "+(p1!=p2));
		System.out.println("p1 and p2 store same address: "+(p1==p2));
		System.out.println(p3);
		System.out.println(p4);
		

	}

}
