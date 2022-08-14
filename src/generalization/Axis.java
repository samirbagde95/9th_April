package generalization;

public class Axis implements RBI

{

	@Override
	public void deposit() {
		System.out.println("Axis Deposit IR=8.5%");
		
	}

	@Override
	public void loan() {
		System.out.println("Axis Deposit IR=5.3%");
		
	}

	@Override
	public void transfer() {
		System.out.println("Axis Transsfer RTGS, NEFT,IMPS");
		
	}

	  public void axisApp()
	  {
		  System.out.println("Axis own method");
	  }
}
