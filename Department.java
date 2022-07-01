package week3.day1.assignments;

public class Department extends College { //single inheritance from College
	public void depatName() {
		System.out.println("Department is CSE");
	}

	public static void main(String[] args) {
		Department objDepartment = new Department();
		objDepartment.depatName();
	}

}
