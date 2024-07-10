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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem MyFAQ}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMyFAQ extends GenericItem
{
	/** Qualifier of the <code>MyFAQ.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>MyFAQ.question</code> attribute **/
	public static final String QUESTION = "question";
	/** Qualifier of the <code>MyFAQ.answer</code> attribute **/
	public static final String ANSWER = "answer";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(QUESTION, AttributeMode.INITIAL);
		tmp.put(ANSWER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFAQ.answer</code> attribute.
	 * @return the answer
	 */
	public String getAnswer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ANSWER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFAQ.answer</code> attribute.
	 * @return the answer
	 */
	public String getAnswer()
	{
		return getAnswer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFAQ.answer</code> attribute. 
	 * @param value the answer
	 */
	public void setAnswer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ANSWER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFAQ.answer</code> attribute. 
	 * @param value the answer
	 */
	public void setAnswer(final String value)
	{
		setAnswer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFAQ.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFAQ.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFAQ.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFAQ.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFAQ.question</code> attribute.
	 * @return the question
	 */
	public String getQuestion(final SessionContext ctx)
	{
		return (String)getProperty( ctx, QUESTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFAQ.question</code> attribute.
	 * @return the question
	 */
	public String getQuestion()
	{
		return getQuestion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFAQ.question</code> attribute. 
	 * @param value the question
	 */
	public void setQuestion(final SessionContext ctx, final String value)
	{
		setProperty(ctx, QUESTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFAQ.question</code> attribute. 
	 * @param value the question
	 */
	public void setQuestion(final String value)
	{
		setQuestion( getSession().getSessionContext(), value );
	}
	
}
