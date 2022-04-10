package com.tms.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
    private static final String dbUrl = "jdbc:mysql://localhost:3306/lesson20";
    private static final String dbUsername = "root";
    private static final String dbPassword = "1luDaniel";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

}

