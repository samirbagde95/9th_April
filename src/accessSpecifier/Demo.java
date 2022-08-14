package accessSpecifier;

public class Demo 
{

	public static void main(String[] args)
	{
		PrivateUse p= new PrivateUse();//create object another class
		p.test1();
		//p.test2();
        p.test3();
        p.test4();
	}

}
