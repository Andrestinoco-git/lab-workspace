package model;

public class CourseRecord {
	public String title;
	public int marks;
	public Faculty instructor;
	
	public CourseRecord() {
		
	}
	public CourseRecord(String title) {
		this.title=title;
	}
	public CourseRecord(String title, int marks) {
		this.title=title;
		this.marks=marks;
	}
	public String getDescription(){
		
		String desc="";
		if(this.instructor ==null) {
			desc="Course "+this.title+" (raw marks: "+ this.marks +") has no instructor";
		}
		else {
			desc = "Course "+this.title+" (raw marks: "+this.marks+") and letter grade "+this.getLetterGrade()+") has instructor "+this.instructor.getDescription();
		}
		return desc; 
	}
	public String getTitle() {
		return title;
	}
	public int getMarks() {
		return marks;
	}
	public Faculty getInstructor() {
		return instructor;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void setInstructor(Faculty instructor) {
		this.instructor = instructor;
	}
	String getLetterGrade() {
		String lg="";
		if (this.marks>=90) {
			lg="A+";
		}
		else if (this.marks>=80) {
			lg="A";
		}
		else if (this.marks>=70) {
			lg="B";
		}
		else if (this.marks>=60) {
			lg="C";
		}
		else if (this.marks>=50) {
			lg="D";
		}
		else {
			lg="F";
		}
		return lg;
	}
}
