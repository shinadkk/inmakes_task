package com.jdbc.demo.Task_jdbc;

import java.sql.*;

public class StudentCRUD 
{
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    private static final String USER = "root"; 
    private static final String PASSWORD = "admin";
    private static Connection connection;

    static 
    {
        try 
        {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }

    public static void insertStudent(int studentId, String studentName, String studentPlace, String course, String contactNum) 
    {
        String query = "INSERT INTO student (student_id, student_name, student_place, course, contact_num) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) 
        {
            pstmt.setInt(1, studentId);
            pstmt.setString(2, studentName);
            pstmt.setString(3, studentPlace);
            pstmt.setString(4, course);
            pstmt.setString(5, contactNum);
            pstmt.executeUpdate();
            System.out.println("Student inserted successfully.");
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }

    public static void getAllStudents() 
    {
        String query = "SELECT * FROM student";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) 
        {
            while (rs.next()) 
            {
                System.out.println("ID: " + rs.getInt("student_id"));
                System.out.println("Name: " + rs.getString("student_name"));
                System.out.println("Place: " + rs.getString("student_place"));
                System.out.println("Course: " + rs.getString("course"));
                System.out.println("Contact: " + rs.getString("contact_num"));
                System.out.println();
            }
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }


    public static void updateStudent(int studentId, String newPlace, String newCourse) 
    {
        String query = "UPDATE student SET student_place = ?, course = ? WHERE student_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) 
        {
            pstmt.setString(1, newPlace);
            pstmt.setString(2, newCourse);
            pstmt.setInt(3, studentId);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) 
            {
                System.out.println("Student details updated successfully.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }


    public static void deleteStudent(int studentId) 
    {
        String query = "DELETE FROM student WHERE student_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) 
        {
            pstmt.setInt(1, studentId);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) 
            {
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) 
    {

        insertStudent(1, "Doe", "Washington DC", "Computer Science", "8949840409");
        insertStudent(2, "Jane", "Florida", "Chemistry", "5646054964");
        System.out.println("All students:");
        getAllStudents();
        updateStudent(1, "San Francisco", "Data Science");
        System.out.println("All students after update:");
        getAllStudents();
        deleteStudent(2);
        System.out.println("All students after deletion:");
        getAllStudents();
    }
}
