package com.company.practice.sortedCollections;

import java.util.*;

public class StockList {
    private final Map<String, StockItem> list;
    private final String name;
    public StockList(String name) {
        this.name = name;
        this.list = new LinkedHashMap<>();
    }
    public String getName() {
        return name;
    }

    public int addStock(StockItem stock){
        if(stock != null){
            // check if we already have quantities
            StockItem inStock = list.getOrDefault(stock.getName(), stock);
            //These methods get the stock if it exists, and if not, it adds stock as the new item
            //if other stocks of these items already exists, adjust the quantity
            if(inStock != stock){
                stock.adjustStock(inStock.AvailableQuantity());
            }
            list.put(stock.getName(), stock);
            return stock.AvailableQuantity();
        }
        return 0;
    }

    public int sellStock(String item, int quantity){
        StockItem inStock = list.get(item);
        if((inStock != null) && (quantity > 0)){
            return inStock.finalizeStock(quantity);
        }
        return 0;
//        StockItem inStock = list.getOrDefault(item, null);
//         if((inStock != null) && (inStock.AvailableQuantity() >= quantity) && (quantity > 0)){
//             inStock.adjustStock(-quantity);
//             return quantity;
//         }
//        return 0;
    }

    public int reserveStock(String item, int quantity){
        StockItem inStock = list.get(item);
        if(inStock != null && quantity > 0){
            inStock.reserveStock(quantity);
        }
        return 0;
    }

    public int unReserveStock(String item, int quantity){
        StockItem inStock = list.get(item);
        if(inStock != null && quantity > 0){
            inStock.unReserveStock(quantity);
            return quantity;
        }
        return 0;
    }
    public StockItem get(String key){
        return list.get(key);
    }
    public Map<String, Double>priceList(){
        Map<String, Double> prices =new LinkedHashMap<>();
        for(Map.Entry<String, StockItem>item: list.entrySet()){
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }
    public Map<String, StockItem> items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString(){
        String s ="\nStock List\n";
        double totalCost = 0.0;
        for(Map.Entry<String, StockItem> item: list.entrySet()){
             StockItem stockItem = item.getValue();
             double itemValue = stockItem.getPrice()*stockItem.AvailableQuantity();
             s=s+stockItem+". There are "+stockItem.AvailableQuantity()+" in stock. Value of stock is ";
             s= s+String.format("%.2f", itemValue )+" \n\n";
             totalCost += itemValue;
        }

        return s+String.format( "total cost value %.2f", totalCost);
    }
}
