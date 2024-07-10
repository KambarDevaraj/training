/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 10-Jul-2024, 12:03:59 pm                    ---
 * ----------------------------------------------------------------
 */
package com.clavrit.training.core.jalo;

import com.clavrit.training.core.constants.TrainingCoreConstants;
import com.clavrit.training.core.jalo.Account;
import com.clavrit.training.core.jalo.ApparelProduct;
import com.clavrit.training.core.jalo.ApparelSizeVariantProduct;
import com.clavrit.training.core.jalo.ApparelStyleVariantProduct;
import com.clavrit.training.core.jalo.Courses;
import com.clavrit.training.core.jalo.CustomItem;
import com.clavrit.training.core.jalo.DiscountEmailProcess;
import com.clavrit.training.core.jalo.ElectronicsColorVariantProduct;
import com.clavrit.training.core.jalo.MyCustomItem;
import com.clavrit.training.core.jalo.MyFAQ;
import com.clavrit.training.core.jalo.Publisher;
import com.clavrit.training.core.jalo.TestEnum1;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.store.BaseStore;
import de.hybris.platform.storelocator.jalo.PointOfService;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>TrainingCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainingCoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n ACCOUNTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Account> CUSTOMER2ACCOUNTRELATIONACCOUNTSHANDLER = new OneToManyHandler<Account>(
	TrainingCoreConstants.TC.ACCOUNT,
	false,
	"customer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ORDER's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Order> CUSTOMER2ORDERORDERHANDLER = new OneToManyHandler<Order>(
	CoreConstants.TC.ORDER,
	false,
	"customer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("customAttribute", AttributeMode.INITIAL);
		tmp.put("onlineDays", AttributeMode.INITIAL);
		tmp.put("newProduct", AttributeMode.INITIAL);
		tmp.put("languages", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("publisher", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("customer", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.Order", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.accounts</code> attribute.
	 * @return the accounts
	 */
	public Collection<Account> getAccounts(final SessionContext ctx, final Customer item)
	{
		return CUSTOMER2ACCOUNTRELATIONACCOUNTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.accounts</code> attribute.
	 * @return the accounts
	 */
	public Collection<Account> getAccounts(final Customer item)
	{
		return getAccounts( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.accounts</code> attribute. 
	 * @param value the accounts
	 */
	public void setAccounts(final SessionContext ctx, final Customer item, final Collection<Account> value)
	{
		CUSTOMER2ACCOUNTRELATIONACCOUNTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.accounts</code> attribute. 
	 * @param value the accounts
	 */
	public void setAccounts(final Customer item, final Collection<Account> value)
	{
		setAccounts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accounts. 
	 * @param value the item to add to accounts
	 */
	public void addToAccounts(final SessionContext ctx, final Customer item, final Account value)
	{
		CUSTOMER2ACCOUNTRELATIONACCOUNTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accounts. 
	 * @param value the item to add to accounts
	 */
	public void addToAccounts(final Customer item, final Account value)
	{
		addToAccounts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accounts. 
	 * @param value the item to remove from accounts
	 */
	public void removeFromAccounts(final SessionContext ctx, final Customer item, final Account value)
	{
		CUSTOMER2ACCOUNTRELATIONACCOUNTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accounts. 
	 * @param value the item to remove from accounts
	 */
	public void removeFromAccounts(final Customer item, final Account value)
	{
		removeFromAccounts( getSession().getSessionContext(), item, value );
	}
	
	public Account createAccount(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.ACCOUNT );
			return (Account)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Account : "+e.getMessage(), 0 );
		}
	}
	
	public Account createAccount(final Map attributeValues)
	{
		return createAccount( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Courses createCourses(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.COURSES );
			return (Courses)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Courses : "+e.getMessage(), 0 );
		}
	}
	
	public Courses createCourses(final Map attributeValues)
	{
		return createCourses( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomItem createCustomItem(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.CUSTOMITEM );
			return (CustomItem)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomItem : "+e.getMessage(), 0 );
		}
	}
	
	public CustomItem createCustomItem(final Map attributeValues)
	{
		return createCustomItem( getSession().getSessionContext(), attributeValues );
	}
	
	public DiscountEmailProcess createDiscountEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.DISCOUNTEMAILPROCESS );
			return (DiscountEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating DiscountEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public DiscountEmailProcess createDiscountEmailProcess(final Map attributeValues)
	{
		return createDiscountEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public MyCustomItem createMyCustomItem(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.MYCUSTOMITEM );
			return (MyCustomItem)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MyCustomItem : "+e.getMessage(), 0 );
		}
	}
	
	public MyCustomItem createMyCustomItem(final Map attributeValues)
	{
		return createMyCustomItem( getSession().getSessionContext(), attributeValues );
	}
	
	public MyFAQ createMyFAQ(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.MYFAQ );
			return (MyFAQ)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MyFAQ : "+e.getMessage(), 0 );
		}
	}
	
	public MyFAQ createMyFAQ(final Map attributeValues)
	{
		return createMyFAQ( getSession().getSessionContext(), attributeValues );
	}
	
	public Publisher createPublisher(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.PUBLISHER );
			return (Publisher)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Publisher : "+e.getMessage(), 0 );
		}
	}
	
	public Publisher createPublisher(final Map attributeValues)
	{
		return createPublisher( getSession().getSessionContext(), attributeValues );
	}
	
	public TestEnum1 createTestEnum1(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.TESTENUM1 );
			return (TestEnum1)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TestEnum1 : "+e.getMessage(), 0 );
		}
	}
	
	public TestEnum1 createTestEnum1(final Map attributeValues)
	{
		return createTestEnum1( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customAttribute</code> attribute.
	 * @return the customAttribute
	 */
	public String getCustomAttribute(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.CUSTOMATTRIBUTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customAttribute</code> attribute.
	 * @return the customAttribute
	 */
	public String getCustomAttribute(final Product item)
	{
		return getCustomAttribute( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customAttribute</code> attribute. 
	 * @param value the customAttribute
	 */
	public void setCustomAttribute(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.CUSTOMATTRIBUTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customAttribute</code> attribute. 
	 * @param value the customAttribute
	 */
	public void setCustomAttribute(final Product item, final String value)
	{
		setCustomAttribute( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer(final SessionContext ctx, final Order item)
	{
		return (Customer)item.getProperty( ctx, TrainingCoreConstants.Attributes.Order.CUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer(final Order item)
	{
		return getCustomer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final SessionContext ctx, final Order item, final Customer value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Order.CUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final Order item, final Customer value)
	{
		setCustomer( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return TrainingCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.languages</code> attribute.
	 * @return the languages
	 */
	public Collection<String> getLanguages(final SessionContext ctx, final Product item)
	{
		Collection<String> coll = (Collection<String>)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.LANGUAGES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.languages</code> attribute.
	 * @return the languages
	 */
	public Collection<String> getLanguages(final Product item)
	{
		return getLanguages( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.languages</code> attribute. 
	 * @param value the languages
	 */
	public void setLanguages(final SessionContext ctx, final Product item, final Collection<String> value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.LANGUAGES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.languages</code> attribute. 
	 * @param value the languages
	 */
	public void setLanguages(final Product item, final Collection<String> value)
	{
		setLanguages( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.newProduct</code> attribute.
	 * @return the newProduct
	 */
	public Boolean isNewProduct(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.NEWPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.newProduct</code> attribute.
	 * @return the newProduct
	 */
	public Boolean isNewProduct(final Product item)
	{
		return isNewProduct( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.newProduct</code> attribute. 
	 * @return the newProduct
	 */
	public boolean isNewProductAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isNewProduct( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.newProduct</code> attribute. 
	 * @return the newProduct
	 */
	public boolean isNewProductAsPrimitive(final Product item)
	{
		return isNewProductAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.newProduct</code> attribute. 
	 * @param value the newProduct
	 */
	public void setNewProduct(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.NEWPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.newProduct</code> attribute. 
	 * @param value the newProduct
	 */
	public void setNewProduct(final Product item, final Boolean value)
	{
		setNewProduct( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.newProduct</code> attribute. 
	 * @param value the newProduct
	 */
	public void setNewProduct(final SessionContext ctx, final Product item, final boolean value)
	{
		setNewProduct( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.newProduct</code> attribute. 
	 * @param value the newProduct
	 */
	public void setNewProduct(final Product item, final boolean value)
	{
		setNewProduct( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.newStore</code> attribute.
	 * @return the newStore
	 */
	public abstract BaseStore getNewStore(final SessionContext ctx, final Customer item);
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.newStore</code> attribute.
	 * @return the newStore
	 */
	public BaseStore getNewStore(final Customer item)
	{
		return getNewStore( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.newStore</code> attribute. 
	 * @param value the newStore
	 */
	public abstract void setNewStore(final SessionContext ctx, final Customer item, final BaseStore value);
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.newStore</code> attribute. 
	 * @param value the newStore
	 */
	public void setNewStore(final Customer item, final BaseStore value)
	{
		setNewStore( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.onlineDays</code> attribute.
	 * @return the onlineDays
	 */
	public Boolean isOnlineDays(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.ONLINEDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.onlineDays</code> attribute.
	 * @return the onlineDays
	 */
	public Boolean isOnlineDays(final Product item)
	{
		return isOnlineDays( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.onlineDays</code> attribute. 
	 * @return the onlineDays
	 */
	public boolean isOnlineDaysAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isOnlineDays( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.onlineDays</code> attribute. 
	 * @return the onlineDays
	 */
	public boolean isOnlineDaysAsPrimitive(final Product item)
	{
		return isOnlineDaysAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.onlineDays</code> attribute. 
	 * @param value the onlineDays
	 */
	public void setOnlineDays(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.ONLINEDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.onlineDays</code> attribute. 
	 * @param value the onlineDays
	 */
	public void setOnlineDays(final Product item, final Boolean value)
	{
		setOnlineDays( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.onlineDays</code> attribute. 
	 * @param value the onlineDays
	 */
	public void setOnlineDays(final SessionContext ctx, final Product item, final boolean value)
	{
		setOnlineDays( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.onlineDays</code> attribute. 
	 * @param value the onlineDays
	 */
	public void setOnlineDays(final Product item, final boolean value)
	{
		setOnlineDays( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.order</code> attribute.
	 * @return the order
	 */
	public Collection<Order> getOrder(final SessionContext ctx, final Customer item)
	{
		return CUSTOMER2ORDERORDERHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.order</code> attribute.
	 * @return the order
	 */
	public Collection<Order> getOrder(final Customer item)
	{
		return getOrder( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.order</code> attribute. 
	 * @param value the order
	 */
	public void setOrder(final SessionContext ctx, final Customer item, final Collection<Order> value)
	{
		CUSTOMER2ORDERORDERHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.order</code> attribute. 
	 * @param value the order
	 */
	public void setOrder(final Customer item, final Collection<Order> value)
	{
		setOrder( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to order. 
	 * @param value the item to add to order
	 */
	public void addToOrder(final SessionContext ctx, final Customer item, final Order value)
	{
		CUSTOMER2ORDERORDERHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to order. 
	 * @param value the item to add to order
	 */
	public void addToOrder(final Customer item, final Order value)
	{
		addToOrder( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from order. 
	 * @param value the item to remove from order
	 */
	public void removeFromOrder(final SessionContext ctx, final Customer item, final Order value)
	{
		CUSTOMER2ORDERORDERHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from order. 
	 * @param value the item to remove from order
	 */
	public void removeFromOrder(final Customer item, final Order value)
	{
		removeFromOrder( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.prefferedStore</code> attribute.
	 * @return the prefferedStore
	 */
	public abstract PointOfService getPrefferedStore(final SessionContext ctx, final Customer item);
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.prefferedStore</code> attribute.
	 * @return the prefferedStore
	 */
	public PointOfService getPrefferedStore(final Customer item)
	{
		return getPrefferedStore( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.prefferedStore</code> attribute. 
	 * @param value the prefferedStore
	 */
	public abstract void setPrefferedStore(final SessionContext ctx, final Customer item, final PointOfService value);
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.prefferedStore</code> attribute. 
	 * @param value the prefferedStore
	 */
	public void setPrefferedStore(final Customer item, final PointOfService value)
	{
		setPrefferedStore( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.publisher</code> attribute.
	 * @return the publisher
	 */
	public Publisher getPublisher(final SessionContext ctx, final Customer item)
	{
		return (Publisher)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.PUBLISHER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.publisher</code> attribute.
	 * @return the publisher
	 */
	public Publisher getPublisher(final Customer item)
	{
		return getPublisher( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.publisher</code> attribute. 
	 * @param value the publisher
	 */
	public void setPublisher(final SessionContext ctx, final Customer item, final Publisher value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.PUBLISHER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.publisher</code> attribute. 
	 * @param value the publisher
	 */
	public void setPublisher(final Customer item, final Publisher value)
	{
		setPublisher( getSession().getSessionContext(), item, value );
	}
	
}
