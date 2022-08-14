package variableTypes;

public class Employee 
{
	String emp_name;
	String emp_salary;
	int emp_id;
    float emp_age;
	String emp_desg;
	char emp_gender;
	
	public void EmpInfo()
	{
		System.out.println("====================================");
		System.out.println("Employee name is "+emp_name);
		System.out.println("Employee salary is "+emp_salary);
		System.out.println("Employee age is"+emp_age);
		System.out.println("Employee desn "+emp_desg);
		System.out.println("Employee gender is "+emp_gender);
		System.out.println("====================================");
	}
	public static void main(String[] args) 
	{
		
	}

}
