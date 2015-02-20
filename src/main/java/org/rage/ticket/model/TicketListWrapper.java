package org.rage.ticket.model;


import java.util.List;


/**
 * TicketListWrapper represents ...
 *
 * @version $Id$
 * @since 18/02/2015
 *
 */
public class TicketListWrapper extends CommonBase
{
   private List <Ticket> tickets;


   /**
    * @return the tickets
    */
   public List <Ticket> getTickets ()
   {
      return tickets;
   }


   /**
    * @param tickets the tickets to set
    */
   public void setTickets (final List <Ticket> tickets)
   {
      this.tickets = tickets;
   }

}
