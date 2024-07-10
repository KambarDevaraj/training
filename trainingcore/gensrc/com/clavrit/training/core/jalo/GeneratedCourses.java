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
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Courses}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCourses extends GenericItem
{
	/** Qualifier of the <code>Courses.courseCode</code> attribute **/
	public static final String COURSECODE = "courseCode";
	/** Qualifier of the <code>Courses.courseName</code> attribute **/
	public static final String COURSENAME = "courseName";
	/** Qualifier of the <code>Courses.courseDuration</code> attribute **/
	public static final String COURSEDURATION = "courseDuration";
	/** Qualifier of the <code>Courses.courseAmount</code> attribute **/
	public static final String COURSEAMOUNT = "courseAmount";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COURSECODE, AttributeMode.INITIAL);
		tmp.put(COURSENAME, AttributeMode.INITIAL);
		tmp.put(COURSEDURATION, AttributeMode.INITIAL);
		tmp.put(COURSEAMOUNT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.courseAmount</code> attribute.
	 * @return the courseAmount
	 */
	public String getCourseAmount(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COURSEAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.courseAmount</code> attribute.
	 * @return the courseAmount
	 */
	public String getCourseAmount()
	{
		return getCourseAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.courseAmount</code> attribute. 
	 * @param value the courseAmount
	 */
	public void setCourseAmount(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COURSEAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.courseAmount</code> attribute. 
	 * @param value the courseAmount
	 */
	public void setCourseAmount(final String value)
	{
		setCourseAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.courseCode</code> attribute.
	 * @return the courseCode
	 */
	public String getCourseCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COURSECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.courseCode</code> attribute.
	 * @return the courseCode
	 */
	public String getCourseCode()
	{
		return getCourseCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.courseCode</code> attribute. 
	 * @param value the courseCode
	 */
	public void setCourseCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COURSECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.courseCode</code> attribute. 
	 * @param value the courseCode
	 */
	public void setCourseCode(final String value)
	{
		setCourseCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.courseDuration</code> attribute.
	 * @return the courseDuration
	 */
	public String getCourseDuration(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COURSEDURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.courseDuration</code> attribute.
	 * @return the courseDuration
	 */
	public String getCourseDuration()
	{
		return getCourseDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.courseDuration</code> attribute. 
	 * @param value the courseDuration
	 */
	public void setCourseDuration(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COURSEDURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.courseDuration</code> attribute. 
	 * @param value the courseDuration
	 */
	public void setCourseDuration(final String value)
	{
		setCourseDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.courseName</code> attribute.
	 * @return the courseName
	 */
	public String getCourseName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCourses.getCourseName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, COURSENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.courseName</code> attribute.
	 * @return the courseName
	 */
	public String getCourseName()
	{
		return getCourseName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.courseName</code> attribute. 
	 * @return the localized courseName
	 */
	public Map<Language,String> getAllCourseName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,COURSENAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.courseName</code> attribute. 
	 * @return the localized courseName
	 */
	public Map<Language,String> getAllCourseName()
	{
		return getAllCourseName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.courseName</code> attribute. 
	 * @param value the courseName
	 */
	public void setCourseName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCourses.setCourseName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, COURSENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.courseName</code> attribute. 
	 * @param value the courseName
	 */
	public void setCourseName(final String value)
	{
		setCourseName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.courseName</code> attribute. 
	 * @param value the courseName
	 */
	public void setAllCourseName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,COURSENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.courseName</code> attribute. 
	 * @param value the courseName
	 */
	public void setAllCourseName(final Map<Language,String> value)
	{
		setAllCourseName( getSession().getSessionContext(), value );
	}
	
}
