package org.rage.ticket.model;


import java.util.Date;


/**
 * Ticket represents ...
 *
 * @version $Id$
 * @since 12/02/2015
 *
 */
public class Ticket extends CommonBase
{
   private Integer id;
   private Catalog report;
   private User    creator;
   private Date    creationDate;
   private User    responsible;
   private Catalog priority;
   private Catalog area;
   private String  description;
   private Catalog serviceType;
   private Catalog status;
   private User    solvedBy;
   private String  solutionDescription;


   /**
    * Constructs an instance of Ticket object.
    */
   public Ticket ()
   {
      setValid (Boolean.TRUE);
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
    * @return the report
    */
   public Catalog getReport ()
   {
      return report;
   }


   /**
    * @param report the report to set
    */
   public void setReport (final Catalog report)
   {
      this.report = report;
   }


   /**
    * @return the creator
    */
   public User getCreator ()
   {
      return creator;
   }


   /**
    * @param creator the creator to set
    */
   public void setCreator (final User creator)
   {
      this.creator = creator;
   }


   /**
    * @return the creationDate
    */
   public Date getCreationDate ()
   {
      return creationDate;
   }


   /**
    * @param creationDate the creationDate to set
    */
   public void setCreationDate (final Date creationDate)
   {
      this.creationDate = creationDate;
   }


   /**
    * @return the responsible
    */
   public User getResponsible ()
   {
      return responsible;
   }


   /**
    * @param responsible the responsible to set
    */
   public void setResponsible (final User responsible)
   {
      this.responsible = responsible;
   }


   /**
    * @return the priority
    */
   public Catalog getPriority ()
   {
      return priority;
   }


   /**
    * @param priority the priority to set
    */
   public void setPriority (final Catalog priority)
   {
      this.priority = priority;
   }


   /**
    * @return the area
    */
   public Catalog getArea ()
   {
      return area;
   }


   /**
    * @param area the area to set
    */
   public void setArea (final Catalog area)
   {
      this.area = area;
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


   /**
    * @return the serviceType
    */
   public Catalog getServiceType ()
   {
      return serviceType;
   }


   /**
    * @param serviceType the serviceType to set
    */
   public void setServiceType (final Catalog serviceType)
   {
      this.serviceType = serviceType;
   }


   /**
    * @return the status
    */
   public Catalog getStatus ()
   {
      return status;
   }


   /**
    * @param status the status to set
    */
   public void setStatus (final Catalog status)
   {
      this.status = status;
   }


   /**
    * @return the solvedBy
    */
   public User getSolvedBy ()
   {
      return solvedBy;
   }


   /**
    * @param solvedBy the solvedBy to set
    */
   public void setSolvedBy (final User solvedBy)
   {
      this.solvedBy = solvedBy;
   }


   /**
    * @return the solutionDescription
    */
   public String getSolutionDescription ()
   {
      return solutionDescription;
   }


   /**
    * @param solutionDescription the solutionDescription to set
    */
   public void setSolutionDescription (final String solutionDescription)
   {
      this.solutionDescription = solutionDescription;
   }


}
