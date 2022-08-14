package array;

public class ArrayEx1 {

	public static void main(String[] args) {
		// i want to store friend name
		
		// 1) Array Declaration
 		String name[]=new String[5];
 		int age[]=new int[5];
 		float weight[]=new float[5];
 		//2) array initialization
 		name[0]="Akshay";
 		name[1]="Vivek";
 		name[2]="Sudhir";
 		name[3]="Samir";
 		name[4]="Rohit";
 		
 		
 		age[0]=27;
 		age[1]=25;
 		age[2]=24;
 		age[3]=23;
 		age[4]=24;
 				
 		weight[0]=56.5f;
 		weight[1]=55.5f;
 		weight[2]=56.5f;
 		weight[3]=59.5f;
 		weight[4]=59.5f;
 		
 		
 		
 		//3) array usage
 		
 		System.out.println(name[2]);
 		System.out.println(name[3]);
 		System.out.println((age[3]));
 		System.out.println("=======================");   
 		System.out.println(name.length);
 		System.out.println("==================================");
 		System.out.println(weight[3]);
 		
 		System.out.println("==================================");
 		
 		for (int i=0;i<=4;i++)
 		{
 			System.out.println(name[i]);
 		}
 		System.out.println("=======================");   
 	 	
 		for (int i=4;i>=0;i--)
 		{
 			System.out.println(name[i]);
 		}
 		System.out.println("=======================");   
 	 	System.out.println(name.length-1);
 	 	
 	 	for (int i=0;i<=name.length-1;i++)
 	 	{
 	 		System.out.println(name[i]);
 	 	}
 	 	
 	 	for (int i=name.length-1;i<=0;i--)
 	 	{
 	 		System.out.println(name[i]);
 	 	}
 		
	}
	

}
