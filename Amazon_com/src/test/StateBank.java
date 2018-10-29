package test;

public class StateBank extends FederalBank {

	public void getInterestRate() {
		double irate = Math.random()*20;
		System.out.println("Interest rate from State Bank is: "+ irate);
	}

}
