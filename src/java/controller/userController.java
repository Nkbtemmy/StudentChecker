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
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;
import javax.swing.JOptionPane;
import java.util.regex.*;

/**
 *
 * @author Thunder
 */
@WebServlet(name = "userController", urlPatterns = {"/userController"})
@MultipartConfig(
        fileSizeThreshold = 1024*1024*1,
        maxFileSize = 1024*1024*10,
        maxRequestSize=1024*1024*100
)
public class userController extends HttpServlet {
    DbConnection con = new DbConnection();
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {
          
                    String name = request.getParameter("name");
                    String school = request.getParameter("school");
                    String faculity = request.getParameter("faculity");
                    int level = Integer.parseInt(request.getParameter("level"));
                    int reg_number =  Integer.parseInt(request.getParameter("reg_number"));

                    //coopying image
                    Part filePart = request.getPart("photo");
                    String fileName = filePart.getSubmittedFileName();
                    
                    String path = getServletContext().getRealPath("/"+"photos"+File.separator+fileName);
                    for(Part part: request.getParts()){
                        part.write(path);
                    }
                    String photo = path;
                    Students student = new Students(name,school,faculity,level,reg_number,photo,fileName);
                    con.addData(student);
                    JOptionPane.showMessageDialog(null, " Successfull registerd");
                   response.sendRedirect("index.jsp");
            
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Fail to register ");
                    //JOptionPane.showMessageDialog(null, e);
                }
            }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
