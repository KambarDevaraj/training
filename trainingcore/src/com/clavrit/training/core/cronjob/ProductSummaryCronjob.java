package com.clavrit.training.core.cronjob;

import de.hybris.platform.core.model.product.ProductModel;
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

public class ProductSummaryCronjob extends AbstractJobPerformable<CronJobModel> {
    private static final Logger LOG = Logger.getLogger(ProductSummaryCronjob.class);
    private ModelService modelService;

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

    private FlexibleSearchService flexibleSearchService;
    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        String query = "SELECT {pk} FROM {Product} WHERE {summary} LIKE '%Cronjob Product%'";
        FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query);
        SearchResult<ProductModel> result = getFlexibleSearchService().search(searchQuery);

        for (ProductModel product : result.getResult()) {
            LOG.info("Product ID: " + product.getCode());
            modelService.remove(product);
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
