package com.clavrit.training.core.handler;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ProductValidityAttributeHandler implements DynamicAttributeHandler<Integer, ProductModel> {

    @Override
    public Integer get(final ProductModel product) {
        Date creationTime = product.getCreationtime();
        if (creationTime != null) {
            LocalDate creationDate = creationTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate currentDate = LocalDate.now();
            return currentDate.getYear() - creationDate.getYear();
        }
        return null;
    }

    @Override
    public void set(final ProductModel product, final Integer validityPeriod) {
        throw new UnsupportedOperationException("validityPeriod is a dynamic attribute and cannot be set directly.");
    }
}