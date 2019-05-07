package com.zx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;
    static {
        driver="com.mysql.jdbc.Driver";
        url="jdbc:mysql://127.0.0.1:3306/zx_test?useSSL=false";
        username="abdev";
        password="654321";
    }

    public static Connection opendConnect(){
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void closeConnect(Connection connection){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
