/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author edsonpaulo
 */
@WebServlet( name = "Login", urlPatterns = { "/login"} )

public class LoginServlet extends HttpServlet
{

    protected void processRequest( HttpServletRequest request,
                                   HttpServletResponse response )
            throws ServletException, IOException
    {
        response.sendRedirect( "login.jsp" );
    }

    @Override
    protected void doGet( HttpServletRequest request,
                          HttpServletResponse response )
            throws ServletException, IOException
    {
        processRequest( request, response );
    }

    @Override
    protected void doPost( HttpServletRequest request,
                           HttpServletResponse response )
            throws ServletException, IOException
    {
        processRequest( request, response );
    }

    @Override
    public String getServletInfo()
    {
        return "Short description";
    }

}
