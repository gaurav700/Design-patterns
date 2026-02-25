package com.pm.factory.impl;

import com.pm.factory.PlatformFactory;
import com.pm.product.AbstractProductOne;
import com.pm.product.AbstractProductTwo;
import com.pm.product.impl.ProductOnePlatformOne;
import com.pm.product.impl.ProductTwoPlatformOne;

public class PlatformOneFactory implements PlatformFactory {

    @Override
    public AbstractProductOne createProductOne() {
        return new ProductOnePlatformOne();
    }

    @Override
    public AbstractProductTwo createProductTwo() {
        return new ProductTwoPlatformOne();
    }
}