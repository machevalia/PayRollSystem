// Nickolas Berrie CSIS 312 Polymorphism and Inheritence. 
package payrollsystem;
 

public abstract class Employee
{
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;
 
   // three-argument constructor
   public Employee( String first, String last, String ssn)
   {
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
   } 
   // end constructor
 
   // return first name
   public String getFirstName()
   {
      return firstName;
   } 
 
   // return last name
   public String getLastName()
   {
      return lastName;
   } 

 
   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } 
 
 
   // return String representation of Employee object
    @Override
   public String toString()
   {
      return String.format( "%s %s%nsocial security number: %s",
         getFirstName(), getLastName(), getSocialSecurityNumber());
   } // end method toString
 
   // abstract method overridden by concrete subclasses
   public abstract double earnings(); // no implementation here
} // end abstract class Employee