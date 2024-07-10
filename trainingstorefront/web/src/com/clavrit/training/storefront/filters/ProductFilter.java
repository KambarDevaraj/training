package com.clavrit.training.storefront.filters;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.log4j.Logger;

public class ProductFilter extends OncePerRequestFilter {

    private static final Logger LOG = Logger.getLogger(ProductFilter.class);

    private ProductService productService;

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        // Your filtering logic here
        String productCode = request.getParameter("productCode");
        if (productCode != null && !productCode.isEmpty()) {
            try {
                ProductModel product = productService.getProductForCode(productCode);
                // Add any specific product-related logic here
                LOG.info("Product found: " + product.getName());
            } catch (Exception e) {
                LOG.error("Product not found for code: " + productCode, e);
            }
        }
        // Continue with the filter chain
        filterChain.doFilter(request, response);
    }
}
