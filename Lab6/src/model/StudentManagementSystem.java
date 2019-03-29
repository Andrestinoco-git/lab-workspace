package model;

public class StudentManagementSystem 
{
	public int numStudents=0;
	public static int MAX_SMS=100;
	public Student[] students=new Student[numStudents];
	public Student[] copy=new Student[MAX_SMS];
	
	
	public StudentManagementSystem()
	{
	}
	
	public String getDescription() 
	{
		String desc="";
		if (this.numStudents==0) {
			desc+="Student management system currently store no students."+"\n";
		} else {
			desc+="Student management system currently stores "+numStudents+" students."+"\n";
		}
		return desc;
	}
	public Student[] getStudents() {
		return this.students;
	}
	public void addStudent(Student student) {
		this.copy[numStudents]=student;
		this.numStudents++;
		this.students=new Student[numStudents];
		for (int i = 0; i < students.length; i++) {
			this.students[i]=this.copy[i];
		}
	}
	public void addStudent(String name) {
		Student s=new Student(name);
		this.copy[numStudents]=s;
		this.numStudents++;
		this.students=new Student[numStudents];
		for (int i = 0; i < students.length; i++) {
			this.students[i]=this.copy[i];
		}
	}
	public int getMarks(String name, String course) {
		int marks = -1;
		boolean found=false;
		for (int i = 0; i < this.numStudents&&!found; i++) {
			if (this.students[i].getName().equals(name)) {
				found=true;
				marks=this.students[i].getMarks(course);
			}
			
		}
		return marks;
	}
	public void setMarks(String name, String course, int mark) {
		boolean found=false;
		for (int i = 0; i <this.numStudents&&!found; i++) {
			if (this.students[i].getName().equals(name)) {
				found=true;
				this.students[i].setMarks(course, mark);
			}
		}
	}
	public double getGPA(String name) {
		double gpa=0.0;
		boolean found=false;
		for (int i = 0; i < this.numStudents&&!found; i++) {
			if (this.students[i].getName().equals(name)) {
				found =true;
				gpa=this.students[i].getGPA();
			}
		}
		return gpa;
	}
	public void addCourse(String name,CourseRecord course) {
		boolean found=false;
		for (int i = 0; i <this.numStudents&&!found; i++) {
			if (this.students[i].getName().equals(name)) {
				found=true;
				this.students[i].addCourse(course);
			}
		}
	}
	
}
