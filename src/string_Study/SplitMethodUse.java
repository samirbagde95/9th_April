package string_Study;

public class SplitMethodUse {

	public static void main(String[] args)
	{
	String name="Velocity_Corporate_Training_Center";
	String names[]=name.split("_");
	
	for (int i=0;i<=3;i++)
	{
		System.out.println(i);
	}
System.out.println("================================");	
	String s="Samir Vidyasagar Bagde Sonpeth_Disth_Parbhani_Maharashtra";
	
	String s1[]=s.split(" ");
	
	for (int i=0;i<=3;i++)
	{
		System.out.println(s1[i]);
	}
	

	}

}
