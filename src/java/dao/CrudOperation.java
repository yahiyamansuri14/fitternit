/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author yahiya
 */
public class CrudOperation {
    //adminLogin method
    public int adminLogin(String email,String pwd){
       try{
           String sql="select * from admin where email=? and pwd=?";
           Connection con=MyConnection.mycon();
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setString(1,email);
           ps.setString(2,pwd);
           ResultSet rs=ps.executeQuery();
           if(rs.next())
               return 1;
           else
               return 0;
       }catch(Exception e){e.printStackTrace();} 
       return 0;
       
    }
    //end of admin login method
   
}
