package org.rage.ticket.exception;


/**
 * TicketBaseException represents ...
 *
 * @version $Id$
 * @since Apr 27, 2015
 *
 */
public class TicketBaseException extends Exception
{

   /** long for serialVersionUID */
   private static final long serialVersionUID = 1L;


   /**
    * Constructs an instance of TicketBaseException object.
    *
    * @param errorMessage
    * @param cause
    */
   public TicketBaseException (final String errorMessage, final Throwable cause)
   {
      super (errorMessage, cause);
   }


   /**
    * Constructs an instance of TicketBaseException object.
    *
    * @param errorMessage
    */
   public TicketBaseException (final String errorMessage)
   {
      super (errorMessage);
   }
}
