package week3.day1.assignments;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("This is Deposit Amount is 4500");
	}

	public static void main(String[] args) {

		AxisBank objAxisBank = new AxisBank();
		objAxisBank.saving();
		objAxisBank.fixed();
		objAxisBank.deposit(); //overriding the method in axis bank
	}

}
