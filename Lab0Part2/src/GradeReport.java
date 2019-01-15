import java.util.Scanner;
public class GradeReport {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String name,className;
		int q1,q2,q3,q4,q5,q6,q7,q8,q9,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,t1,t2,t3,mid,finalExam;
		System.out.println("What is your name? ");
		name=input.nextLine();
		System.out.println(name+", what is your score for Quiz 1 (out of 100)?");
		q1=input.nextInt();
		System.out.println(name+", what is your score for Quiz 2 (out of 100)?");
		q2=input.nextInt();
		System.out.println(name+", what is your score for Quiz 3 (out of 100)?");
		q3=input.nextInt();
		System.out.println(name+", what is your score for Quiz 4 (out of 100)?");
		q4=input.nextInt();
		System.out.println(name+", what is your score for Quiz 5 (out of 100)?");
		q5=input.nextInt();
		System.out.println(name+", what is your score for Quiz 6 (out of 100)?");
		q6=input.nextInt();
		System.out.println(name+", what is your score for Quiz 7 (out of 100)?");
		q7=input.nextInt();
		System.out.println(name+", what is your score for Quiz 8 (out of 100)?");
		q8=input.nextInt();
		System.out.println(name+", what is your score for Quiz 9 (out of 100)?");
		q9=input.nextInt();
		
		System.out.println(name+", what is your score for Assignment 1 (out of 100)?");
		a1=input.nextInt();
		System.out.println(name+", what is your score for Assignment 2 (out of 100)?");
		a2=input.nextInt();
		System.out.println(name+", what is your score for Assignment 3 (out of 100)?");
		a3=input.nextInt();
		System.out.println(name+", what is your score for Assignment 4 (out of 100)?");
		a4=input.nextInt();
		System.out.println(name+", what is your score for Assignment 5 (out of 100)?");
		a5=input.nextInt();
		System.out.println(name+", what is your score for Assignment 6 (out of 100)?");
		a6=input.nextInt();
		System.out.println(name+", what is your score for Assignment 7 (out of 100)?");
		a7=input.nextInt();
		System.out.println(name+", what is your score for Assignment 8 (out of 100)?");
		a8=input.nextInt();
		System.out.println(name+", what is your score for Assignment 9 (out of 100)?");
		a9=input.nextInt();
		System.out.println(name+", what is your score for Assignment 10 (out of 100)?");
		a10=input.nextInt();
		
		System.out.println(name+", what is your score for Lab Test 1 (out of 100)?");
		t1=input.nextInt();
		System.out.println(name+", what is your score for Lab Test 2 (out of 100)?");
		t2=input.nextInt();
		System.out.println(name+", what is your score for Lab Test 3 (out of 100)?");
		t3=input.nextInt();
		
		System.out.println(name+", what is your midterm score (out of 100)?");
		mid=input.nextInt();
		System.out.println(name+", what is your final exam score (out of 100)?");
		finalExam=input.nextInt();
		System.out.println(name+", which course are you talking about?");
		input.nextLine();
		className=input.nextLine();
		
		System.out.println(name+", here is your grading report for "+className+":\r\n" + 
				"-----------------------------------------\r\n" + 
				"Quiz 1: "+q1+"\r\n" + 
				"Quiz 2: "+q2+"\r\n" + 
				"Quiz 3: "+q3+"\r\n" + 
				"Quiz 4: "+q4+"\r\n" + 
				"Quiz 5: "+q5+"\r\n" + 
				"Quiz 6: "+q6+"\r\n" + 
				"Quiz 7: "+q7+"\r\n" + 
				"Quiz 8: "+q8+"\r\n" + 
				"Quiz 9: "+q9+"\r\n" + 
				"-----------------------------------------\r\n" + 
				"Assignment 1: "+a1+"\r\n" + 
				"Assignment 2: "+a2+"\r\n" + 
				"Assignment 3: "+a3+"\r\n" + 
				"Assignment 4: "+a4+"\r\n" + 
				"Assignment 5: "+a5+"\r\n" + 
				"Assignment 6: "+a6+"\r\n" + 
				"Assignment 7: "+a7+"\r\n" + 
				"Assignment 8: "+a8+"\r\n" + 
				"Assignment 9: "+a9+"\r\n" + 
				"Assignment 10: "+a10+"\r\n" + 
				"-----------------------------------------\r\n" + 
				"Lab Test 1: "+t1+"\r\n" + 
				"Lab Test 2: "+t2+"\r\n" + 
				"Lab Test 3: "+t3+"\r\n" + 
				"-----------------------------------------\r\n" + 
				"Midterm Test: "+mid+"\r\n" + 
				"Final Exam: "+finalExam+"\r\n" + 
				"-----------------------------------------");
	}

}
