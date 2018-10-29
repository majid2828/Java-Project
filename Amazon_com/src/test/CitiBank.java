package test;

public class CitiBank extends StateBank{

	public void getInterestRate() {
		double irate = Math.random()*30;
		System.out.println("Interest rate from CitiBank is: "+ irate);
	}

}
