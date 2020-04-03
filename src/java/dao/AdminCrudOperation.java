/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.MyConnection;
import entity.Owner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utility.IdGenerator;

/**
 *
 * @author yahiya
 */
public class AdminCrudOperation {
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
   public int addOwner(Owner owner) throws ClassNotFoundException, SQLException{
       IdGenerator id=new IdGenerator();
       int i=0;
       String ids=id.ownerIdGenerator();
       String sql="insert into ownerdetails values(?,?,?,?,?,?)";
       try{
           Connection con=MyConnection.mycon();
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setString(1, owner.getOwner_id());
           ps.setString(2,owner.getO_name());
           ps.setString(3,owner.getO_email());
           ps.setString(4,owner.getO_address());
           ps.setString(5,owner.getO_contact());
           ps.setBytes(6,owner.getImage());
           i=ps.executeUpdate();
       }catch(Exception e){e.printStackTrace();}
       return i;
   }
}
