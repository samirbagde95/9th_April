package loop;

public class AllLoops
{

	public static void main(String[] args) 
	{
		for (int s=9; s<=90; s=s+9)
		{
			System.out.println(s);
		}
		{
			System.out.println("===============");
		}
		for (int m=90;m>=9; m=m-9 )
		{
			System.out.println(m);
		}
		
		int b=9;
		while (b<=90)         //while loops increamental
		{
			System.out.println("===============");
			System.out.println(b);
			b=b+9;
		}
		
		int z=80;
		while (z>=8)              // while loops decremnt
		{
			System.out.println("===============");
			System.out.println(z);
			z=z-8;
		}
		
		int d=19;
		do {
			System.out.println("===============");
			System.out.println(d);
			d=d+19;
		} while (d<=190);
		
		int w=190;
		do {
			System.out.println("==============="); //Decrement
			System.out.println(w);
			w=w-19;
		} while (w>=19);
	}

}
