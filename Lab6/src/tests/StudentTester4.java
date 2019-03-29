package tests;

import model.CourseRecord;
import model.Student;

public class StudentTester4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CourseRecord cr1=new CourseRecord("2030");
		CourseRecord cr2=new CourseRecord("1021");
		CourseRecord cr3=new CourseRecord("3311");
		
		Student s1=new Student("SunHye");
		Student s2=new Student("JiHye");
		
		s1.addCourse(cr1);
		s2.addCourse(cr2);
		s1.addCourse(cr2);
		s2.addCourse(cr3);
		
		System.out.println(s1.getMarks("2030"));
		System.out.println(s1.getMarks("1021"));
		s1.setMarks("2030", 60);
		s1.setMarks("1021", 90);
		System.out.println("After setting 2030 and 1021 marks...");
		System.out.println(s1.getMarks("2030"));
		System.out.println(s1.getMarks("1021"));
		
		
	}

}
