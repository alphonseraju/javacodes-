package StudentClass;

public class studentBio {
	public static class StudentClass {
	    private static String collegeName;
	    private String firstName;
	    private String lastName;
	    private int studentId;
	    private int age;

	    static {
	        collegeName = "KrishnaVeni Degree College ";
	    }

	    public StudentClass(String firstName, String lastName, int studentId, int age) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.studentId = studentId;
	        this.age = age;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public int getStudentId() {
	        return studentId;
	    }

	    public void setStudentId(int studentId) {
	        this.studentId = studentId;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public static String getCollegeName() {
	        return collegeName;
	    }

	    public static void main(String[] args) {
	   
	        StudentClass student = new StudentClass("Alphonse", "Raju", 6, 23);

	        System.out.println("College Name: " + StudentClass.getCollegeName());
	        System.out.println("Student Name: " + student.getFirstName() + " " + student.getLastName());
	        System.out.println("Student ID: " + student.getStudentId());
	        System.out.println("Student Age: " + student.getAge());
	    }
	}


}
