package controlStatement;

public class SwitchCase1
{  //if today is Monday --> this is 1st day of week
   //sunday--> this is 7th day of weeks
	public static void main(String[] args)
	{
		String Day="Sunday";
	    switch (Day)
	    {
	    case "Monday": System.out.println("This is The First Day of Week");
	    break;
	    case "Thesday": System.out.println("This is Second Day Of Week");
	    break;
	    case "Wednesday": System.out.println("This is Third Day of Week");
	    break;
	    case "Thursday": System.out.println("This is Fourth Day of Week");
	    break;
	    case "Friday": System.out.println("This is Fifth Day of Week");
	    break;
	    case "Saturday": System.out.println("This is Sixth Day of Week");
	    break;
	    case "Sunday": System.out.println("This is Seventh Day of Week");
	    }		
	}
}
