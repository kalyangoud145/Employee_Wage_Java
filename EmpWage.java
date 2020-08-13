public class EmpWage
{
   public static void main(String [] args)
   {
      System.out.println("Welcome to Employee Wage Computation program");
		int IS_FULLTIME=1,salary,empRatePerHr,empHrs;
      double empCheck=Math.floor(Math.random()*10)%2;
      if (empCheck == IS_FULLTIME)
         {
			empRatePerHr=20;
   		empHrs=8;
   		salary=empRatePerHr*empHrs;
			System.out.println("Present");
			System.out.println("Salary: "+salary);
         }
      else
         {
         System.out.println("Absent");
			System.out.println("Salary=0");
         }
   }
}

