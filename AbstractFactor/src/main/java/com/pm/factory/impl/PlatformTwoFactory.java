package com.pm.factory.impl;

import com.pm.factory.PlatformFactory;
import com.pm.product.AbstractProductOne;
import com.pm.product.AbstractProductTwo;
import com.pm.product.impl.ProductOnePlatformTwo;
import com.pm.product.impl.ProductTwoPlatformTwo;

public class PlatformTwoFactory implements PlatformFactory {

    @Override
    public AbstractProductOne createProductOne() {
        return new ProductOnePlatformTwo();
    }

    @Override
    public AbstractProductTwo createProductTwo() {
        return new ProductTwoPlatformTwo();
    }
}