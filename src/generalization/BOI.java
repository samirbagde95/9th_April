package generalization;

public class BOI implements RBI
{
	@Override
	public void deposit() {
		System.out.println("BOI Deposit IR=9.8%");
		
	}

	@Override
	public void loan() {
		System.out.println("BOI Deposit IR=5.7%");
	}

	@Override
	public void transfer() {
		System.out.println("BOI have RTGS,NEFT,IMPS");
		
	}
	public void  boiIndiaApp() {
		System.out.println("BOI own Method");
	}

}
