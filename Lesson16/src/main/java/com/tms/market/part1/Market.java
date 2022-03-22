package com.tms.market.part1;


import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@AllArgsConstructor
@ToString
public class Market {
    private List<Product> listOfProducts;

    public void addProduct(Product product) {
        if (findProductById(product.getId()) == null) {
            listOfProducts.add(product);
        } else {
            System.out.println("Данный продукт уже есть в списке.");
        }
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void removeProduct(int id) {
        if (findProductById(id) == null) {
            System.out.println("Данного товара нет в списке.");
        }
        listOfProducts.remove(findProductById(id));
    }

    public void editProduct(Product newProduct) {
        for (Product oldProduct : listOfProducts) {
            if (newProduct.getId() == oldProduct.getId()) {
                oldProduct.setName(newProduct.getName());
                oldProduct.setPrice(newProduct.getPrice());
                break;
            } else {
                System.out.println("Данного товара не существует в списке.");
            }
        }
    }

    public Product findProductById(int id) {
        for (Product prod : listOfProducts) {
            if (id == prod.getId()) {
                return prod;
            }
        }
        return null;
    }

    public List<Product> sortByIncreasePrice() {
        listOfProducts.sort(Comparator.comparing(Product::getPrice));
        return listOfProducts;
    }

    public List<Product> sortByReverse() {
        Collections.reverse(listOfProducts);
        return listOfProducts;
    }
}
