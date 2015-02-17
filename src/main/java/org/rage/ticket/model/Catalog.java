package org.rage.ticket.model;


/**
 * Catalog represents ...
 *
 * @author Hector Mendoza
 * @version $Id$
 * @since 12/02/2015
 *
 */
public class Catalog extends CommonBase
{

   private Integer id;
   private String  description;


   public Catalog ()
   {
      setValid (Boolean.TRUE);
   }

   public Catalog (Integer id, String description)
   {
      setValid (Boolean.TRUE);
      this.id = id;
      this.description = description;
   }

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
    * @return the description
    */
   public String getDescription ()
   {
      return description;
   }


   /**
    * @param description the description to set
    */
   public void setDescription (final String description)
   {
      this.description = description;
   }


}
