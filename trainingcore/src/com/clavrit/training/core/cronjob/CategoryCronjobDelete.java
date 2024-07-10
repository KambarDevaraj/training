package com.clavrit.training.core.cronjob;

import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.log4j.Logger;


public class CategoryCronjobDelete extends AbstractJobPerformable<CronJobModel> {
    private static final Logger LOG = Logger.getLogger(CategoryCronjobDelete.class);
    private ModelService modelService;
    private FlexibleSearchService flexibleSearchService;

    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    @Override
    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        String query = "SELECT {pk} FROM {Category} WHERE {code} LIKE '%CronjobCategory%'";
        FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query);
        SearchResult<CategoryModel> result = getFlexibleSearchService().search(searchQuery);
        for (CategoryModel category : result.getResult()) {
            LOG.info("Category Code: " + category.getCode());
            modelService.remove(category);
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}

