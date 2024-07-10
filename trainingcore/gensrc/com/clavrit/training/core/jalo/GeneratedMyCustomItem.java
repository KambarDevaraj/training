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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem MyCustomItem}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMyCustomItem extends GenericItem
{
	/** Qualifier of the <code>MyCustomItem.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>MyCustomItem.createdDate</code> attribute **/
	public static final String CREATEDDATE = "createdDate";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomItem.createdDate</code> attribute.
	 * @return the createdDate
	 */
	public abstract Date getCreatedDate(final SessionContext ctx);
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomItem.createdDate</code> attribute.
	 * @return the createdDate
	 */
	public Date getCreatedDate()
	{
		return getCreatedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomItem.createdDate</code> attribute. 
	 * @param value the createdDate
	 */
	public abstract void setCreatedDate(final SessionContext ctx, final Date value);
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomItem.createdDate</code> attribute. 
	 * @param value the createdDate
	 */
	public void setCreatedDate(final Date value)
	{
		setCreatedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomItem.status</code> attribute.
	 * @return the status
	 */
	public abstract String getStatus(final SessionContext ctx);
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCustomItem.status</code> attribute.
	 * @return the status
	 */
	public String getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomItem.status</code> attribute. 
	 * @param value the status
	 */
	public abstract void setStatus(final SessionContext ctx, final String value);
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCustomItem.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final String value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
}
