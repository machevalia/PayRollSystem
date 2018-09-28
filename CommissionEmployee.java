// Nickolas Berrie CSIS 312 Polymorphism and Inheritence. 
package payrollsystem;
 

public class CommissionEmployee extends Employee
{
   private double grossSales; // gross weekly sales
   private double commissionRate; // commission percentage
 
   // five-argument constructor
   public CommissionEmployee( String first, String last, String ssn, double grossSales, double commissionRate )
   {
      super( first, last, ssn);
      
      if (commissionRate <= 0.0 || commissionRate >=1.0)//validate rate
          throw new IllegalArgumentException(
          "Commission rate must be > 0.0 and < 1.0");
      
      if (grossSales < 0.0)//validate sales
          throw new IllegalArgumentException(
          "Gross sales must be >= 0.0");
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } // end five-argument CommissionEmployee constructor
 

   // return commission rate
   public double returnCommissionRate()
   {
      return commissionRate;
   } // end method getCommissionRate
 
 
   // return gross sales amount
   public double returnGrossSales()
   {
      return grossSales;
   } // end method getGrossSales
 
   // calculate earnings; override abstract method earnings in Employee
   @Override
   public double earnings()
   {
      return returnCommissionRate() * returnGrossSales();
   } // end method earnings
 
   // return String representation of CommissionEmployee object
    @Override
   public String toString()
   {
      return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f",
         "commission employee", super.toString(),
         "gross sales", returnGrossSales(),
         "commission rate", returnCommissionRate() );
   } // end method toString
} // end class CommissionEmployee
