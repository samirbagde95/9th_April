package variableTypes;

public class Stdy_Static {

	static int a =40; //static global variable
	
	
	
	public static void main(String[] args)//main method 
	{
		Stdy_Static SS= new Stdy_Static();
		SS.display();
	
	    System.out.println("Value of a is "+a);// calling ststic global variable from same class

	    System.out.println("Value of p is "+Stdy_Static1.p); // calling static global variable from another class
	    
	}
   public void display()// non static variable
   {
	   int b=30;
	   System.out.println("Value of b is "+b);  //local variable
	   System.out.println("Value of a is "+a); //static global variable
   }
}
