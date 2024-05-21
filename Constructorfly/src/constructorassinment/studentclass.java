package constructorassinment;

public class studentclass {
	    private String name;
	    private int age;
	    private String major;
	    private double gpa;
	    private boolean isFullTime;
	    
	    // Default Constructor
	    public studentclass() {
	        this.name = "unknown";
	        this.age = 18;
	        this.major = "unknown";
	        this.gpa = 00.00;
	        this.isFullTime = true;
	    }

	    // Parameterized Constructor (name and age)
	    public studentclass(String name, int age) {
	        this.name =name;
	        this.age = age;
	        this.major ="undeclared";
	        this.gpa = 0.0;
	        this.isFullTime = true;
	    }

	    // Parameterized Constructor (name, age, and major)
	    public studentclass(String name, int age, String major) {
	        this.name =name;
	        this.age = age;
	        this.major = major;
	        this.gpa = 0.0;
	        this.isFullTime = true;
	    }

	    // Parameterized Constructor (all attributes)
	    public studentclass(String name, int age, String major, double gpa, boolean isFullTime) {
	        this.name = "name";
	        this.age = age;
	        this.major = major;
	        this.gpa = gpa;
	        this.isFullTime = true;
	    }

	    // Method to display student details
	    public void displayStudentDetails() {
	        System.out.println( this.name);
	        System.out.println( this.age);
	        System.out.println( this.major);
	        System.out.println( this.gpa);
	        System.out.println( this.isFullTime);
	    }
	}

