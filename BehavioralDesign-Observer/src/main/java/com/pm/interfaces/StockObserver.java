package com.pm.interfaces;

import com.pm.StockExchange;

public interface StockObserver {
    void onPriceUpdate(StockExchange stockExchange);
}
