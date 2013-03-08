package org.pentaho.metastore.api;

import java.util.List;

public interface IMetaStoreAttribute {
  /**
   * @return The ID or key of the metastore attribute
   */
  public String getId();
  
  /**
   * @param id The ID or key of the attribute to set.
   */
  public void setId(String id);
  
  /**
   * @return The value of the attribute
   */
  public Object getValue();
  
  /**
   * @param value The attribute value to set. 
   */
  public void setValue(Object value);
  
  /**
   * @return A list of the child attributes
   */
  public List<IMetaStoreAttribute> getChildren();
  
  /**
   * @param attribute The attribute to add
   */
  public void addChild(IMetaStoreAttribute attribute);
  
  /**
   * @param attributeId The ID or key of the attribute to delete
   */
  public void deleteChild(String attributeId);
  
  /**
   * Remove all child attributes
   */
  public void clearChildren();
  
  /**
   * Retrieve the child attribute with a certain id
   * @param id The id of the child attribute to retrieve
   * @return The attribute value or null if the attribute doesn't exist.
   */
  public IMetaStoreAttribute getChild(String id);
}