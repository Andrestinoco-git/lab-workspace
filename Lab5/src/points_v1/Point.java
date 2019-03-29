package points_v1;

public class Point 
{
	double x;
	double y;
	
	
	Point(double x, double y){
		this.x=x;
		this.y=y;
//		x=x;
//		this.x=this.x
	}
	Point(char axis, double distance){
		if (axis=='x') {
			x=distance;
			y=0;
		}
		else {
			this.x=0;
			this.y=distance;
		}
	}
	
}
