package com.pm.interfaces.impl;

import com.pm.StockExchange;
import com.pm.interfaces.StockObserver;

import java.util.HashMap;
import java.util.Map;

public class AlertService implements StockObserver {
    private final Map<String, Double> thresholds =  new HashMap<>();

    public void setAlert(String symbol, double threshold) {
        thresholds.put(symbol, threshold);
    }

    @Override
    public void onPriceUpdate(StockExchange stockExchange) {
        String symbol = stockExchange.getLastUpdatedSymbol();
        if(thresholds.containsKey(symbol)) {
            double threshold = thresholds.get(symbol);
            double currentPrice = stockExchange.getPrice(symbol);
            if(currentPrice >= threshold) {
                System.out.println("ALERT -> " + symbol + " hit $" + currentPrice +
                        " (threshold: $" + threshold + ")");
            }
        }
    }
}
