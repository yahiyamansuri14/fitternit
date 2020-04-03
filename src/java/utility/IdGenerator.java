/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author yahiya
 */
public class IdGenerator {
    public String requestIdGenerator() throws ClassNotFoundException, SQLException{
        String prefix="req";
    Connection con=MyConnection.mycon();
    String copyGeneratedId = null;
    String query="select COUNT(request_id) as ID from studiorequest";
    try{
        Statement statement=con.createStatement();
        ResultSet rs=statement.executeQuery(query);
        if(rs.next()){
            int id=rs.getInt(1)+101;
            String generatedId=prefix+new Integer(id).toString();
            copyGeneratedId=generatedId;
            return generatedId;
        }else{
            String generatedId=prefix+101;
            return generatedId;
        }
    }catch(Exception e){e.printStackTrace();}
        System.out.println("Id is:-"+copyGeneratedId);
    return null;
}
    //owner id generator
    public String ownerIdGenerator()throws ClassNotFoundException,SQLException{
        String prefix="own";
        Connection con=MyConnection.mycon();
        String copyGeneratedId=null;
        String query="select COUNT(owner_id) as ID from ownerdetails";
        try{
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            if(rs.next()){
                int id=rs.getInt(1)+101;
                String generatedId=prefix+new Integer(id).toString();
                copyGeneratedId=generatedId;
                return generatedId;
        }else{
            String generatedId=prefix+101;
            return generatedId;
        }
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
}