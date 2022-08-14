package array;

public class ArrayEx_2 {

	public static void main(String[] args)
	{
	int rollNo[]=new int[6];
	int rollNo1[]= {1,2,3,4,5,6,7};
	
	rollNo[0]=100;
	rollNo[1]=200;
	rollNo[2]=300;
	rollNo[3]=400;
	rollNo[4]=500;
	rollNo[5]=600;
	
	System.out.println(rollNo[3]);
	System.out.println("==================================");
	for(int i=0;i<=3;i++)
	{
		System.out.println(rollNo[i]);
	}
	System.out.println("==================================");
	for(int i=0;i<=5;i++)
	{
		System.out.println(rollNo[i]);
	}
	System.out.println("==================================");
	for (int i=rollNo.length-1;i>=0;i--)
	{
		System.out.println(rollNo[i]);
	}
	System.out.println("==================================");
	for (int i=rollNo1.length-1;i>=0;i--)
	{
		System.out.println(rollNo1[i]);
	}
	System.out.println("==================================");
	for (int i=0;i<=rollNo1.length-1;i++)
		System.out.println(rollNo1[i]);
	
	
	}
}
