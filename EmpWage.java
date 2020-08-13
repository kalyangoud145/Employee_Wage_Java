public class EmpWage
{
   public static void main(String [] args)
   {
      System.out.println("Welcome to Employee Wage Computation program");
		int IS_FULLTIME=1,IS_PARTTIME=2,salary,empRatePerHr=20,empHrs;
      double empCheck=Math.floor(Math.random()*10)%3;
      if (empCheck == IS_FULLTIME)
        {
			empHrs=8;
   		salary=empRatePerHr*empHrs;
			System.out.println("Present");
			System.out.println("Salary: "+salary);
         }
		else if (empCheck==IS_PARTTIME)
		{
			empHrs=4;
         salary=empRatePerHr*empHrs;
         System.out.println("Present for parttime");
         System.out.println("Salary: "+salary);
		}
      else
         {
         System.out.println("Absent");
			System.out.println("Salary=0");
         }
   }
}

