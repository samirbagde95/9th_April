package variableTypes;

public class StDy1 
{
    int a=20;//non static global variable
	public static void main(String[] args)
	{
		StDy1 SD=new StDy1();
		SD.Display();
		SD.Display1();

		System.out.println("Value of a after calling is "+SD.a);//Calling non static variable from same class
		
		Study2 S2=new Study2();
		
		System.out.println("Value of b after calling is "+S2.p);//calling for nonstatic global variable from another class
	}
public void Display()
{
	int b=33;// local variable
	System.out.println("Value of b is "+b);//value of b will be 30 for display method only
	System.out.println("Value of a is "+a);//value of a will be 20 for all  methods
}
public void Display1()
{
	int c=40;//local variable
	int b=50;
	System.out.println("Value of c is "+c);
	System.out.println("Value of b is "+b);
	System.out.println("value of a is "+a);
	
}
}
