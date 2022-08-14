package method;

public class NonStaticMethodCall {

	public static void main(String[] args)
	{
		   //classname objectname = new classname();
	NonStaticMethodCall s= new NonStaticMethodCall();  //created object of the class
		
		  //to call non static methods from same class
		 
	//objectname.methodname();
	s.test();
		  
	// calling non static method of another--> need to create object of that class
	
		MyClass n= new MyClass();    //created object of myClass
		
		// to call non static method --> objectname.methodName();
		n.test();  // calling non static method from another class 
		NonStaticMethodCall  b= new NonStaticMethodCall();
		b.add();
		b.sub();
		
	}
	
	public void add()  //non static regular method
	{
	int a;
	int b;
	int add;
	
	a=10;
	b=20;
    add=a+b;
    
	System.out.println("Addition "+add);
  
	}
	public void sub() //non static method
	{
		int e;
		int f;
		int sub;
		
		e=200;
		f=100;
		sub=e-f;
		
		System.out.println("Subtraction "+sub);
	}
	
    public void test() //not static regular method
    {
    	System.out.println("This is test method");
    }
	
	
	
}
