package finalUse;

public class A 
{

	public static void main(String[] args)
	{
		int a=20;
		System.out.println(a);
		
		a=a+90;
		System.out.println(a);
		
		  final int b=10;
		System.out.println(b);
		
		//b=b+90;-->Final Variable wont allow us updating in value
		

	}
	public  void test()
	{
		System.out.println("Test Method 'A");
	}

}
