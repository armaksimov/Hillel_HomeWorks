package com.hillel.databases.connections;

import java.sql.*;
import com.hillel.databases.resources.*;

public class ConnectionLib {
    private Connection connection;
    private Statement statement;
    public ConnectionLib() {
         resources res = new resources();
        {
            try {
                Driver driver = new com.mysql.cj.jdbc.Driver();
                DriverManager.registerDriver(driver);

                connection = DriverManager.getConnection(res.getURL(), res.getUSERNAME(), res.getPASSWORD());
                statement = connection.createStatement();
            } catch (SQLException e) {
                System.out.println("Error while uploading driver class!");
            }
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return this.statement;
    }
}
