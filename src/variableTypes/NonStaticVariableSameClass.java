package variableTypes;

public class NonStaticVariableSameClass 
 {
	 int a=20; //non static globale variabe
		
	public static void main(String[] args) 
	{
	NonStaticVariableSameClass NC= new NonStaticVariableSameClass();
	NC.display();
	NC.display1();
	
	System.out.println("Value of a after calling is "+NC.a);//calling non static global variable from same class
	
	Study2 S2= new Study2();
	System.out.println("Value of p after from another class "+S2.p);// calling non static global variable from another class	
	
	}
	public void display()
     { 
	 int b=30;  //local variable
	 System.out.println("value of  b is "+b);//value of b will be 30 for display method only
	 System.out.println("Value of a is "+a);//value of a will be 20 for display method only
	 }
	
	public void display1()
	{
	int c=40; //local variable
	int b=50; 
	System.out.println("Value of b is "+b);
	System.out.println("Value of c is "+c);
	System.out.println("Value of a is "+a);
	}
}
