package generalization;

public class Kotak implements RBI

{

	@Override
	public void deposit() {
		System.out.println("Kotak Deposit IR=5%");
		
	}

	@Override
	public void loan() {
		System.out.println("Kotak loan IR=9%");
		
	}

	@Override
	public void transfer() {
		System.out.println("kotak have RTGS,NEFT,IMPS");
		
	}
  public void KotakApp()
  {
	  System.out.println("Kotak own method");
  }
}
