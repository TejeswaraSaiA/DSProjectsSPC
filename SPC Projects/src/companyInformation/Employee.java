package companyInformation;
import companyInformation.Department;
public class Employee 
{
	private String emp_id;
	private String emp_name;
	private String job;
	private float salary;
	private int dept_id;
	private float DA;
	private float totalSalary;
	
	
	//Checking Whether the Given Employee Name is Valid or Not
	private boolean validEmpName(String emp_name)
	{
		char [] c = emp_name.toCharArray();
		for(char i : c)
		{
			if(Character.isDigit(i))
			{
				return false;
			}
		}
		return true;
	}
	
	//Checking the Job Roles
	private boolean validJob(String job)
	{
		if(job.equalsIgnoreCase("Professor"))
		{
			return true;
		}
		else if(job.equalsIgnoreCase("Associate Professor"))
		{
			return true;
		}
		else if(job.equalsIgnoreCase("Assistant Professor"))
		{
			return true;
		}
		return false;
	}
	
	private String calculateEmployeeId(int dept_id,int[] eid)
	{
		String s;
		if(dept_id == 100)
		{
			
			s = "C"+String.valueOf(dept_id+eid[(dept_id/100)-1]);
			eid[(dept_id/100)-1]++;
			return s;
		}
		else if(dept_id == 200)
		{
			s = "E"+String.valueOf(dept_id+eid[(dept_id/100)-1]);
			eid[(dept_id/100)-1]++;
			return s;
		}
		else if(dept_id == 300)
		{
			s = "M"+String.valueOf(dept_id+eid[(dept_id/100)-1]);
			eid[(dept_id/100)-1]++;
			return s;
			
		}
		else if(dept_id == 400)
		{
			s = "EE"+String.valueOf(dept_id+eid[(dept_id/100)-1]);
			eid[(dept_id/100)-1]++;
			return s;
		}
		else if(dept_id == 500)
		{
			s = "I"+String.valueOf(dept_id+eid[(dept_id/100)-1]);
			eid[(dept_id/100)-1]++;
			return s;
		}
		return "False";
	}
	
	//Used to CalculateDA and Total Salary
	public void calculateDA(float salary,int dept_id)
	{
		this.DA = (salary*(dept_id/1000));
		this.totalSalary = salary + this.DA;
		
	}
	
	//Generating Department Name using Department Class Object
	public void deptName(int dept_id)
	{
		Department d = new Department();
		boolean a = d.generateDeptName(dept_id);
		if(a == true)
		{
			System.out.println("Department Name Was Assigned\n");
		}
		else
		{
			System.out.println("Department Name was Not Assigned\n");
		}
	}
	
	public boolean checkEmployee(String emp_name, String job, float salary, int dept_id,int[] eid) 
	{
		boolean flag1,flag2,flag3;
		String s;
		
		
		//Validation for Employee Name
		flag1 = validEmpName(emp_name);
		flag2 = validJob(job);
		s = calculateEmployeeId(dept_id,eid);
		flag3 = "False".equalsIgnoreCase(s);
		
		if(flag1==false)
		{
			System.out.println("Enter Correct Employee Name\n");
		}
		if(flag2 == false)
		{
			System.out.println("Enter Job Role Properly");
		}
		if(flag3 == false)
		{
			System.out.println("Enter Department ID Properly");
		}
		if(flag1 && flag2 && flag3)
		{
			this.emp_name = emp_name;
			this.job = job;
			this.salary = salary;
			this.dept_id = dept_id;
			this.emp_id = s;
			calculateDA(salary,dept_id);
			deptName(dept_id);
			
			System.out.println("All Fields are Updated Successfully\n");
			return true;
			
		}
		else
		{
			return false;
		}
	}
}
