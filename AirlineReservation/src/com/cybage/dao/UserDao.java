package com.cybage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cybage.model.User;


public class UserDao {

    public int registerUser(User user) throws ClassNotFoundException {
        String INSERT_USER_SQL = "INSERT INTO user" +
            "  (pid, fname, lname, gender, age,contactNo,address, emailid, password) VALUES " +
            " (?, ?, ?, ?, ?, ?, ?, ? , ? )";

        int result = 0;

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/airlinereservationsystem?useSSL=false", "root", "P9637333109k@");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL)) {
            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, user.getFname());
            preparedStatement.setString(3, user.getLname());
            preparedStatement.setString(4, user.getGender());
            preparedStatement.setInt(5, user.getAge());
            preparedStatement.setString(6, user.getContactNo());
            preparedStatement.setString(7, user.getAddress());
            preparedStatement.setString(8, user.getEmailid());
            preparedStatement.setString(9, user.getPassword());
         
            
    

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}