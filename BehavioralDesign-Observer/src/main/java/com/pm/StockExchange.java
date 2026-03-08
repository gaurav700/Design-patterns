package com.pm;

import com.pm.interfaces.StockObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockExchange {
    Map<String, Double> prices = new HashMap<>();
    List<StockObserver> observers = new ArrayList<>();
    private String lastUpdatedSymbol;

    public void registerObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void notifyObserver(){
        observers.forEach(observer->{
            observer.onPriceUpdate(this);
        });
    }

    public void updatePrice(String symbol, double price) {
        prices.put(symbol,price);
        lastUpdatedSymbol = symbol;
        System.out.println("\nExchange: "+ symbol + " update to $"+price);
        notifyObserver();
    }

    public String getLastUpdatedSymbol() {
        return lastUpdatedSymbol;
    }

    public Double getPrice(String symbol){
        return prices.get(symbol);
    }


}
