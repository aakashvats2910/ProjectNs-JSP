package com.aakash.projectns.projectns.sh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Q1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =  DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/nbs","root","A@kash2910");
    }
}
