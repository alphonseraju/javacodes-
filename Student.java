


      
public class Student {
	int studentId;
	String studentName;
	double marks;
    String grade;
	
	public Student(int studentId, String studentName, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
        calculateGrade();
}
	public void calculateGrade() {
		if(marks >= 90 && marks <100) {
			grade = "A";
		}else if (marks >= 80 && marks <90) {
			grade = "B";
		} else if (marks >= 70 && marks < 80) {
            grade = "C";
        } else if (marks >= 60 && marks < 70) {
            grade = "D";
        } else {
            grade = "F";
        }
			
	}
	public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
	public static void main(String[] args) {
        Student student1 = new Student(1, "Anu", 90);
        student1.displayStudentInfo();
        student1.calculateGrade();
        System.out.println();

        Student student2 = new Student(2, "Priya", 40);
        student2.displayStudentInfo();
        student2.calculateGrade();
          System.out.println();
        Student student3 = new Student(3, "reetu", 75);
        student3.displayStudentInfo();
        student3.calculateGrade();
        System.out.println();
    
	Student student4=new Student(4, "ankith",60);
	student4.displayStudentInfo();
	student4.calculateGrade();
	}
}