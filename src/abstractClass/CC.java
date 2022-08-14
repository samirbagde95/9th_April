package abstractClass;

public class CC extends A
{

	public static void main(String[] args)
	{
	
		CC c=new CC();// created object of concrete class
		c.samir();
		c.samir1();
		
		c.samir3();
		c.samir4();
		c.samir5();
		c.sample();
		
	}

	@Override
	public void samir2() {
		
	}

	@Override
	public void samir3() {
		System.out.println(" i am samir3");
			
	}

	@Override
	public void samir4() {
		System.out.println(" i am samir4");	
	}

	@Override
	public void samir5() {
		System.out.println(" i am samir5");		
	}
public void sample()
{
	System.out.println("Sample method is Own Method of CC");
	
}
}
