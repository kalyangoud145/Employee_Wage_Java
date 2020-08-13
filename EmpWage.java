public class EmpWage
{
   public static void main(String [] args)
   {
      System.out.println("Welcome to Employee Wage Computation program");
		int IS_FULLTIME=1,IS_PARTTIME=2,salary,empRatePerHr=20,empHrs,numWorkingDays=20,totalsalary=0,day;
		for( day=1;day<=numWorkingDays;day++)
		{
		double empCheck=Math.floor(Math.random()*10)%3;
		int empcheck=(int) empCheck;
		switch (empcheck)
			{
			case 1:
					empHrs=8;
					break;
			case 2:
					empHrs=4;
					break;
			default:
         		empHrs=0;
					break;
		}
		salary=empHrs*empRatePerHr;
      totalsalary=totalsalary+salary;
		}
		System.out.println("Total salary:"+totalsalary);
   }
}

