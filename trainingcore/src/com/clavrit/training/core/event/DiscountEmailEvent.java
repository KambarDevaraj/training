package com.clavrit.training.core.event;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.event.AbstractCommerceUserEvent;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.store.BaseStoreModel;

public class DiscountEmailEvent extends AbstractCommerceUserEvent{
    private AbstractOrderModel cart;

    public AbstractOrderModel getCart() {
        return cart;
    }

    public DiscountEmailEvent(final AbstractOrderModel cart, final BaseStoreModel baseStore, final BaseSiteModel baseSite, final CurrencyModel currency) {
        this.cart = cart;
        setBaseStore(baseStore);
        setSite(baseSite);
        setCurrency(currency);
        setLanguage(cart.getUser().getSessionLanguage());
    }

    public void setCart(CartModel cartModel) {
        this.cart=cartModel;
    }
}
