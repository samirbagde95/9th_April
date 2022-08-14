package generalization;

public class SBI implements RBI 
{

	@Override
	public void deposit() {
		System.out.println("SBI Deposit IR=5%");
		
	}

	@Override
	public void loan() {
		System.out.println("SBI Loan IR=8%");
		
	}

	@Override
	public void transfer() {
		System.out.println("SBI Transfer IMPS,RTGS,NEFT,CDM");
		
	}
void yonoApp()
{
	System.out.println("YonoSBI Own Method");
}
}
