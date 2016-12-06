package com.gjermundbjaanes.structural.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeEverydayDemo {

    public static void main(String[] args) {
        try {

            // Won't compile, need driver
            // DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());

            String dbUrl = "jdbc:derby:memory:codejava/webdv;create=true";

            Connection connection = DriverManager.getConnection(dbUrl);

            Statement statement = connection.createStatement();

            statement.execute("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");

            System.out.println("Table created");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
