package com.example.instamart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private static Cart instance;
    private Map<String, Integer> items;

    private Cart() {
        items = new HashMap<>();
    }

    public static Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }

    public void addItem(String item) {
        items.put(item, items.getOrDefault(item, 0) + 1);
    }

    public Map<String, Integer> getItems() {
        return items;
    }

    public void clearCart() {
        items.clear();
    }

    public int getTotalQuantity() {
        int total = 0;
        for (int quantity : items.values()) {
            total += quantity;
        }
        return total;
    }
}