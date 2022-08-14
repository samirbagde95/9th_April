package patternProgram;

public class Triangle_Left_Ascending {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		//Step 1: Count Rows =5  Count Colums=5 
	
		int star=5; //write no of star in firsr row
		for (int i=1; i<=5; i++)    //outer for loop used for rows
		{
			for (int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();// after going to star in next line
			star--;
		}

	}

}
