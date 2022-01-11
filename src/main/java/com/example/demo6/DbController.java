package com.example.demo6;

import java.sql.*;

public class DbController {

    private Connection connection;
    private String dbPath = "src/main/resources/com/example/demo6/";
    private String dbName = "newDb.db";

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void startConnection() {

        try {
            connection = DriverManager.getConnection("jdbc:sqlite:"+dbPath+dbName);
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts(firstName TEXT,lastName TEXT, age INTEGER)");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void addDataToDB(String firstName, String lastName, int age) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO contacts VALUES (?,?,?)");
        preparedStatement.setString(1,firstName);
        preparedStatement.setString(2,lastName);
        preparedStatement.setInt(3,age);

        preparedStatement.execute();
    }

}
