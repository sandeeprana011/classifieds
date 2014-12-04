/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.classifieds.org;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rana
 */
public class DBHelp {
    
    private Connection con;
    private Statement st;
    private ResultSet rst;
    String tblName;
    private int bid;
    private int transport;
    
    public DBHelp(){
        //com.mysql.jdbc.Driver
        //jdbc:mysql://localhost:3306/classifieds
        //password="root"
        //username="root"
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classifieds","root","");
            st=con.createStatement();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBHelp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * @return the st
     */
    public Statement getSt() {
        return st;
    }

    /**
     * @param st the st to set
     */
    public void setSt(Statement st) {
        this.st = st;
    }

    /**
     * @return the rst
     */
    public ResultSet getRst(String tableName) {
        try {
            //        tblName=tableName;
            rst=st.executeQuery("select * from "+tblName+"");
            
        } catch (SQLException ex) {
            Logger.getLogger(DBHelp.class.getName()).log(Level.SEVERE, null, ex);
        }
    return rst;}

    /**
     * @param rst the rst to set
     */
    public void setRst(ResultSet rst) {
        this.rst = rst;
    }

    /**
     * @return the bid
     */
    public int getBid() {
        return bid;
    }

    /**
     * @param bid the bid to set
     */
    public void setBid(int bid) {
        this.bid = bid;
    }

    /**
     * @return the transport
     */
    public int getTransport() {
        return transport;
    }

    /**
     * @param transport the transport to set
     */
    public void setTransport(int transport) {
        this.transport = transport;
    }
    
    
}
