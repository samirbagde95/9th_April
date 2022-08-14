package constructor;

public class UserDefinedConstructor 
{     //example for user defind Constructor
   
	String city ="pune";
	// use of constructor -->  to initlizite variable
	String name; //variable declration
	public UserDefinedConstructor() //user defined constructor--> without parameters
	{
		name="Velocity";// used to initialize variable "name"
	}
	public static void main(String[] args) 
	{
		display1();
		UserDefinedConstructor UC=new UserDefinedConstructor();
		UC.display();
	}
   public void display() 
   {
	   System.out.println("Iam non Static dispalay Method");
	   System.out.println("My City Name is "+city);
	   System.out.println("My Class Name is"+name);
   }
   
   public static void display1()
   {
	   System.out.println("I am static display1 method ");
   }
   
   }

