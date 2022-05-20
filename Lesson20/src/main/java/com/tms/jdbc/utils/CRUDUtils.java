package com.tms.jdbc.utils;

import com.tms.jdbc.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private static final String GET_ALL_PRODUCTS_QUERY = "SELECT * FROM product";
    private static final String INSERT_PRODUCTS_QUERY = "INSERT INTO product(product_id, product_name, " +
            "product_description, product_available, product_count, product_price) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_PRODUCTS_QUERY = "UPDATE product SET product_available = ? WHERE product_id = ?";
    private static final String DELETE_PRODUCTS_QUERY = "DELETE FROM product WHERE product_id = ?";


    public static List<Product> createProduct(Product product) {
        List<Product> createdProduct = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCTS_QUERY);
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setString(3, product.getDescription());
            preparedStatement.setInt(4, product.getPrice());
            preparedStatement.setInt(5, product.getCount());
            preparedStatement.setBoolean(6, product.isAvailable());
            preparedStatement.executeUpdate();
            createdProduct = readAllProducts();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return createdProduct;
    }


    public static List<Product> readAllProducts() {
        List<Product> productList = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_PRODUCTS_QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("product_id");
                String name = resultSet.getString("product_name");
                String description = resultSet.getString("product_description");
                int price = resultSet.getInt("product_price");
                int count = resultSet.getInt("product_count");
                boolean available = resultSet.getBoolean("product_available");
                productList.add(new Product(id, name, description, price, count, available));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return productList;
    }

    public static List<Product> updateProducts(int newId, boolean newAvailable) {
        List<Product> updatedProducts = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCTS_QUERY);
            preparedStatement.setInt(2, newId);
            preparedStatement.setBoolean(1, newAvailable);
            preparedStatement.executeUpdate();
            updatedProducts = readAllProducts();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedProducts;
    }

    public static List<Product> deleteProducts(int id) {
        List<Product> deletedProducts = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCTS_QUERY);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            deletedProducts = readAllProducts();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return deletedProducts;
    }


}
