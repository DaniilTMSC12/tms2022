package com.tms.jdbc.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {
    private int id;
    private String name;
    private String description;
    private boolean available;
    private int count;
    private int price;

    public Product(int id, String name, String description, int price, int count, boolean available) {

    }
}
