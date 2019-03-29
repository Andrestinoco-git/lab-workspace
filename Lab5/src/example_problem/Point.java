package example_problem;

public class Point {
	double x;
	double y;
	Point(double x, double y){
		this.x=x;
		this.y=y;
	}
	Point(char c,double distance){
		if (c=='x') {
			this.y=0;
			this.x=distance;
		}
		else {
			this.x=0;
			this.y=distance;
		}
	}
	String getDescription() {
		String result="";
		result="("+this.x+", "+this.y+")";
		
		return result;
	}
	void move(char c, double d) {
		if (c=='U') {
			this.y+=d;
		}
		else if (c=='D') {
			this.y-=d;
			
		}
		else if (c=='L') {
			this.x-=d;
		}
		else {
			this.x+=d;
		}
	}
}
