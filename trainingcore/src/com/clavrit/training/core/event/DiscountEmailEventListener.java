package com.clavrit.training.core.event;

import com.clavrit.training.core.model.DiscountEmailProcessModel;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.commerceservices.event.AbstractSiteEventListener;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;

import org.apache.log4j.Logger;
public class DiscountEmailEventListener extends AbstractSiteEventListener<DiscountEmailEvent>{
    private ModelService modelService;
    private BusinessProcessService businessProcessService;
    private static final Logger LOG = Logger.getLogger(DiscountEmailEventListener.class);
    /**
     * @return the modelService
     */
    public ModelService getModelService()
    {
        return modelService;
    }

    /**
     * @param modelService
     *           the modelService to set
     */
    public void setModelService(final ModelService modelService)
    {
        this.modelService = modelService;
    }

    /**
     * @return the businessProcessService
     */
    public BusinessProcessService getBusinessProcessService()
    {
        return businessProcessService;
    }

    /**
     * @param businessProcessService
     *           the businessProcessService to set
     */
    public void setBusinessProcessService(final BusinessProcessService businessProcessService)
    {
        this.businessProcessService = businessProcessService;
    }

    @Override
    protected void onSiteEvent(final DiscountEmailEvent event)
    {

        LOG.info("###Call DiscountEmailEventListner###");
        final DiscountEmailProcessModel discountEmailProcessModel = (DiscountEmailProcessModel) getBusinessProcessService().createProcess(
                "discountEmailProcess-" + event.getCart().getCode() + "-" + System.currentTimeMillis(), "discountEmailProcess");

        discountEmailProcessModel.setCart(event.getCart());
        discountEmailProcessModel.setCurrency(event.getCart().getCurrency());
        discountEmailProcessModel.setLanguage(event.getCart().getStore().getDefaultLanguage());
        discountEmailProcessModel.setStore(event.getCart().getStore());
        discountEmailProcessModel.setSite(event.getCart().getSite());
        discountEmailProcessModel.setLanguage(event.getLanguage());
        getModelService().save(discountEmailProcessModel);
        getBusinessProcessService().startProcess(discountEmailProcessModel);

    }

    @Override
    protected boolean shouldHandleEvent(final DiscountEmailEvent event)
    {
        return SiteChannel.B2C.equals(event.getCart().getSite().getChannel());
    }

}
