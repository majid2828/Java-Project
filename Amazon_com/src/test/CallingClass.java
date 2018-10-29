package test;

public class CallingClass {

	public static void main(String[] args) {
		 
		
		/*FederalBank bank = new FederalBank();
		bank.getInterestRate();
		
		StateBank bank2 = new StateBank();
		bank2.getInterestRate();
		
		CitiBank bank3 = new CitiBank();
		bank3.getInterestRate();*/
		
		FederalBank bank4 = new CitiBank();
		bank4.getInterestRate();
	}

}
