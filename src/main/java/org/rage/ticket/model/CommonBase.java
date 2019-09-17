package org.rage.ticket.model;


import java.io.Serializable;


/**
 * CommonBase represents ...
 *
 */
public class CommonBase implements Serializable
{

   /** long for serialVersionUID */
   private static final long serialVersionUID = 1L;
   private String            errorMessage;
   private boolean           valid;


   /**
    * @return the errorMessage
    */
   public String getErrorMessage ()
   {
      return errorMessage;
   }


   /**
    * @param errorMessage the errorMessage to set
    */
   public void setErrorMessage (final String errorMessage)
   {
      this.errorMessage = errorMessage;
   }


   /**
    * @return the valid
    */
   public boolean isValid ()
   {
      return valid;
   }


   /**
    * @param valid the valid to set
    */
   public void setValid (final boolean valid)
   {
      this.valid = valid;
   }

}
