package inheritance;

public class SingleInheritanceStudy {

	public static void main(String[] args) 
	{   
    //object creation
		Mother m=new Mother();
		Son s=new Son();
		
	//calling to class by using object (non static)
		m.nature();//using mother object calling mother method
		s.Mobile();//using son object calling son method
		s.nature();//using son object calling mother method
		
	System.out.println("===================================");	
	
	//calling static method in another class
	Mother.look();//mother calling its own static method
	Son.Laotop();//son calling its own static method
	Son.look();//son calling mother static method
	
	
	//calling non static global variable
	System.out.println("=================================");
	System.out.println("Mother is looking "+m.name1);
	System.out.println("Son is looking "+s.name);
	System.out.println("Son is looking extends to "+s.name1);
	
	
	//calling non static global variable
	System.out.println("==================================");
	System.out.println("gender of mother is "+Mother.gender);
	System.out.println("gender of son is "+Son.gender);
	System.out.println("gender of son extends to is "+Son.gender);
	} 

}

/*Mother m=new Mother(); // object creation
m.proprty();//using mother
m.Home();

//calling class by using object (non static)
System.out.println("=====================");

Son s= new Son();//creating object of child class
s.Home();  //using suparclass property
s.proprty();  //using suparclass property

System.out.println("=====================");
s.Laotop(); //using own property
s.Mobile(); //using own property

//calling non static global variable
*/