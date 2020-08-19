
public class EmployeeWage 
{
    final int IS_FULL_TIME = 1;
    final int IS_PART_TIME = 2;
    int salary,empRatePerHr=20, totalSalary=0;
    public  int computeEmpWage() 
	{
		int empHrs =0;
		int totalEmpHrs =0;
		int totalWorkingDays = 0;
		int maxHrPerMonth=100;
		int numberOfWorkingDays=20;
		while (totalEmpHrs <=maxHrPerMonth && totalWorkingDays <= numberOfWorkingDays)
		{
			totalWorkingDays++;
			double empCheck = Math.floor(Math.random()*10)%3;
			switch ((int) empCheck)
			{
			case IS_FULL_TIME:
				empHrs=8;
				break;
			case IS_PART_TIME:
				empHrs=4;
				break;
			default:
				empHrs=0;
			}
			totalEmpHrs=totalEmpHrs+empHrs;
			salary=empHrs*empRatePerHr;
	        totalSalary +=  salary;
		}
		return totalSalary;
		}
    	public static void main(String[] args) {
    	EmployeeWage obj =new EmployeeWage();
    	System.out.println("The total Employee Wage: "+obj.computeEmpWage());
    }
}

