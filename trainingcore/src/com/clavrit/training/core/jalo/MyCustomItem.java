package com.clavrit.training.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import org.apache.log4j.Logger;

import java.util.Date;

public class MyCustomItem extends GeneratedMyCustomItem
{
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger( MyCustomItem.class.getName() );
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		// business code placed here will be executed before the item is created
		// then create the item
		final Item item = super.createItem( ctx, type, allAttributes );
		// business code placed here will be executed after the item was created
		// and return the item
		return item;
	}

	@Override
	public Date getCreatedDate(SessionContext ctx) {
		return null;
	}

	@Override
	public void setCreatedDate(SessionContext ctx, Date value) {

	}

	@Override
	public String getStatus(SessionContext ctx) {
		return null;
	}

	@Override
	public void setStatus(SessionContext ctx, String value) {

	}
}
