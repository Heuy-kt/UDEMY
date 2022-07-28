package com.company.practice.sortedCollections;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList("Kara's shop");
    public static void main(String[] args) {
        StockItem stockItem = new StockItem("Bread", 0.86, 100);
        stockList.addStock(stockItem);

        stockItem = new StockItem("yam", 1.56, 30);
        stockList.addStock(stockItem);

        stockItem = new StockItem("cake", 0.56, 10);
        stockList.addStock(stockItem);

        stockItem = new StockItem("coke", 0.05, 200);
        stockList.addStock(stockItem);

        stockItem = new StockItem("bag of Rice", 12.56, 20);
        stockList.addStock(stockItem);

        stockItem = new StockItem("bag of Garri", 6.36, 30);
        stockList.addStock(stockItem);

        stockItem = new StockItem("bag of Semovita", 2.77, 70);
        stockList.addStock(stockItem);

        stockItem = new StockItem("potato", 1.0, 90);
        stockList.addStock(stockItem);

        stockItem = new StockItem("adam's apple", 566.34, 2);
        stockList.addStock(stockItem);

        stockItem = new StockItem("vegetables", 0.06, 5000);
        stockList.addStock(stockItem);

//        System.out.println(stockList);

        Basket basket = new Basket("User customer");
        System.out.println("adding these items");
        sellItem(basket, "yam", 23);
        sellItem(basket, "coke", 21);
        sellItem(basket, "cake", 50);
        sellItem(basket, "potato", 5);
        sellItem(basket, "adam's apple", 2);//a special kind of Apple from the gardens of Eden.
        System.out.println(basket+ "\n");

        System.out.println("Removing some items");
        removeItem(basket, "yam", 3);
        removeItem(basket, "potato", 3);
        removeItem(basket, "cake", 23);
        removeItem(basket, "coke", 3);
        removeItem(basket, "adam's apple", 1);
        System.out.println(basket + "\n");

        //removing all
        System.out.println("removing all items");
        removeItem(basket, "yam", 20);
        removeItem(basket, "potato", 2);
        removeItem(basket, "cake", 27);
        removeItem(basket, "coke", 18);
        removeItem(basket, "adam's apple", 1);
        System.out.println(basket + "\n");

        System.out.println("\n displaying before and after checkout");
        System.out.println("Displaying basket");
        System.out.println(basket + "\n");
        System.out.println("Displaying stock list");
        System.out.println(stockList + "\n");
        System.out.println("checking out all items");
        checkOut(basket);
        System.out.println("Displaying basket");
        System.out.println(basket + "\n");
        System.out.println("Displaying stock list");
        System.out.println(stockList + "\n");

//        stockItem = new StockItem("pen", 1.12);
//        stockList.items().put(stockItem.getName(), stockItem);
// UnsupportedOperationException since .items returns an unmodifiable map

//        stockList.items().get("yam").adjustStock(70);
//        System.out.println(stockList);

//        for(Map.Entry<String, Double> prices: stockList.priceList().entrySet()){
//            System.out.println(prices.getKey()+": costs: "+ prices.getValue());
//        }
    }

    public static int sellItem(Basket basket, String item, int quantity){
//        retrieving item from stock first
        StockItem stockItem = stockList.get(item);
        if (stockItem == null){
            System.out.println("\nWe don't sell "+ item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity)!=0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity){
//        retrieving item from stock first
        StockItem stockItem = stockList.get(item);
        if (stockItem == null){
            System.out.println("We don't have "+ item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity)==quantity) {
            return stockList.unReserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket){
        for(Map.Entry<StockItem, Integer> items : basket.items().entrySet()){
            stockList.sellStock(items.getKey().getName(), items.getValue());
        }
        basket.clearBasket();
    }
}
