package com.clavrit.training.storefront.filters;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.store.BaseStoreModel;
import org.apache.log4j.Logger;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PreferredStore1Filter extends OncePerRequestFilter {
    private static final Logger LOG = Logger.getLogger(PreferredStore1Filter.class);
    private UserService userService;
    private SessionService sessionService; // Assuming a service to fetch the default store

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        if (request.getUserPrincipal() != null) {
            CustomerModel customerModel = (CustomerModel) userService.getCurrentUser();
            BaseStoreModel baseStoreModel = customerModel.getNewStore();

            if (baseStoreModel != null) {
                sessionService.setAttribute("baseStoreModel", baseStoreModel.getName());
                LOG.info("Preferred store set in session to: " + baseStoreModel.getName());
            } else {
                LOG.warn("Preferred Store is not configured for user ." +customerModel.getName());
            }
        }

        // Continue with the filter chain
        filterChain.doFilter(request, response);
    }
}
