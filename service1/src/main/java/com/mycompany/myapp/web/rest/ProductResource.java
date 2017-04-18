package com.mycompany.myapp.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

/**
 * Resource to return information about the products
 */
@RestController
@RequestMapping("/api")
public class ProductResource {

    private final Logger log = LoggerFactory.getLogger(ProductResource.class);
    private final static List<String> PRODUCTS = new ArrayList<>();

    static {
        PRODUCTS.add("One");
        PRODUCTS.add("Two");
        PRODUCTS.add("Three");
    }

    @GetMapping("/products")
    public List<String> geProducts(Principal principal) {

        log.info("Authenticated user: {}", principal.getName());

        return PRODUCTS;
    }

}