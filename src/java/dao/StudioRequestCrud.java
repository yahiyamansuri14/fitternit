/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.MyConnection;
import entity.StudioRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utility.RequestIdGenerator;

/**
 *
 * @author hp
 */
public class StudioRequestCrud {
     //start of requestToDatabase method
    //String request_id,String o_name,String o_contact,String o_email,String s_name,String s_address,byte[] image
    public int requestToDatabase(StudioRequest studioRequest) throws ClassNotFoundException, SQLException{
        int i = 0;
        RequestIdGenerator rig=new RequestIdGenerator();
        
    try{
        String request_id=rig.requestIdGenerator();
        String sql="insert into studiorequest values(?,?,?,?,?,?,?)";
        Connection con=MyConnection.mycon();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,request_id);
        ps.setString(2,studioRequest.getO_name());
        ps.setString(3,studioRequest.getO_contact());
        ps.setString(4,studioRequest.getEmail());
        ps.setString(5,studioRequest.getS_name());
        ps.setString(6,studioRequest.getAddress());
        ps.setBytes(7,studioRequest.getImage());
        i=ps.executeUpdate();
    }catch(Exception e){e.printStackTrace();}
    return i;
    }
    //Start of showAllRequest mehtod
    public ArrayList<StudioRequest> showAllRequestById(){
        ArrayList<StudioRequest> studioRequests=new ArrayList<StudioRequest>();
        try{            
            String sql="select (request_id) from studiorequest";
            Connection con=MyConnection.mycon();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
               StudioRequest studioRequest=new StudioRequest();
               studioRequest.setRequest_id(rs.getString(1));
               studioRequests.add(studioRequest);
            }
            
        }catch(ClassNotFoundException | SQLException e){e.printStackTrace();}
        return studioRequests;
    }

    /*public String showAllRequestById(){
        StudioRequest studioRequest=null;
        String id;
        try{
            String sql="select (request_id) from studiorequest";
            Connection con=MyConnection.mycon();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                id=studioRequest.setRequest_id(rs.getString("request_id"));
                return id;
            }
        }catch(Exception e){e.printStackTrace();}
        return null;
    }*/
}