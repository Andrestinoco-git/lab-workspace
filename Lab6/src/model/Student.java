package model;

public class Student {
	public String name;
	public CourseRecord[] courses;
	public String getName() {
		return name;
	}
	public final int MAX_NUM_COURSES=5;
	int noc;
	
	public Student(String name) {
		this.name=name;
		this.courses=new CourseRecord[MAX_NUM_COURSES];
		this.noc=0;
	}
	public void addCourse(CourseRecord c) {
		this.courses[this.noc]=c;
		this.noc++;
	}
	public void addCourse(String title) {
		CourseRecord c =new CourseRecord(title);
		this.addCourse(c);
	}
	double getGPA() {
		double gpa=0.0;
		double gp=0.0;
		if (this.noc>0) {
			for (int j = 0; j < this.noc; j++) {
				String lg=this.courses[j].getLetterGrade();
				if(lg.equals("A+")) {
					gp+=9;
				}
				else if (lg.equals("A")) {
					gp+=8;
				}
				else if (lg.equals("B")) {
					gp+=7;
				}
				else if (lg.equals("C")) {
					gp+=6;
				}
				else if (lg.equals("D")) {
					gp+=5;
				}
				else   {
					gp+=0;
				}
			}
			gpa=gp/this.noc;
			}
		
		return gpa;
	}
	public String getDescription() {
		String result="";
		result+="Student "+this.name+" has registered "+this.noc+" courses (with gpa "+this.getGPA()+");\n";
		for (int i = 0; i < this.noc; i++) {
			result+=this.courses[i].getDescription()+"\n";
		}
		return result;
	}
	int indexOf(String title) {
		int index=-1;
		boolean found=false;
		for (int i = 0; i < this.noc&&!found; i++) {
			if (this.courses[i].getTitle().equals(title)) {
				found=true;
				index=i;
			}
		}
		return index;
	}
	public int getMarks(String title) {
		int marks=-1;
		int index=this.indexOf(title);
		if (index>=0) {
			marks=this.courses[index].getMarks();
		}
		return marks;
	}
	public void setMarks(String title, int marks) {
		int index=this.indexOf(title);
		if (index>=0) {
			this.courses[index].setMarks(marks);
		}
	}
	
}
