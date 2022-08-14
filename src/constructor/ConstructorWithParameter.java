package constructor;

public class ConstructorWithParameter 
{
   int a;
   int b;
   int c;
    
   public ConstructorWithParameter()
   {
   a=11;
   b=22;      
   c=33;
   }
   public ConstructorWithParameter(int x)
   {
	   a=x;
//     b=0;
//	   c=0;
   }
   public ConstructorWithParameter(int x, int y )
   {
	   a=x;b=y;
	   //c=0
   }
   public ConstructorWithParameter(int x ,int y, int z)
   {
	   a=x;b=y;c=z;
   }
   
   
	public static void main(String[] args)
	{
	   ConstructorWithParameter CP= new ConstructorWithParameter();
	   CP.addition();
       
	   ConstructorWithParameter CP1= new ConstructorWithParameter(1);
	   CP1.addition();
	   
	   ConstructorWithParameter CP2= new ConstructorWithParameter(5, 11);
	   CP2.addition();
	   
	   ConstructorWithParameter CP3= new ConstructorWithParameter(10, 201, 10);
	   CP3.addition();
			   
	}
   public void addition()
   {
	   int sum=a+b+c;
       System.out.println("The Output Of SUM "+sum);
   }
}
