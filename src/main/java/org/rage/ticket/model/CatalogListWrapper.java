package org.rage.ticket.model;


import java.util.List;


/**
 * CatalogListWrapper represents ...
 *
 * @version $Id$
 * @since 17/02/2015
 *
 */
public class CatalogListWrapper extends CommonBase
{
   private List <Catalog> catalogList;


   /**
    * Constructs an instance of CatalogListWrapper object.
    */
   public CatalogListWrapper ()
   {
      setValid (Boolean.TRUE);
   }


   /**
    * Constructs an instance of CatalogListWrapper object.
    * @param catalogList
    */
   public CatalogListWrapper (final List <Catalog> catalogList)
   {
      setValid (Boolean.TRUE);
      this.catalogList = catalogList;
   }


   /**
    * @return the catalogList
    */
   public List <Catalog> getCatalogList ()
   {
      return catalogList;
   }


   /**
    * @param catalogList the catalogList to set
    */
   public void setCatalogList (final List <Catalog> catalogList)
   {
      this.catalogList = catalogList;
   }


}
