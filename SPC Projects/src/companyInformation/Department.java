package companyInformation;

public class Department 
{
	public int dept_id;
	public String dept_name;
	
	public boolean generateDeptName(int dept_id)
	{
		this.dept_id = dept_id;
		int check =((int)dept_id/100); 
		if(check == 1)
		{
			this.dept_name = "CSE";
			return true;
		}
		else if(check == 2)
		{
			this.dept_name = "ECE";
			return true;
		}
		else if(check == 3)
		{
			this.dept_name = "ME";
			return true;
		}
		else if(check == 4)
		{
			this.dept_name = "EEE";
			return true;
		}
		else if(check == 5)
		{
			this.dept_name = "IT";
			return true;
		}
		else
		{
			return false;
		}
	}
	
	

}
