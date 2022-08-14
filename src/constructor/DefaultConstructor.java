package constructor;

public class DefaultConstructor
{  // example of default Constructor
   // public defaultconstructor provided by compiler	
	
	public static void main(String[] args) 
	{
		DefaultConstructor DC= new DefaultConstructor();
		DC.display();
	}

	public void display()
	{
		System.out.println("I am Dispay method i am not static");
		
	}
	
}
