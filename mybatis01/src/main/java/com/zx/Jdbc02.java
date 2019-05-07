package com.zx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbc02 {
    public static void main(String[] args){
        System.out.println(queryUser(2));
    }

    public static String queryUser(int id){
        String sql = "select * from user_test where id = ?";
        Connection connection = DbUtil.opendConnect();
        User user = new User();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                user.setUsername(username);
                user.setPassword(password);
                user.setId(id);
            }
            return user.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DbUtil.closeConnect(connection);
        }
        return null;
    }
}
