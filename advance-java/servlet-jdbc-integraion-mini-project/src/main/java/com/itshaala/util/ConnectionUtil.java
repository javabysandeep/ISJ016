package com.itshaala.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        }
    }

    public static Connection getConnection() {
        File file = new File("C:\\Work\\ISJ016\\advance-java\\servlet-jdbc-integraion-mini-project\\src\\main\\resources\\application.properties");
        FileInputStream fis = null;
        Properties properties = null;
        try {
            fis = new FileInputStream(file);
            properties = new Properties();
            properties.load(fis);
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            if (connection == null) {
                connection = DriverManager.getConnection(url, username, password);
            }
        } catch (IOException e) {
            System.out.println("file issue");
        } catch (SQLException e) {
            System.out.println("connection issue");
        }
        return connection;
    }
}
