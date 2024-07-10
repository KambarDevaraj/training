package com.clavrit.training.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultVariantOptionsProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class ClavritProductSearchResultProductPopulator extends SearchResultVariantOptionsProductPopulator{
    @Override
    public void populate(final SearchResultValueData source, final ProductData target) throws ConversionException
    {
/*        super.populate(source, target);
        target.setNewProduct(this.<Boolean> getValue(source, "isNew"));;*/
    }
}
