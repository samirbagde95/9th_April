package polymorphism;

public class MethodOverLoading {

	public static void main(String[] args)
	{
		MethodOverLoading mo = new MethodOverLoading();
		mo.add();
		mo.add(30);
		mo.add(10, 10);
	}
public void add()
   {
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println("This Sum is "+sum);
   }
public void add(int a)
    {
	a=30;
	int sum=a+30;
	System.out.println("This Sum is "+sum);
    }
 public void add(int a,int b)
    {
	int sum=a+b;
	System.out.println("This Sum is "+sum);
    }
}
