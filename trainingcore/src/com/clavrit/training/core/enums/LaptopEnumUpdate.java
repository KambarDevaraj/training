package com.clavrit.training.core.enums;

import de.hybris.platform.core.model.enumeration.EnumerationValueModel;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.log4j.Logger;

public class LaptopEnumUpdate {
    private static final Logger LOG = Logger.getLogger(LaptopEnumUpdate.class);
    private ModelService modelService;

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }


    public void addEnumValue1() {
        EnumerationValueModel model = modelService.create("Laptops");
        model.setCode("PROBOOK");
        model.setName("PROBOOK Laptop");
        modelService.save(model);
        LOG.info("Added new enum value: PROBOOK");
    }
}
