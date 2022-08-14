package constructor;

public class ConstructorW_Parameter
{
	//example for user defined constructor with parameters.
	int num1;
	int num2;
	int num3;
	
	public ConstructorW_Parameter()
	{
		num1=111;
		num2=222;
		num3=333;
	}
	public ConstructorW_Parameter(int a)
	{
		num1=a;
	}
	public ConstructorW_Parameter(int a ,int b)
	{
		num1=a; num2=b;
	}
	public ConstructorW_Parameter(int a,int b,int c)
	{
		num1=a;num2=b; num3=c;
	}
	
	
	public static void main(String[] args) 
	{
		ConstructorW_Parameter CP= new ConstructorW_Parameter(10);
		CP.addition();
		
		ConstructorW_Parameter CP1 = new ConstructorW_Parameter(10,20);
		CP1.addition();		
		ConstructorW_Parameter CP2 =new ConstructorW_Parameter(10, 20, 30);
		CP2.addition();
		
	}
	
    public void addition()  // nonstatic method
    {
	 int sum=num1+num2+num3;
	 System.out.println("Addition of the "+sum);
    }
 
}
