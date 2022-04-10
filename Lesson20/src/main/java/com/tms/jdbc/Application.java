package com.tms.jdbc;

import com.tms.jdbc.model.Product;
import com.tms.jdbc.utils.CRUDUtils;

public class Application {
    public static void main(String[] args) {
        Product product = new Product(0, "Телефон", "Хороший телефон", 15, 3, true);
        // System.out.println("Добавление продукта в список...");
        // System.out.println(CRUDUtils.createProduct(product));
        System.out.println("Вывод списка продуктов...");
        System.out.println(CRUDUtils.readAllProducts());
        //System.out.println("Обновление данных о наличии продукта...");
        //System.out.println(CRUDUtils.updateProducts(1, false));
        //System.out.println("Удаление продукта...");
        //System.out.println(CRUDUtils.deleteProducts(1));
    }
}
