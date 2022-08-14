package controlStatement;

public class ElseIf {

	public static void main(String[] args) {
		        // if its summer then its very hot
				// if its rainy then its raining heavily 
				// if its winter then its very cold
				// invalid season
	
	String season="Winter";
		
	if (season=="summer")
		{
			System.out.println("Then Its Very HOT");
		}
       
	else if(season=="Rainy")
		{
			System.out.println("Then It's Very Rainy");
		}
	else if(season=="Winter")
		{
			System.out.println("Then It's Very Winter");
        }
	else 
		{		
		   System.out.println("Invalid Season");	
		}
	}
	

}
