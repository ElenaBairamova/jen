package org.ibs.db;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connectionDataBase {
    private Connection connection;

    @BeforeEach
    public void connectionDB() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "user", "pass");
        Statement statement = connection.createStatement();
    }

    @AfterEach
    public void afterAllTest() throws SQLException {
        String deleteQuery = "DELETE FROM food WHERE food_id > 4";

        Statement statement = connection.createStatement();
        statement.executeUpdate(deleteQuery);
        connection.close();

    }
}
