package com.aakash.projectns.projectns.database;

import com.aakash.projectns.projectns.entity.ClientDatabaseEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBCClient {

    private static Connection initialize() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/nbs","root","Password");
    }

    public static void saveClientInfo(ClientDatabaseEntity clientDatabaseEntity) throws ClassNotFoundException, SQLException {
        Statement stmt = initialize().createStatement();
        stmt.executeQuery("use nbs");
        stmt.executeUpdate("insert into client_list values(" +
                Integer.parseInt(clientDatabaseEntity.getClientId()) + ","
                + "'" + clientDatabaseEntity.getPosition() + "',"
                + "'" + clientDatabaseEntity.getEmail() + "',"
                + "'" + clientDatabaseEntity.getAddress() + "',"
                + "'" + clientDatabaseEntity.getUsername() + "',"
                + "'" + clientDatabaseEntity.getPassword() + "'"
                + ")");
    }

    public static void updateClientInfo(ClientDatabaseEntity clientDatabaseEntity) throws SQLException, ClassNotFoundException {
        Statement statement = initialize().createStatement();
        statement.executeUpdate("use nbs");
        statement.executeUpdate("update client_list set "
                + "clientId=" + clientDatabaseEntity.getClientId() + ","
                + "position='" + clientDatabaseEntity.getPosition() + "',"
                + "email='" + clientDatabaseEntity.getEmail() + "',"
                + "address='" + clientDatabaseEntity.getAddress() + "',"
                + "username='" + clientDatabaseEntity.getUsername() + "',"
                + "password='" + clientDatabaseEntity.getPassword() + " "
                + "where clientId=" + clientDatabaseEntity.getClientId());
    }

    public static ArrayList<ClientRepository> getAllClientList() {
        ArrayList<ClientRepository> toReturn = new ArrayList<>();
        return null;
    }

}
