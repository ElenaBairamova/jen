package org.ibs.db;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestBD extends connectionDataBase {
    @Test
    void addExoticFruit() throws SQLException {
        int id = 5;
        String name = "Папайя";
        String type = "FRUIT";
        int exotic = 1;
        String insert =
                "INSERT INTO food(food_id, food_name, food_type, food_exotic) VALUES(?, ?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(insert);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, type);
        pstmt.setInt(4, exotic);
        pstmt.executeUpdate();
        PreparedStatement pt = connection.prepareStatement(
                "SELECT food_id, food_name, food_type, food_exotic FROM food WHERE food_id = 5");
        ResultSet resultSet = pt.executeQuery();
        resultSet.next();
        int food_id = resultSet.getInt("food_id");
        String food_name = resultSet.getString("food_name");
        String food_type = resultSet.getString("food_type");
        int food_exotic = resultSet.getInt("food_exotic");

        Assertions.assertEquals(id, food_id);
        Assertions.assertEquals(name, food_name);
        Assertions.assertEquals(type, food_type);
        Assertions.assertEquals(exotic, food_exotic);
    }

    @Test
    void addNotExoticFruit() throws SQLException {
        int id = 5;
        String name = "Дыня";
        String type = "FRUIT";
        int exotic = 0;
        String insert =
                "INSERT INTO food(food_id, food_name, food_type, food_exotic) VALUES(?, ?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(insert);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, type);
        pstmt.setInt(4, exotic);
        pstmt.executeUpdate();
        PreparedStatement pt = connection.prepareStatement(
                "SELECT food_id, food_name, food_type, food_exotic FROM food WHERE food_id = 5");
        ResultSet resultSet = pt.executeQuery();
        resultSet.next();
        int food_id = resultSet.getInt("food_id");
        String food_name = resultSet.getString("food_name");
        String food_type = resultSet.getString("food_type");
        int food_exotic = resultSet.getInt("food_exotic");

        Assertions.assertEquals(id, food_id);
        Assertions.assertEquals(name, food_name);
        Assertions.assertEquals(type, food_type);
        Assertions.assertEquals(exotic, food_exotic);
    }

    @Test
    void addExoticVegetable() throws SQLException {
        int id = 5;
        String name = "Кивано";
        String type = "VEGETABLE";
        int exotic = 1;
        String insert =
                "INSERT INTO food(food_id, food_name, food_type, food_exotic) VALUES(?, ?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(insert);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, type);
        pstmt.setInt(4, exotic);
        pstmt.executeUpdate();
        PreparedStatement pt = connection.prepareStatement(
                "SELECT food_id, food_name, food_type, food_exotic FROM food WHERE food_id = 5");
        ResultSet resultSet = pt.executeQuery();
        resultSet.next();
        int food_id = resultSet.getInt("food_id");
        String food_name = resultSet.getString("food_name");
        String food_type = resultSet.getString("food_type");
        int food_exotic = resultSet.getInt("food_exotic");

        Assertions.assertEquals(id, food_id);
        Assertions.assertEquals(name, food_name);
        Assertions.assertEquals(type, food_type);
        Assertions.assertEquals(exotic, food_exotic);
    }

    @Test
    void addNotExoticVegetable() throws SQLException {
        int id = 5;
        String name = "Огурец";
        String type = "VEGETABLE";
        int exotic = 0;
        String insert =
                "INSERT INTO food(food_id, food_name, food_type, food_exotic) VALUES(?, ?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(insert);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, type);
        pstmt.setInt(4, exotic);
        pstmt.executeUpdate();
        PreparedStatement pt = connection.prepareStatement(
                "SELECT food_id, food_name, food_type, food_exotic FROM food WHERE food_id = 5");
        ResultSet resultSet = pt.executeQuery();
        resultSet.next();
        int food_id = resultSet.getInt("food_id");
        String food_name = resultSet.getString("food_name");
        String food_type = resultSet.getString("food_type");
        int food_exotic = resultSet.getInt("food_exotic");

        Assertions.assertEquals(id, food_id);
        Assertions.assertEquals(name, food_name);
        Assertions.assertEquals(type, food_type);
        Assertions.assertEquals(exotic, food_exotic);
    }

}
