// Nickolas Berrie CSIS 312 Polymorphism and Inheritence. 
package payrollsystem;


public class BasePlusCommissionEmployee extends CommissionEmployee
{
   private double baseSalary; // base salary per week
 
   // six-argument constructor
   public BasePlusCommissionEmployee( String first, String last,
      String ssn,double sales, double rate, double salary )
   {
      super( first, last, ssn,sales, rate );
      setBaseSalary( salary ); // validate and store base salary
   } // end six-argument BasePlusCommissionEmployee constructor
 
   // set base salary
   public final void setBaseSalary( double baseSalary )
   {
      if (baseSalary < 0.0) //validate
          throw new IllegalArgumentException(
          "Base Salary must be >=0.0");
      this.baseSalary = baseSalary;
   } // end method setBaseSalary
 
   // return base salary
   public double returnBaseSalary()
   {
      return baseSalary;
   } // end method getBaseSalary
 
   // calculate earnings; override method earnings in CommissionEmployee
    @Override
   public double earnings()
   {
      return returnBaseSalary() + super.earnings();
   } // end method earnings
 
   // return String representation of BasePlusCommissionEmployee object
    @Override
   public String toString()
   {
      return String.format( "%s %s; %s: $%,.2f",
         "base-salaried", super.toString(),
         "base salary", returnBaseSalary() );
   } // end method toString
} // end class BasePlusCommissionEmployee
