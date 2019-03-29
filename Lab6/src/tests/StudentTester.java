package tests;

import model.CourseRecord;
import model.Student;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseRecord cr1=new CourseRecord("2030");
		CourseRecord cr2=new CourseRecord("1021");
		CourseRecord cr3=new CourseRecord("3311");
		
		Student s1=new Student("Heeyeon");
		System.out.println("=== after creating s1");
		System.out.println(s1.getDescription());
		s1.addCourse(cr1);
		System.out.println("=== after adding cr1 to s1.courses");
		System.out.println(s1.getDescription());
		s1.addCourse(cr2);
		System.out.println("=== after adding cr2 to s1.courses");
		System.out.println(s1.getDescription());
		s1.addCourse(cr3);
		System.out.println("=== after adding cr3 to s1.courses");
		System.out.println(s1.getDescription());
	}

}
