package com.pm.factory;

import com.pm.product.AbstractProductOne;
import com.pm.product.AbstractProductTwo;

public interface PlatformFactory {

    AbstractProductOne createProductOne();

    AbstractProductTwo createProductTwo();
}