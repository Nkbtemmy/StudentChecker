///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controller;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import database.*;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author Thunder
// */
//@WebServlet(name = "userController", urlPatterns = {"/userController"})
//public class userController extends HttpServlet {
//    DbConnection con = new DbConnection();
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            String name = request.getParameter("name");
//            String school = request.getParameter("school");
//            String faculity = request.getParameter("faculity");
//            int level = Integer.parseInt(request.getParameter("level"));
//            int reg_number =  Integer.parseInt(request.getParameter("reg_number"));
//            //bytes[] photo =Byte.parseByte(request.getParameter("photo"));
//            con.addData(name, school, faculity,level, reg_number);
//            response.sendRedirect("github.com");
//            JOptionPane.showMessageDialog(null, " Successfull registerd");
//            
//        }
//        catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        
//        }
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//       doGet(request, response);
//    }
//
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }
//
//}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import database.*;
import Models.*;
import java.io.InputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Thunder
 */
@WebServlet(name = "userController", urlPatterns = {"/userController"})
public class userController extends HttpServlet {
    DbConnection con = new DbConnection();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getParameter("photo") + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        try{
            String name = request.getParameter("name");
            String school = request.getParameter("school");
            String faculity = request.getParameter("faculity");
            int level = Integer.parseInt(request.getParameter("level"));
            int reg_number =  Integer.parseInt(request.getParameter("reg_number"));
            
            //bytes[] photo =request.getParameter("photo");
            //InputStream photo = request.getPart("photo").getInputStream();
            String photo = request.getParameter("photo");
            Students student = new Students(name,school,faculity,level,reg_number,photo);
            con.addData(student);
            response.sendRedirect("https//:github.com");
            JOptionPane.showMessageDialog(null, " Successfull registerd");
            
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
