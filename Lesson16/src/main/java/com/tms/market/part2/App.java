package com.tms.market.part2;

import com.tms.market.part1.Product;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class App {
    private final List<Product> listOfProducts;
    private final Scanner scanner = new Scanner(System.in);


    public App(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public void start() {
        System.out.printf(" 1. Вывод списка товаров.%n" + " 2. Добавление товара.%n" +
                " 3. Удаление товара.%n" + " 4. Редактирование товара.%n" + " 5. Выход.%n"
                + "Выберите действие (1-5): ");
        switch (scanner.nextInt()) {
            case 1 -> getListOfProducts();
            case 2 -> addProduct();
            case 3 -> removeProduct();
            case 4 -> editProduct();
            case 5 -> {
                System.out.println("Закрытие программы...");
                scanner.close();
            }
        }
    }

    private void editProduct() {
        System.out.print("Редактирование товара. Введите id товара: ");
        int id = scanner.nextInt();
        for (Product oldProduct : listOfProducts) {
            if (id == oldProduct.getId()) {
                System.out.println("Ваш товар - " + oldProduct.getName());
                System.out.print("Введите новое название товара: ");
                String newName = scanner.next();
                System.out.print("Введите новую цену товара: ");
                int newPrice = scanner.nextInt();
                oldProduct.setName(newName);
                oldProduct.setPrice(newPrice);
                System.out.println("Товар успешно заменен на " + newName + " цена: " + newPrice);
                start();
            } else {
                System.out.println("Данного товара нет в списке.");
                start();
            }
        }

    }

    private void removeProduct() {
        System.out.print("Удаление товара. Введите id товара: ");
        int id = scanner.nextInt();
        if (findProductById(id) == null) {
            System.out.println("Данного товара нет в списке.");
            start();
        } else {
            listOfProducts.remove(findProductById(id));
            System.out.println("Товар успешно удалён.");
            start();
        }
    }

    private void addProduct() {
        System.out.print("Добавление товара. Введите id товара: ");
        int id = scanner.nextInt();
        if (findProductById(id) == null) {
            System.out.print("Введите название товара: ");
            String name = scanner.next();
            System.out.print("Введите цену товара: ");
            int price = scanner.nextInt();
            listOfProducts.add(new Product(id, name, price));
            System.out.println("Товар успешно добавлен");
            start();
        } else {
            System.out.println("Данный продукт уже есть в списке.");
            start();
        }
    }

    private void getListOfProducts() {
        System.out.printf("1. По возрастанию цены.%n" + "2. По убыванию цены.%n"
                + "3. По дате добавления (сначало новые)%n" + "4. Вернуться в меню.%n"
                + "Выберите сортировку товаров(1-3): ");
        switch (scanner.nextInt()) {
            case 1 -> System.out.println(sortByIncreasePrice());
            case 2 -> System.out.println(sortByDecreasePrice());
            case 3 -> System.out.println(sortByReverse());
            case 4 -> start();
        }
    }

    public List<Product> sortByReverse() {
        Collections.reverse(listOfProducts);
        return listOfProducts;
    }

    public List<Product> sortByDecreasePrice() {
        listOfProducts.sort(Collections.reverseOrder(Comparator.comparing(Product::getPrice)));
        return listOfProducts;
    }

    public List<Product> sortByIncreasePrice() {
        listOfProducts.sort(Comparator.comparing(Product::getPrice));
        return listOfProducts;
    }

    public Product findProductById(int id) {
        for (Product prod : listOfProducts) {
            if (id == prod.getId()) {
                return prod;
            }
        }
        return null;
    }

}
