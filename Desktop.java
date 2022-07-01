package week3.day1.assignments;

public class Desktop extends Computer { // used single inheritance to access methods from computer with extends keyword

	public void desktopsize() {
		System.out.println("Desktop size is 21 inch");
	}

	public static void main(String[] args) {
		Desktop objDesktop = new Desktop(); // object created only for Desktop class
		objDesktop.computerModel(); // calling the method from computer class using desktop object
		objDesktop.desktopsize();
	}

}
