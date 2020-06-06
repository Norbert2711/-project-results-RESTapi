package com.project.results.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {

    private Connection connection;
    private static DbManager dbManager;

    private DbManager() throws SQLException {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "Koles2468");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/project_results?serverTimezone=Europe/Warsaw&useSSL=False&allowPublicKeyRetrieval=true",
                connectionProps);
    }

    public static DbManager getInstance() throws SQLException {
        if (dbManager == null) {
            dbManager = new DbManager();
        }
        return dbManager;
    }

    public Connection getConnection() {
        return connection;

    }
}


