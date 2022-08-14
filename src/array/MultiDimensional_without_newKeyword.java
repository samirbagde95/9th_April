package array;

public class MultiDimensional_without_newKeyword {

	public static void main(String[] args)
	{
	char alphabates[][]= {{'A','B','C','D','E'},{'F','G','H','I','J'},{'K','L','M','N','O'}};	
	
	//Array usage
	System.out.println("======================================");
	System.out.print(alphabates[0][0]+" ");
	System.out.print(alphabates[0][1]+" ");
	System.out.print(alphabates[0][2]+" ");
	System.out.print(alphabates[0][3]+" ");
	System.out.println(alphabates[0][4]+" ");
	System.out.print(alphabates[1][0]+" ");
	System.out.print(alphabates[1][1]+" ");
	System.out.print(alphabates[1][2]+" ");
	System.out.print(alphabates[1][3]+" ");
	System.out.println(alphabates[1][4]+" ");
	System.out.print(alphabates[2][0]+" ");
	System.out.print(alphabates[2][1]+" ");
	System.out.print(alphabates[2][2]+" ");
	System.out.print(alphabates[2][3]+" ");
	System.out.println(alphabates[2][4]+" ");
	System.out.println("======================================");
	
	for(int i=0;i<=2;i++)
	{
		for(int j=0;j<=4;j++)
		{
			System.out.print(alphabates[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("======================================");  
	}

}
