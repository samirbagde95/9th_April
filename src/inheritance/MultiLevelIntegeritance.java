package inheritance;

public class MultiLevelIntegeritance
{

	public static void main(String[] args)
	{
	Son s= new Son(); // create object of son class
	
	// call to non static method
	s.receipe();// using sons object calling grand mother method
    s.nature();// using sons object calling mother method
    s.Mobile();// using sons object own method
    //call for static method
   Son.stories();//using son class calling grand mother static method
   Son.look();// using son class calling mother static method
   Son.Laotop();//using son class calling own static method
	}

}
