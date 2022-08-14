package string_Study;

public class StringStudy {

	public static void main(String[] args)
	{  
		//length Use
		String s0="samirbagde";// create object without new keyword
		String s1= new String("samirvidyasagarbagde"); //object with new keyword
		String b1="";
		String b2=" ";
		//String b3=null;
		System.out.println(s0.length());
		System.out.println(s1.length());
		System.out.println(b1.length());
		System.out.println(b2.length());
		//System.out.println(b3.length());
	
		// use of length method
		System.out.println("=====================");		
		 int a = s0.length();
		 int b = s1.length();
		 
		System.out.println("=====================");
		System.out.println(a);
		System.out.println(b);
		
		//toupper case use
		System.out.println("====================="); 
		 System.out.println(s0.toUpperCase());
		 System.out.println(s1.toUpperCase());
		
		 //tolower case use
		 System.out.println("=====================");
		 String s2="PARBHANI";
		 String s3="MAHARASHTRA";
		 System.out.println("=====================");
		 System.out.println(s2.toLowerCase());
		 System.out.println(s3.toLowerCase());
		 
		 // equal to use
		 System.out.println("=====================");
		 String s4="iloveindia";
		 String s5="iloveindia";
		 String s6=new String("iloveindia");
		 String s7=new String("iloveindia");
		 String s8=new String("Iloveindia");	
				 
		 System.out.println("=====================");
		System.out.println(s4==s5);		
		System.out.println(s4==s6);
		System.out.println(s5==s7);
		System.out.println(s7==s8);
				 
		System.out.println("=====================");
		 System.out.println(s4.equals(s5));
		 System.out.println(s4.equals(s6));
		 System.out.println(s5.equals(s7));
		 System.out.println(s7.equals(s8));
		 System.out.println(s6.equals(s8));
		 
	//Equal Ignorecase method
		 System.out.println("=====================");
		 System.out.println(s7.equalsIgnoreCase(s8));
		 
		 //contains Method
		 System.out.println("====================="); 
		 String e0="pune";
		 String e1="pun";
		 String e2="mumbai";
		 
		 System.out.println(e0.contains(e1));
		 System.out.println(e0.contains(e2));
		 System.out.println(e1.concat(e2));
		 System.out.println(e1.contains(e2));
		 
		 //Is Empity Method
		 System.out.println("=====================");
		 String q1="Mumbai";
		 String q2="";
		 String q3=" ";
		 String q4=null;
		 
		 System.out.println(q1.isEmpty());
		 System.out.println(q2.isEmpty());
		 System.out.println(q3.isEmpty());
		// System.out.println(q4.isEmpty());
		
		 //IsBlank Method
		 System.out.println("=====================");
		 System.out.println(q1.isBlank());
		 System.out.println(q2.isBlank());
		 System.out.println(q3.isBlank());
		 //System.out.println(q4.isBlank());
		 
		 //charAt method use
		 String p="delhi";
		 System.out.println(p.charAt(3));
		 System.out.println(p.charAt(2));
		 
		 char city = p.charAt(4);
		 System.out.println(city);
		 
		 //System.out.println(p.charAt(6));
		 //System.out.println(p.charAt(-1));
	
		 //endswith method use
		 System.out.println("=====================");
		 String h="adcdef";
		 
		 System.out.println(h.endsWith("f"));
		 System.out.println(h.endsWith("def"));
		 System.out.println(h.endsWith("dceff"));
		 System.out.println(h.endsWith("cdef"));
		 
		 //start with method use
		 System.out.println("===============");
		 String x="MonkeyTesting";
		 System.out.println(x.startsWith("Monkey"));
		 System.out.println(x.startsWith("tesitng"));
		 System.out.println(x.startsWith("Monkey", 2));
		 System.out.println(x.startsWith("Testing", 8));
		 
		 //subString Method use
		 System.out.println("=========================");
		 String k="maharashtra";
		 System.out.println(k.substring(4));
		 System.out.println(k.substring(3, 8));
		 
		 String place = k.substring(4);
		 System.out.println(place);
	
	//concat method use
		 System.out.println("========================="); 
		 String d1="SAMIR ";
		 String d2="BAGDE";
		 
		 System.out.println(d1.concat(d2));
		 System.out.println(d1.concat("SONPETH"));
	
		 
		 //index of method use
		 System.out.println("=========================");
		 
		 String m="Belden";
		 int index = m.indexOf('e');
		 System.out.println(index);
		 
		 String m1="India is my country which is 2nd biggest";
		 System.out.println(m1.indexOf('i'));
		 System.out.println(m1.lastIndexOf('i'));
		 System.out.println(m1.indexOf('i', 8));
		 
		 //replace methed use
		 System.out.println("=========================");
		 String i="Software";
		 String j="testing";

		 System.out.println(i.replace('t', 'T'));
		 System.out.println(j.replace('t', 'T'));
		 System.out.println(j.replace("ing", ""));
		 
		 
		 
		 
	
	}

}