package variableTypes;

public class StaticGlobalVariable 
{
 static int a=40;  //static global variable
 
	public static void main(String[] args)
	{
		StaticGlobalVariable SV =new StaticGlobalVariable();
		SV.display();
		System.out.println("Value of a is "+a);//calling static global variable from same class
		System.out.println("Value of p is "+Stdy_Static1.p);//calling static global variable from another class
			
	}
    public void display()
    {
    	int b=30;
    	System.out.println("Value of b is "+b); //local variable
    	System.out.println("value of a is "+a); // static global variable
    }
}
