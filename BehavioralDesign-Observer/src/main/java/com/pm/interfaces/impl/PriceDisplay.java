package com.pm.interfaces.impl;

import com.pm.StockExchange;
import com.pm.interfaces.StockObserver;

public class PriceDisplay implements StockObserver {
    @Override
    public void onPriceUpdate(StockExchange stockExchange) {
        String symbol = stockExchange.getLastUpdatedSymbol();
        System.out.println("Display -> "+symbol+ ": $"+ stockExchange.getPrice(symbol));
    }
}
