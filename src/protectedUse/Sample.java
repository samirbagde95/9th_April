package protectedUse;

import accessSpecifier.PrivateUse;

public class Sample extends PrivateUse

{

	public static void main(String[] args) 
	{ 
		PrivateUse p= new PrivateUse();
     		p.test1();
     		
     		System.out.println("/////////////////////////");
     	
     		Sample s=new Sample();
     		s.test1();
     		System.out.println("/////////////////////////");
         	
     		s.test4();
	


	
	}
			
}
