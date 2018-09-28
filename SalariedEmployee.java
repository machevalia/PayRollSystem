// Nickolas Berrie CSIS 312 Polymorphism and Inheritence. 
package payrollsystem;
 

public class SalariedEmployee extends Employee
{
   private double weeklySalary;
 
   // four-argument constructor
    public SalariedEmployee(String firstName, String lastName,
	String socialSecurityNumber, double weeklySalary)
	{
	super(firstName, lastName, socialSecurityNumber);

	if (weeklySalary < 0.0)
		throw new IllegalArgumentException(
			"Weekly salary much be >= 0.0");

	this.weeklySalary = weeklySalary;
	}

	//set salary
	public void setWeeklySalary(double weeklySalary)
	{
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException(
				"Weekly salary must be >= 0.0");

	}
	//return salary
	public double getWeeklySalary()
	{
		return weeklySalary;
	}
   // calculate earnings; override abstract method earnings in Employee
   @Override
   public double earnings()
   {
      return getWeeklySalary();
   } // end method earnings
 
   // return String representation of SalariedEmployee object
    @Override
   public String toString()
   {
      return String.format( "salaried employee: %s\n%s: $%,.2f",
         super.toString(), "weekly salary", getWeeklySalary() );
   } // end method toString
} // end class SalariedEmployee