package week3.day1.assignments;

public class Students {

	public int getStudentInfo(int id) {
		System.out.println("Student Id is'" + id+"'");
		return id;
	}

	public String getStudentInfo(int id, String name) {
		System.out.println("Student Id is '" + id + "' and name is '" + name+"'");
		return name;
	}

	public String getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student email is '" + email + "' and phoneNumber is '" + phoneNumber+"'");
		return email;
	}

	public static void main(String[] args) {
		Students objStudents = new Students();
		objStudents.getStudentInfo(234);
		objStudents.getStudentInfo(234, "yasin");
		objStudents.getStudentInfo("yas@gmail.com", 9865012345l);

	}

}
