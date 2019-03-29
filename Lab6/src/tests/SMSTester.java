package tests;

import model.CourseRecord;
import model.Faculty;
import model.Student;
import model.StudentManagementSystem;

public class SMSTester {

	public static void main(String[] args) {
		System.out.println("=============== (0)");
		/*
		 * Review this part (0), which should produce the expected output
		 * if you followed the tutorial videos properly. 
		 * Note. You may want to improve the getGPA() method in Student class,
		 * so that it returns 0.0 when the student has not registered any courses yet. 
		 */
		Faculty f1 = new Faculty("Jonathan", "LAS2045", 70139);
		Faculty f2 = new Faculty("Jackie", "LAS2043", 70130);
		System.out.println(f1.getDescription());
		System.out.println(f2.getDescription());

		CourseRecord cr1 = new CourseRecord("2030");
		CourseRecord cr2 = new CourseRecord("1021");
		CourseRecord cr3 = new CourseRecord("1021");
		CourseRecord cr4 = new CourseRecord("3311");
		System.out.println(cr1.getDescription());
		System.out.println(cr2.getDescription());
		System.out.println(cr3.getDescription());
		System.out.println(cr4.getDescription());

		cr1.setInstructor(f2);
		cr2.setInstructor(f2);
		cr3.setInstructor(f2);
		cr4.setInstructor(f1);
		System.out.println(cr1.getDescription());
		System.out.println(cr2.getDescription());
		System.out.println(cr3.getDescription());
		System.out.println(cr4.getDescription());

		Student s1 = new Student("Suyeon");
		Student s2 = new Student("Yuna");
		System.out.println(s1.getDescription());
		System.out.println(s2.getDescription());

		s1.addCourse(cr1);
		s1.addCourse(cr2); 
		s2.addCourse(cr3);
		s2.addCourse(cr4);
		System.out.println(s1.getDescription());
		System.out.println(s2.getDescription());

		System.out.println("=============== (1)");
		/* Initializing a student management system (SMS) storing no students.
		 * It is assumed that each SMS stores up to and including 100 students. 
		 */
		StudentManagementSystem sms = new StudentManagementSystem();
		System.out.println(sms.getDescription());
		/*
		 * For this getStudents method, what return type is expected?
		 * Refer to this written note for hint:
		 * https://www.eecs.yorku.ca/~jackie/teaching/lectures/2019/W/EECS1021/notes/EECS1021_W19_Notes_Tracing_PointCollectorTester.pdf
		 */ 
		Student[] students = sms.getStudents();
		System.out.println("Size of SMS: " + students.length);

		System.out.println("=============== (2.1)");
		/*
		 * Register two students into the system.
		 */
		sms.addStudent(s1);
		sms.addStudent(s2);
		/* Hint: You may want to reuse the getDescription() method 
		 * from some other class.
		 */
		System.out.println(sms.getDescription());
		
		System.out.println("=============== (2.2)");
		System.out.println("Size of SMS: " + sms.getStudents().length);
		System.out.print("Students successfully added: ");
		System.out.println(sms.getStudents()[0] == s1 && sms.getStudents()[1] == s2);

		System.out.println("=============== (3)");
		/*
		 * Inquire about the marks based on the student's name
		 * and the title of course they are taking. 
		 */
		System.out.println(sms.getMarks("Suyeon", "2030"));
		System.out.println(sms.getMarks("Suyeon", "1021"));
		System.out.println(sms.getMarks("Yuna", "1021"));
		System.out.println(sms.getMarks("Yuna", "3311"));

		System.out.println("=============== (4)");
		/*
		 * Change the marks, given the student's name
		 * the title of course they are taking, and the new marks.
		 */
		sms.setMarks("Suyeon", "2030", 67);
		sms.setMarks("Suyeon", "1021", 75);
		sms.setMarks("Yuna", "1021", 88);
		sms.setMarks("Yuna", "3311", 91);
		// Now the marks for the two students should be updated.
		System.out.println(sms.getMarks("Suyeon", "2030"));
		System.out.println(sms.getMarks("Suyeon", "1021"));
		System.out.println(sms.getMarks("Yuna", "1021"));
		System.out.println(sms.getMarks("Yuna", "3311"));

		System.out.println("=============== (5)");
		/*
		 * Obtain the GPA of students, given their names.
		 */
		System.out.println("Suyeon's GPA: " + sms.getGPA("Suyeon"));
		System.out.println("Yuna's GPA: " + sms.getGPA("Yuna"));

		System.out.println("=============== (6)");
		/* 
		 * Inquire marks about a non-existing student.
		 * (In this case, marks of -1 is expected).
		 */
		System.out.println(sms.getMarks("Heeyeon", "2030"));
		System.out.println(sms.getMarks("Heeyeon", "1021"));
		System.out.println(sms.getMarks("Heeyeon", "3311"));
		/* 
		 * Inquire marks about a course that the student is not taking.
		 * (In this case, marks of -1 is expected)
		 */
		System.out.println(sms.getMarks("Suyeon", "3311"));
		System.out.println(sms.getMarks("Yuna", "2030"));

		System.out.println("=============== (7)");
		/*
		 * Set the marks for a student that does not exist.
		 * (In this case, just do nothing and make no changes).
		 */
		sms.setMarks("Heeyeon", "2030", 90);
		System.out.println(sms.getDescription());
		
		System.out.println("=============== (8)");
		/*
		 * Set the marks for a course that the student is not taking.
		 * (In this case, just do nothing and make no changes).
		 */
		sms.setMarks("Suyeon", "3311", 81);
		sms.setMarks("Yuna", "2030", 71);
		System.out.println(sms.getMarks("Suyeon", "3311"));
		System.out.println(sms.getMarks("Yuna", "2030"));
		System.out.println("Suyeon's GPA: " + sms.getGPA("Suyeon"));
		System.out.println("Yuna's GPA: " + sms.getGPA("Yuna"));
 
		System.out.println("=============== (9.1)");
		/*
		 * Add a new student with some given name.
		 */
		sms.addStudent("Heeyeon");
		System.out.println(sms.getDescription());
		
		System.out.println("=============== (9.2)");
		System.out.println("Size of SMS: " + sms.getStudents().length);
		System.out.print("Students successfully added: ");
		System.out.println(sms.getStudents()[2].name.equals("Heeyeon"));
		
		System.out.println("=============== (10)");
		/*
		 * Register courses for a student with the given name.
		 */
		CourseRecord cr5 = new CourseRecord("3311");
		CourseRecord cr6 = new CourseRecord("4302");
		CourseRecord cr7 = new CourseRecord("4080");
		sms.addCourse("Heeyeon", cr5);
		sms.addCourse("Heeyeon", cr6);
		sms.addCourse("Heeyeon", cr7);
		System.out.println(sms.getDescription());
		
		System.out.println("=============== (11)");
		/*
		 * Change the marks, given the student's name
		 * the title of course they are taking, and the new marks.
		 */
		sms.setMarks("Heeyeon", "3311", 55);
		sms.setMarks("Heeyeon", "4302", 91);
		sms.setMarks("Heeyeon", "4080", 71);
		sms.setMarks("Heeyeon", "2030", 77);
		System.out.println(sms.getMarks("Heeyeon", "3311"));
		System.out.println(sms.getMarks("Heeyeon", "4302"));
		System.out.println(sms.getMarks("Heeyeon", "4080"));
		System.out.println("Heeyeon's GPA: " + sms.getGPA("Heeyeon"));

	}

}