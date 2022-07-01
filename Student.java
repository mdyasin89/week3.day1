package week3.day1.assignments;

public class Student extends Department { // multilevel inheritance College--Department--Student
	public void studentName() {
		System.out.println("Student Name is Yasin");
	}

	public void studentDept() {
		System.out.println("Student department is CSE");
	}

	public void studentId() {
		System.out.println("Student Id is 07CS123");
	}

	public static void main(String[] args) {
		Student objStudent = new Student();
		objStudent.collegeName(); // multi level inheritance calling grandfather class
		objStudent.collegeCode();
		objStudent.collegeRank();
		objStudent.depatName();
		objStudent.studentName();
		objStudent.studentDept();
		objStudent.studentId();

	}

}
