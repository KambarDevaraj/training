package com.clavrit.training.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;


/**
 * @author Sanju Gill
 *
 */
public class ClavritProductNewValueProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider, Serializable
{
    private static final Logger LOG = Logger.getLogger(ClavritProductNewValueProvider.class);

    private FieldNameProvider fieldNameProvider;
    @Override
    public Collection<FieldValue> getFieldValues(final IndexConfig indexConfig, final IndexedProperty indexProperty,
                                                 final Object model) throws FieldValueProviderException
    {
        final List<FieldValue> fieldValues = new ArrayList<FieldValue>();
        try
        {
            if (model instanceof ProductModel)
            {
                final ProductModel product = (ProductModel) model;
                final boolean brandNew = product.isNewProduct();
                addFieldValues(fieldValues, indexProperty, null, brandNew);
            }
        }
        catch (final Exception e)
        {
            addFieldValues(fieldValues, indexProperty, null, false);
            throw new FieldValueProviderException("No Product found for indexing");

        }
        return fieldValues;
    }

    protected void addFieldValues(final List<FieldValue> fieldValues, final IndexedProperty indexedProperty,
                                  final LanguageModel language, final Object value)
    {
        final Collection<String> fieldNames = getFieldNameProvider().getFieldNames(indexedProperty,
                language == null ? null : language.getIsocode());
        for (final String fieldName : fieldNames)
        {
            fieldValues.add(new FieldValue(fieldName, value));
        }
    }

    public FieldNameProvider getFieldNameProvider()
    {
        return fieldNameProvider;
    }

    public void setFieldNameProvider(final FieldNameProvider fieldNameProvider)
    {
        this.fieldNameProvider = fieldNameProvider;
    }
}
