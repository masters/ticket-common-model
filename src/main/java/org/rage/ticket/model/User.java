package org.rage.ticket.model;


/**
 * User represents ...
 *
 * @author <a href="mailto:hmendoza@24hourfit.com">hector.mendoza</a>
 * @version $Id$
 * @since 12/02/2015
 *
 */
public class User extends CommonBase
{
   private Integer id;
   private String  firstName;
   private String  lastName;
   private String  email;
   private String  department;


   /**
    * @return the id
    */
   public Integer getId ()
   {
      return id;
   }


   /**
    * @param id the id to set
    */
   public void setId (final Integer id)
   {
      this.id = id;
   }


   /**
    * @return the firstName
    */
   public String getFirstName ()
   {
      return firstName;
   }


   /**
    * @param firstName the firstName to set
    */
   public void setFirstName (final String firstName)
   {
      this.firstName = firstName;
   }


   /**
    * @return the lastName
    */
   public String getLastName ()
   {
      return lastName;
   }


   /**
    * @param lastName the lastName to set
    */
   public void setLastName (final String lastName)
   {
      this.lastName = lastName;
   }


   /**
    * @return the email
    */
   public String getEmail ()
   {
      return email;
   }


   /**
    * @param email the email to set
    */
   public void setEmail (final String email)
   {
      this.email = email;
   }


   /**
    * @return the department
    */
   public String getDepartment ()
   {
      return department;
   }


   /**
    * @param department the department to set
    */
   public void setDepartment (final String department)
   {
      this.department = department;
   }

}
