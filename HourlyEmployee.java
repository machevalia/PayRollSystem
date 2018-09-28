// Nickolas Berrie CSIS 312 Polymorphism and Inheritence. 
package payrollsystem;
 

public class HourlyEmployee extends Employee
{
   private double wage; // wage per hour
   private double hours; // hours worked for week
 
   // five-argument constructor
   public HourlyEmployee( String first, String last, String ssn, double hourlyWage, double hoursWorked )
   {
      super( first, last, ssn);
      if (wage < 0.0)//validate wage
           throw new IllegalArgumentException(
           "Hourly wage must be >=0.0");
      if ((hours < 0.0) || (hours > 168.0)) //validate hours
          throw new IllegalArgumentException(
          "Hours worked must be >=0.0 and <=168.0");
   } // end five-argument HourlyEmployee constructor

 
   // return wage
   public double returnWage()
   {
      return wage;
   } // end method getWage
 
   // return hours worked
   public double returnHours()
   {
      return hours;
   } // end method getHours
 
   // calculate earnings; override abstract method earnings in Employee
   @Override
   public double earnings()
   {
      if ( returnHours() <= 40 ) // no overtime
         return returnWage() *returnHours();
      else
         return 40 * returnWage() + ( returnHours() - 40 ) * returnWage() * 1.5;
   } // end method earnings
 
   // return String representation of HourlyEmployee object
    @Override
   public String toString()
   {
      return String.format( "hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
         super.toString(), "hourly wage", returnWage(),
         "hours worked", returnHours() );
   } // end method toString
} // end class HourlyEmployee