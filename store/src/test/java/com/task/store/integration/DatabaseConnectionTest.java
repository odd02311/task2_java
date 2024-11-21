package com.task.store.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
public class DatabaseConnectionTest {

    @Autowired
    private DataSource dataSource;

    @Test
    void testConnection() throws SQLException {
        try(Connection connection = dataSource.getConnection()) {
            assert connection != null;
            System.out.println("Database connection established" + connection.getMetaData().getURL());
        }
    }
}
