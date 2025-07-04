package com.onlinebookstore.setup;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSetup {
    public static void createUsersTable(Connection connection) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXIST users (" +
                "id INTEGER AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(100) NOT NULL," +
                "email VARCHAR(100) UNIQUE," +
                "password VARCHAR(100) NOT NULL," +
                "address VARCHAR(255)," +
                "role VARCHAR(20) DEFAULT 'user'" +
                ");";

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        }
    }

    public static void createBooksTable(Connection connection) throws SQLException{
        String sql = """
                CREATE TABLE IF NOT NULL books (
                id INTEGER AUTO_INCREMENT PRIMARY KEY,
                title VARCHAR(200) NOT NULL,
                author VARCHAR(100),
                category VARCHAR(100),
                price DOUBLE NOT NULL,
                stock INTEGER NOT NULL
                );
                """;

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        }
    }

    public static void createOrdersTable(Connection connection) throws SQLException{
        String sql = """
                CREATE TABLE IF NOT NULL orders (
                id INTEGER AUTO_INCREMENT PRIMARY KEY,
                user_id INTEGER,
                book_id INTEGER,
                quantity INTEGER,
                order_date DATETIME,
                status VARCHAR(50),
                FOREIGN KEY (user_id) REFERENCES users(id),
                FOREIGN KEY (book_id) REFERENCES books(id)
                );
                """;
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        }
    }
}
