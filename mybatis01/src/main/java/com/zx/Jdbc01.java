package com.zx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc01 {

    public static void main(String[] args){
        insert("ximen", "222222");
    }

    public static void insert(String username, String password){
        String sql = "insert into user_test(username, password) value (?,?)";
        Connection connection = DbUtil.opendConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DbUtil.closeConnect(connection);
        }
    }

}
