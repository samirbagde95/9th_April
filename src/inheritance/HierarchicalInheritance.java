package inheritance;

public class HierarchicalInheritance
{

	public static void main(String[] args) 
	{System.out.println("======================");
		A a= new A();//object of A class
		a.test();//calling A class method by using a class method
		
		System.out.println("======================");	
		B b=new B();//object of B class
		b.test();//using B class object calling A class method
		b.test1();//using B class object calling B class method
		
		
		System.out.println("======================");
		C c=new C();//object of C class
		c.test();//using C class object calling A class method
		c.test2();//using C class object calling C class method
		
				
	}

}
