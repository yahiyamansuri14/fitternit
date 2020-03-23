/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CrudOperation;
import dao.StudioRequestCrud;
import entity.StudioRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;
import utility.RequestIdGenerator;

/**
 *
 * @author hp
 */
public class studiorequest extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException,FileUploadException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
            String s1="",s2="",s3="",s4="",s5="";
            byte b[]=null;
            DiskFileItemFactory factory=new DiskFileItemFactory();
            ServletFileUpload upload=new ServletFileUpload(factory);
            List<FileItem> items=upload.parseRequest(new ServletRequestContext(request));
            
        for(FileItem item:items){
            String name=item.getFieldName();
            if(name.equals("o_name")){
                s1=item.getString();
            }else if(name.equals("o_con")){
                s2=item.getString();
            }else if(name.equals("o_email")){
                s3=item.getString();
            }else if(name.equals("s_name")){
                s4=item.getString();
            }else if(name.equals("s_address")){
                s5=item.getString();
            }else if(name.equals("s_image")){
                b=item.get();
            }
        }
        //end of for-each loop
        RequestIdGenerator rg=new RequestIdGenerator();
        String id=rg.requestIdGenerator();
        
        StudioRequestCrud cr=new StudioRequestCrud();
        StudioRequest studioRequest=new StudioRequest();
        studioRequest.setO_name(s1);
        studioRequest.setO_contact(s2);
        studioRequest.setEmail(s3);
        studioRequest.setS_name(s4);
        studioRequest.setAddress(s5);
        studioRequest.setImage(b);
        int j=cr.requestToDatabase(studioRequest);
        if(j!=0){
            response.sendRedirect("requestsuccess.jsp");
        }else
            response.sendRedirect("requestfail.jsp");
        
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
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(studiorequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(studiorequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studiorequest.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(studiorequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(studiorequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studiorequest.class.getName()).log(Level.SEVERE, null, ex);
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
