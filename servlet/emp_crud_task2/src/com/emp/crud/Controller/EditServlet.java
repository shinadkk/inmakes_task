package com.emp.crud.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.crud.DAO.EmployeeDAO;
import com.emp.crud.DTO.Employee;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");

        int id = Integer.parseInt(req.getParameter("id"));
        Employee e = EmployeeDAO.getEmployeeById(id);

        out.print("<h1>Update Employee</h1>");
        out.print("<form action='EditServlet2' method='post'>");
        out.print("<input type='hidden' name='id' value='" + e.getId() + "'/>");

        out.print("<pre>");
        out.print("Name:      <input type='text' name='name' value='" + e.getName() + "'/><br>");
        out.print("Password:  <input type='text' name='pwd' value='" + e.getPwd() + "'/><br>");
        out.print("Email:     <input type='text' name='email' value='" + e.getEmail() + "'/><br>");
        out.print("Country:   <input type='text' name='ctry' value='" + e.getCtry() + "'/><br><br><br>");
        out.print("<input type='submit' value='Edit & Save'/>");
        out.print("</pre>");

        out.print("</form>");


        out.close();
    }
}

