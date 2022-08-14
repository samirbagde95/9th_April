package generalization;

public class Banking {

	public static void main(String[] args)
	{
	   SBI s= new SBI();
	   Axis a=new Axis();
	   Kotak k=new Kotak();
	   BOI b=new BOI();

	   System.out.println("==============================");
	   s.deposit();
	   s.loan();
	   s.transfer();
	   s.yonoApp();
	   
	   System.out.println("=============================");
	   a.deposit();
	   a.loan();
	   a.transfer();
	   a.axisApp();
	   
	   System.out.println("=============================");
	   k.deposit();
	   k.loan();
	   k.transfer();
	   k.KotakApp();
	   
	   System.out.println("==============================");
	   b.deposit();
	   b.loan();
	   b.transfer();
	   b.boiIndiaApp();
	}

}
