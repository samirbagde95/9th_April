package thisAndSuparUse;

public class ThisUse {

	int a=40;//local variable
	int sum1 =a+150;// a value is local value
	
	public static void main(String[] args)
	{
		ThisUse tu=new ThisUse();
		tu.sample();
	}
	public void sample()
	{
		int a=20;
		int sum=a+50;
		System.out.println("Sum is "+sum);
		System.out.println("Value of a is "+this.sum1);
		System.out.println("This is global value "+this.a);
		System.out.println("This is local value "+a);
	}

}
