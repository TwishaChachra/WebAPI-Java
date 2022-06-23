package com.example.midterm200474646;

import java.sql.*;
import java.util.ArrayList;

public class DBUtility {
    private static String user = DBCredentials.user;
    private static String password = DBCredentials.password;
    private static String connectURL = "jdbc:mysql://172.31.22.43:3306/Twisha200474646";

    public static ArrayList<Student> geStudentFromDB(){
        ArrayList<Student> students = new ArrayList<>();

        String sql = "SELECT*FROM students";

        try(
                Connection conn = DriverManager.getConnection(connectURL,user,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next())
            {
                int studentNum = resultSet.getInt("StudentNum");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                String gender = resultSet.getString("Gender");
                String province = resultSet.getString("Province");
                String majorCode = resultSet.getString("MajorCode");
                int telephone = resultSet.getInt("Telephone");
                int avgGrade  = resultSet.getInt("AvgGrade");


                students.add(new Student(studentNum, firstName, lastName, gender,telephone, province,avgGrade,majorCode));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }
}
