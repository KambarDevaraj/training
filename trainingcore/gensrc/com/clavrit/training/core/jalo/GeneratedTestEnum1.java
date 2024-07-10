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
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem TestEnum1}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTestEnum1 extends GenericItem
{
	/** Qualifier of the <code>TestEnum1.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>TestEnum1.laptopType</code> attribute **/
	public static final String LAPTOPTYPE = "laptopType";
	/** Qualifier of the <code>TestEnum1.mobileType</code> attribute **/
	public static final String MOBILETYPE = "mobileType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(LAPTOPTYPE, AttributeMode.INITIAL);
		tmp.put(MOBILETYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestEnum1.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestEnum1.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestEnum1.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestEnum1.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestEnum1.laptopType</code> attribute.
	 * @return the laptopType
	 */
	public EnumerationValue getLaptopType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, LAPTOPTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestEnum1.laptopType</code> attribute.
	 * @return the laptopType
	 */
	public EnumerationValue getLaptopType()
	{
		return getLaptopType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestEnum1.laptopType</code> attribute. 
	 * @param value the laptopType
	 */
	public void setLaptopType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, LAPTOPTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestEnum1.laptopType</code> attribute. 
	 * @param value the laptopType
	 */
	public void setLaptopType(final EnumerationValue value)
	{
		setLaptopType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestEnum1.mobileType</code> attribute.
	 * @return the mobileType
	 */
	public EnumerationValue getMobileType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MOBILETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestEnum1.mobileType</code> attribute.
	 * @return the mobileType
	 */
	public EnumerationValue getMobileType()
	{
		return getMobileType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestEnum1.mobileType</code> attribute. 
	 * @param value the mobileType
	 */
	public void setMobileType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MOBILETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestEnum1.mobileType</code> attribute. 
	 * @param value the mobileType
	 */
	public void setMobileType(final EnumerationValue value)
	{
		setMobileType( getSession().getSessionContext(), value );
	}
	
}
