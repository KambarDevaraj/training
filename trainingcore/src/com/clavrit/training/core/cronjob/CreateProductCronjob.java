package com.clavrit.training.core.cronjob;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.log4j.Logger;

public class CreateProductCronjob extends AbstractJobPerformable<CronJobModel> {
    private static final Logger LOG = Logger.getLogger(CreateProductCronjob.class);
    private ModelService modelService;
    private CatalogVersionService catalogVersionService;

    public CatalogVersionService getCatalogVersionService() {
        return catalogVersionService;
    }

    public void setCatalogVersionService(CatalogVersionService catalogVersionService) {
        this.catalogVersionService = catalogVersionService;
    }

    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        CatalogVersionModel catalogVersion = catalogVersionService.getCatalogVersion("apparelProductCatalog", "Staged");
        ProductModel productModel = modelService.create(ProductModel.class);
        productModel.setCode("201");
        productModel.setApprovalStatus(ArticleApprovalStatus.APPROVED);
        productModel.setName("New Cronjob Product");
        productModel.setDescription("New Cronjob Product Description");
        productModel.setSummary("New Cronjob Product Summary");
        productModel.setCatalogVersion(catalogVersion);
        modelService.save(productModel);
        LOG.info("New Product Is Added");
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
