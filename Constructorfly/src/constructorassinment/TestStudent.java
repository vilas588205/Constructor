package constructorassinment;

public class TestStudent {

	public static void main(String[] args) {
		// Testing default constructor
				studentclass student1 = new studentclass();
		        System.out.println("student 1:");
		        student1.displayStudentDetails();
		        System.out.println();

		        // Testing parameterized constructor (name and age)
		        studentclass student2 = new studentclass("Vilas", 28);
		        System.out.println("student 2:");
		        student2.displayStudentDetails();
		        System.out.println();

		        // Testing parameterized constructor (name, age, and major)
		        studentclass student3 = new studentclass("kiran", 26, "math");
		        System.out.println("student 3:");
		        student3.displayStudentDetails();
		        System.out.println();

		        // Testing parameterized constructor (all attributes)
		        studentclass student4 = new studentclass("ganesh", 30, "Mathematics", 3.5, false);
		        System.out.println("student 4:");
		        student4.displayStudentDetails();
		        System.out.println();
		    }
		}


