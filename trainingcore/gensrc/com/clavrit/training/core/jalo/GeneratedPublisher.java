/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 10-Jul-2024, 12:03:59 pm                    ---
 * ----------------------------------------------------------------
 */
package com.clavrit.training.core.jalo;

import com.clavrit.training.core.constants.TrainingCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Publisher}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedPublisher extends GenericItem
{
	/** Qualifier of the <code>Publisher.publisherID</code> attribute **/
	public static final String PUBLISHERID = "publisherID";
	/** Qualifier of the <code>Publisher.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Publisher.location</code> attribute **/
	public static final String LOCATION = "location";
	/** Qualifier of the <code>Publisher.contactEmail</code> attribute **/
	public static final String CONTACTEMAIL = "contactEmail";
	/** Qualifier of the <code>Publisher.contactPhone</code> attribute **/
	public static final String CONTACTPHONE = "contactPhone";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PUBLISHERID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(LOCATION, AttributeMode.INITIAL);
		tmp.put(CONTACTEMAIL, AttributeMode.INITIAL);
		tmp.put(CONTACTPHONE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publisher.contactEmail</code> attribute.
	 * @return the contactEmail
	 */
	public String getContactEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTACTEMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publisher.contactEmail</code> attribute.
	 * @return the contactEmail
	 */
	public String getContactEmail()
	{
		return getContactEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Publisher.contactEmail</code> attribute. 
	 * @param value the contactEmail
	 */
	public void setContactEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTACTEMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Publisher.contactEmail</code> attribute. 
	 * @param value the contactEmail
	 */
	public void setContactEmail(final String value)
	{
		setContactEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publisher.contactPhone</code> attribute.
	 * @return the contactPhone
	 */
	public Long getContactPhone(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, CONTACTPHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publisher.contactPhone</code> attribute.
	 * @return the contactPhone
	 */
	public Long getContactPhone()
	{
		return getContactPhone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publisher.contactPhone</code> attribute. 
	 * @return the contactPhone
	 */
	public long getContactPhoneAsPrimitive(final SessionContext ctx)
	{
		Long value = getContactPhone( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publisher.contactPhone</code> attribute. 
	 * @return the contactPhone
	 */
	public long getContactPhoneAsPrimitive()
	{
		return getContactPhoneAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Publisher.contactPhone</code> attribute. 
	 * @param value the contactPhone
	 */
	public void setContactPhone(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, CONTACTPHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Publisher.contactPhone</code> attribute. 
	 * @param value the contactPhone
	 */
	public void setContactPhone(final Long value)
	{
		setContactPhone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Publisher.contactPhone</code> attribute. 
	 * @param value the contactPhone
	 */
	public void setContactPhone(final SessionContext ctx, final long value)
	{
		setContactPhone( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Publisher.contactPhone</code> attribute. 
	 * @param value the contactPhone
	 */
	public void setContactPhone(final long value)
	{
		setContactPhone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publisher.location</code> attribute.
	 * @return the location
	 */
	public String getLocation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publisher.location</code> attribute.
	 * @return the location
	 */
	public String getLocation()
	{
		return getLocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Publisher.location</code> attribute. 
	 * @param value the location
	 */
	public void setLocation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Publisher.location</code> attribute. 
	 * @param value the location
	 */
	public void setLocation(final String value)
	{
		setLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publisher.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publisher.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Publisher.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Publisher.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publisher.publisherID</code> attribute.
	 * @return the publisherID
	 */
	public String getPublisherID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PUBLISHERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publisher.publisherID</code> attribute.
	 * @return the publisherID
	 */
	public String getPublisherID()
	{
		return getPublisherID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Publisher.publisherID</code> attribute. 
	 * @param value the publisherID
	 */
	public void setPublisherID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PUBLISHERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Publisher.publisherID</code> attribute. 
	 * @param value the publisherID
	 */
	public void setPublisherID(final String value)
	{
		setPublisherID( getSession().getSessionContext(), value );
	}
	
}
