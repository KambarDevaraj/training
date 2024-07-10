package com.clavrit.training.core.enums;


import de.hybris.platform.core.model.enumeration.EnumerationValueModel;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.log4j.Logger;

public class MobileEnumUpdate {
    private static final Logger LOG = Logger.getLogger(MobileEnumUpdate.class);
    private ModelService modelService;

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }


    public void addEnumValue() {
        EnumerationValueModel model = modelService.create("Mobiles");
        model.setCode("MOTO");
        model.setName("MOTO Mobile");
        modelService.save(model);
        LOG.info("Added new enum value: MOTO");
        }
}
