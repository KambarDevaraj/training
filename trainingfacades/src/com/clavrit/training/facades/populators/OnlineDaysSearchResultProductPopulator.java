package com.clavrit.training.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultVariantOptionsProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;


public class OnlineDaysSearchResultProductPopulator extends SearchResultVariantOptionsProductPopulator {
    @Override
    public void populate(final SearchResultValueData source, final ProductData target)
    {
        super.populate(source, target);
        //Adding online days to product data
        final Object obj = this.getValue(source, "onlineDays");
        if (obj != null)
        {
            target.setOnlineDays(this.<Integer> getValue(source, "onlineDays").intValue());
        }
        else
        {
            target.setOnlineDays(0);
        }
    }
}
