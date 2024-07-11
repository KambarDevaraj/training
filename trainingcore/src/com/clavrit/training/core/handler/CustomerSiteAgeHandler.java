package com.clavrit.training.core.handler;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;

import java.util.Calendar;
import java.util.Date;

public class CustomerSiteAgeHandler extends
        AbstractDynamicAttributeHandler<Integer, CustomerModel>
{
    @Override
    public Integer get(final CustomerModel model)
    {
        int customerSiteAge = 0;
        try
        {
            final Date customerRegisteredDate = model.getCreationtime();
            final Calendar cal = Calendar.getInstance();
            cal.setTime(customerRegisteredDate);
            final int registeredYear = cal.get(Calendar.YEAR);
            final int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            customerSiteAge = currentYear - registeredYear;
        }
        catch (final Exception e)
        {
            e.printStackTrace();
        }
        return customerSiteAge;
    }
}
