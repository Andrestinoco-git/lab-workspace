package tests;

import model.CourseRecord;
import model.Faculty;

public class CourseRecordTester {

	public static void main(String[] args) {
		Faculty f1 = new Faculty("Jackie", "LAS2043", 70310);
		Faculty f2 = new Faculty("Jonathan", "LAS2045", 70209);
		
		CourseRecord cr1 = new CourseRecord();
		System.out.println(cr1.getDescription());
		cr1.setTitle("EECS2030");
		cr1.setMarks(73);
		cr1.setInstructor(f1);
		System.out.println(cr1.getDescription());
		
		CourseRecord cr2=new CourseRecord("EECS1021",68);
		System.out.println(cr2.getDescription());
		
		
		CourseRecord cr3=new CourseRecord("EECS3311");
		System.out.println(cr3.getDescription());
		
	}

}
