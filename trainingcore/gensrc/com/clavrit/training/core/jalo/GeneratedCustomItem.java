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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CustomItem}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCustomItem extends GenericItem
{
	/** Qualifier of the <code>CustomItem.customName</code> attribute **/
	public static final String CUSTOMNAME = "customName";
	/** Qualifier of the <code>CustomItem.customCode</code> attribute **/
	public static final String CUSTOMCODE = "customCode";
	/** Qualifier of the <code>CustomItem.customDescription</code> attribute **/
	public static final String CUSTOMDESCRIPTION = "customDescription";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CUSTOMNAME, AttributeMode.INITIAL);
		tmp.put(CUSTOMCODE, AttributeMode.INITIAL);
		tmp.put(CUSTOMDESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomItem.customCode</code> attribute.
	 * @return the customCode
	 */
	public String getCustomCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomItem.customCode</code> attribute.
	 * @return the customCode
	 */
	public String getCustomCode()
	{
		return getCustomCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomItem.customCode</code> attribute. 
	 * @param value the customCode
	 */
	public void setCustomCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomItem.customCode</code> attribute. 
	 * @param value the customCode
	 */
	public void setCustomCode(final String value)
	{
		setCustomCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomItem.customDescription</code> attribute.
	 * @return the customDescription
	 */
	public String getCustomDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomItem.customDescription</code> attribute.
	 * @return the customDescription
	 */
	public String getCustomDescription()
	{
		return getCustomDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomItem.customDescription</code> attribute. 
	 * @param value the customDescription
	 */
	public void setCustomDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomItem.customDescription</code> attribute. 
	 * @param value the customDescription
	 */
	public void setCustomDescription(final String value)
	{
		setCustomDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomItem.customName</code> attribute.
	 * @return the customName
	 */
	public String getCustomName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomItem.customName</code> attribute.
	 * @return the customName
	 */
	public String getCustomName()
	{
		return getCustomName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomItem.customName</code> attribute. 
	 * @param value the customName
	 */
	public void setCustomName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomItem.customName</code> attribute. 
	 * @param value the customName
	 */
	public void setCustomName(final String value)
	{
		setCustomName( getSession().getSessionContext(), value );
	}
	
}
