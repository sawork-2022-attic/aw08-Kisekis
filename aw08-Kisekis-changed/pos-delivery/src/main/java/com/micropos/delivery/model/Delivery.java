package com.micropos.delivery.model;

import com.micropos.carts.model.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Delivery {
    private List<Item> items = new ArrayList<>();
    private String id;
    private Status status;

    public String getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public Delivery(List<Item> items,String id,Status status) {
        this.items = items;
        this.id = id;
        this.status = status;
    }

    public Delivery(){};

    public Collection<Item> getItems() {
        return items;
    }

}
