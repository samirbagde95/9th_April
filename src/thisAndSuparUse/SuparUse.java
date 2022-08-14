package thisAndSuparUse;

public class SuparUse extends A {

	int S=10;//global variable from supar class 
	
	public static void main(String[] args)
	{
		SuparUse su=new SuparUse();
		su.test();
	}
    
	public  void test()
  {
	int S=20;
	int sum=S+30;
	int sum1=this.S+40;//using global value of S form Same Class
	int sum2=super.S+10;//using global value of S form supar class
	System.out.println("Using Local Value Of s "+sum);
	System.out.println("Using global value of Sform Same Class "+sum1);
	System.out.println("Using global Value Of S form Supar Class "+sum2);
	 
  }
}
