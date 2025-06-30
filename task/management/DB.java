package task.management;

import java.sql.*;

public class DB {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/task_management?useSSL=false&serverTimezone=UTC"; // your DB name
        String user = "root";   // your MySQL username
        String pass = ""; // your MySQL password
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    }
}

