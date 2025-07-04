package com.onlinebookstore.setup;

import com.onlinebookstore.util.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class AppInitialiser {
    public static void initialiseDB() throws SQLException {
        DBInit.createDB();
        try (Connection connection = DBUtil.getConnection()) {
            DBSetup.createUsersTable(connection);
            DBSetup.createBooksTable(connection);
            DBSetup.createOrdersTable(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
