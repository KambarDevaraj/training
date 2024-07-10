/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.clavrit.training.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.clavrit.training.core.constants.TrainingCoreConstants;
import com.clavrit.training.core.setup.CoreSystemSetup;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.store.BaseStore;
import de.hybris.platform.storelocator.jalo.PointOfService;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class TrainingCoreManager extends GeneratedTrainingCoreManager
{
	public static final TrainingCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TrainingCoreManager) em.getExtension(TrainingCoreConstants.EXTENSIONNAME);
	}

	@Override
	public BaseStore getNewStore(SessionContext ctx, Customer item) {
		return null;
	}

	@Override
	public void setNewStore(SessionContext ctx, Customer item, BaseStore value) {

	}

	@Override
	public PointOfService getPrefferedStore(SessionContext ctx, Customer item) {
		return null;
	}

	@Override
	public void setPrefferedStore(SessionContext ctx, Customer item, PointOfService value) {

	}
}
