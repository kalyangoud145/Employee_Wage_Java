public class EmpWage
{
   public static void main(String [] args)
   {
      System.out.println("Welcome to Employee Wage Computation program");
		int salary,empRatePerHr=20,empHrs,totalSalary=0,day=1;
		int maxWorkingHrs=100,maxWorkDays=20,totalEmpHrs=1;
		final int IS_FULL_TIME = 1;
	   final int IS_PART_TIME = 2;
		while(totalEmpHrs <= maxWorkingHrs && day <= maxWorkDays)
		{
		double empCheck=Math.floor(Math.random()*10)%3;
		switch ((int) empCheck)
			{
			case IS_FULL_TIME:
					empHrs=8;
					break;
			case IS_PART_TIME :
					empHrs=4;
					break;
			default:
         		empHrs=0;
					break;
			}
		totalEmpHrs=totalEmpHrs+empHrs;
		salary=empHrs*empRatePerHr;
      totalSalary +=  salary;
		day++;
		}
		System.out.println("Total salary:"+totalSalary);
   }
}

