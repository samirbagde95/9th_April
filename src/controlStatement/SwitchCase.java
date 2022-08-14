package controlStatement;

public class SwitchCase {

	public static void main(String[] args)
	{
//		A--> >90
//		B--> >=66-<90
//		C--> >=50-<65
//		D--> >40-<49
	
		char grade='j';
	    switch (grade)
	{
	    
	case 'A': System.out.println(" My Marks Is grater than 90");
	break;
	
	case 'B': System.out.println("My Marks is >66-<90");
	break;
	
	case 'C': System.out.println("My Marks is >=50-<65");
	break;
	
	case 'D': System.out.println("My Marks is >40-<49");
	break;
	
	default : System.out.println("Invalid Range");
	break;
	
	}

	}
}