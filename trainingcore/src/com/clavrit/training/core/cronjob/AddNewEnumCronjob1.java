package com.clavrit.training.core.cronjob;

import com.clavrit.training.core.enums.MobileEnumUpdate;
import com.clavrit.training.core.enums.Mobiles;
import de.hybris.platform.core.model.enumeration.EnumerationValueModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.log4j.Logger;

import javax.annotation.Resource;

public class AddNewEnumCronjob1 extends AbstractJobPerformable<CronJobModel> {
    private static final Logger LOG = Logger.getLogger(AddNewEnumCronjob.class);
    private ModelService modelService;

    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        EnumerationValueModel model = modelService.create("Laptops");
        model.setCode("PROBOOK1");
        model.setName("PROBOOK1 Laptop");
        modelService.save(model);
        LOG.info("Added new enum value: PROBOOK1");
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}

