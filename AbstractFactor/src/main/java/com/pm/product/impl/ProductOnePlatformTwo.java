package com.pm.product.impl;

import com.pm.product.AbstractProductOne;

public class ProductOnePlatformTwo implements AbstractProductOne {

    @Override
    public void printDescription() {
        System.out.println("Product One running on Platform Two");
    }
}