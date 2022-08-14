package accessSpecifier;

public class PrivateUse 
{

	public static void main(String[] args)
	{
		PrivateUse ps= new PrivateUse(); // create object by same class
        ps.test1();//can be accessed within project
        ps.test2();//can be accessed within Class
        ps.test3();//can be Accessed within package
        ps.test4();//can be accessed within protected
	}

	public void test1()// can be asscced within project
	{
		System.out.println("This public test method test1");
	}
	private void test2()//can be Accessed within class
	{
		System.out.println("This is Running Private Method test2");
	}
	void test3()//can be Accessed within package
	{
		System.out.println("This is Default Method-test3");
	}
	protected void test4()
	{
		System.out.println("This is Protected Test 4");
	}
	
}
