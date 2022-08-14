package variableTypes;

public class HR_Portal 
{

	public static void main(String[] args) 
	{ 
		Employee Samir =new Employee();//creating object for Employee class
		
		Samir.emp_name="Samir Bagde"; //assign non static global variable "empid" using object
		Samir.emp_id=50019600;
		Samir.emp_age=27;
		Samir.emp_desg="Testing Engineer";
		Samir.emp_gender='M';
		
	   Employee Sachin= new Employee();
	   
	   Sachin.emp_name="Sachin Tendulkar";
	   Sachin.emp_id=42123456;
	   Sachin.emp_desg="AllRounder";
	   Sachin.emp_gender='M';
	   Sachin.emp_age=42;
	   
	   
	   Samir.EmpInfo();
	   Sachin.EmpInfo();
	}

}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//	Employee TCS= new Employee();
	//	TCS.empid=2;
	//	TCS.sal=50000;
	//	TCS.RM="Sachin T";
	//	
	//	Employee Rajesh= new Employee();
	//	Rajesh.empid=3;
	//	Rajesh.sal=75000;
	//	Rajesh.RM="Team Head";
		
		
		//Samir.EmpInfo();// non static method using object
		//TCS.EmpInfo();
	//	Rajesh.EmpInfo();
		
