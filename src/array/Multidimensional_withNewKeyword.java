package array;

public class Multidimensional_withNewKeyword 
{
	public static void main(String[] args) 
	{
		//Multi-dimensional Array with new Keyword
		// 1. Array Declaration
		String name[][]=new String[2][2];
		
		//2. Array initilization
		name[0][0]="Sachin";
		name[0][1]="Suhas";
		name[1][0]="Sumit";
		name[1][1]="Shubham";
		
		//3. usages
		System.out.println("==================================");
		System.out.print(name[0][0]+" ");
		System.out.println(name[0][1]);
		System.out.print(name[1][0]+" ");
		System.out.println(name[1][1]);
		System.out.println("----------------------------------");
		// Using for Loop
		System.out.println("----------------------------------");
		
		for(int i=0;i<=1;i++)//Outer for loop---for Row{i}
		{
			for(int j=0;j<=1;j++) //inner for loop---for col{i}
			{
			System.out.print(name[i][j]+" ");	
			}
			System.out.println();	
			
		}
		//1.array declaration	
		System.out.println("---------------------------");
		int no[][]=new int[3][3];

		//2.array assgin
		no[0][0]=11;
		no[0][1]=22;
		no[0][2]=33;
		no[1][0]=44;
		no[1][1]=55;
		no[1][2]=66;
		no[2][0]=77;
		no[2][1]=88;
		no[2][2]=99;	
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(no[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}





















//
//
//
