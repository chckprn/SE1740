/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author Tung
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

   public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get the user name and password from the request parameters
        String userName = request.getParameter("user");
        String password = request.getParameter("pass");

        // Here you could perform some validation on the user name and password,
        // like checking if they match an existing user account in your database.

        // Set a session attribute to indicate that the user is logged in
        HttpSession session = request.getSession();
        session.setAttribute("loggedIn", true);

        // Redirect the user to the home page or some other protected resource
        response.sendRedirect("/home.jsp");
    }

    
}






