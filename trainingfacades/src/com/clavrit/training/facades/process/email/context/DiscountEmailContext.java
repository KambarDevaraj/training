package com.clavrit.training.facades.process.email.context;

import com.clavrit.training.core.model.DiscountEmailProcessModel;
import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.CustomerModel;

import org.apache.log4j.Logger;

public class DiscountEmailContext extends AbstractEmailContext<DiscountEmailProcessModel>{
    private static final Logger LOG = Logger.getLogger(DiscountEmailContext.class);

    @Override
    public void init(final DiscountEmailProcessModel discountEmailProcessModel, final EmailPageModel emailPageModel)
    {
        LOG.info("##CustomEmailContextDiscountEmailContext##");
        super.init(discountEmailProcessModel, emailPageModel);
        put(EMAIL, getCustomerEmailResolutionService().getEmailForCustomer(getCustomer(discountEmailProcessModel)));
        put(DISPLAY_NAME, getCustomer(discountEmailProcessModel).getDisplayName());
    }

    @Override
    protected BaseSiteModel getSite(final DiscountEmailProcessModel discountEmailProcessModel)
    {
        // XXX Auto-generated method stub
        return discountEmailProcessModel.getCart().getSite();
    }

    @Override
    protected CustomerModel getCustomer(final DiscountEmailProcessModel discountEmailProcessModel)
    {
        // XXX Auto-generated method stub
        return (CustomerModel) discountEmailProcessModel.getCart().getUser();
    }

    @Override
    protected LanguageModel getEmailLanguage(final DiscountEmailProcessModel discountEmailProcessModel)
    {
        // XXX Auto-generated method stub
        return discountEmailProcessModel.getCart().getUser().getSessionLanguage();
    }

}
