package method;

public class StudentInfo
{
	public static void main(String[] args) 
	{	
		//classname objectname =new classname(); // object create
	
	   StudentInfo s =new StudentInfo();
	   s.Student();//calling non static method from same class
	   s.Student("sachin", 26, 'M', 6.5f, 69f, 12);
	   s.Student("vijay", 29, 'm', 6.9f, 70f, 19);
	  
	
	
	}
        //name,PRN,branch,dept,gender,passoutyear,weight,
	public void Student()//non static method /Method without parameter
	{
		String name;
		name="Samir Bagde";
		String PRN;
		PRN="A01014920118";
		String branch;
		branch="Engineering";
		String dept;
		dept="Electronic";
		char gender;
		gender='M';
		int passoutyear;
		passoutyear=2020;
		float weight;
		weight=63.82f;	
		
		System.out.println("=======================================");
		System.out.println("My Name Is "+name);
		System.out.println("My PRN Number is "+PRN);
		System.out.println("My Branch for "+branch );
		System.out.println("My Deparment for "+dept );
		System.out.println("My Gender is "+gender);
		System.out.println("My Passoutyear for "+passoutyear);
		System.out.println("My Weight is "+weight);
		System.out.println("=======================================");
	}
	   //name,age,gender,height,weight,rollnumber,
	public void Student(String name,int age,char gender,float height,float weight,int rollnumber)
	{
		System.out.println("=======================================");
		System.out.println("My Name is "+name);
		System.out.println("My Age is "+age);
		System.out.println("My Gender is "+gender);
		System.out.println("My height for "+height);
		System.out.println("My Weight is "+weight);
		System.out.println("My RollNo Is "+rollnumber);
		System.out.println("=======================================");
	}

	
	
}
	
	
	

