package com.onlinebookstore.setup;

import com.onlinebookstore.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInit {
    private static final String URL = "jdbc:mysql://localhost:3306/?useSSL=false&serverTimezone=UTC";
    private static final String USER = System.getenv("DB_USER");
    private static final String PASSWORD = System.getenv("DB_PASSWORD");


    public static void createDB() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            Statement stmt = connection.createStatement();

            String sql = """
            CREATE DATABASE IF NOT EXISTS onlinebookstore;
            """;
            stmt.executeUpdate(sql);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
