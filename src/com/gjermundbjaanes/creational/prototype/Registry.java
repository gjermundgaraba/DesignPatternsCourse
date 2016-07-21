package com.gjermundbjaanes.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadPrototypes();
    }

    public Item createItem (String type) {
        Item item = null;

        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadPrototypes() {
        Movie movie = new Movie();
        movie.setTitle("Basic movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Basic book");
        items.put("Book", book);
    }
}
