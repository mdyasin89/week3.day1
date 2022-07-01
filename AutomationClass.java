package week3.day1.assignments;

public class AutomationClass extends MultipleLanguage implements TestTool, Language{
	
	public void selenium() {//its its declared in TestTool in interface
		System.out.println("This is Selenium");
		
	}

	public void java() {//its its declared in Language in interface
		System.out.println("This is java language");
		
	}

	@Override
	public void ruby() {
		System.out.println("This is ruby language"); // its already defined in abstract class
		
	}
	
	
	public static void main(String args[]) {
		AutomationClass objAutomation = new AutomationClass();
		objAutomation.java();
		objAutomation.selenium();
		objAutomation.ruby();
		objAutomation.python();
	}

}
