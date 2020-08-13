public class EmpWage
{
   public static void main(String [] args)
   {
      System.out.println("Welcome to Employee Wage Computation program");
		int IS_FULLTIME=1;
      double empCheck=Math.floor(Math.random()*10)%2;
      if (empCheck == IS_FULLTIME)
         {
         System.out.println("Present");
         }
      else
         {
         System.out.println("Absent");
         }
   }
}

