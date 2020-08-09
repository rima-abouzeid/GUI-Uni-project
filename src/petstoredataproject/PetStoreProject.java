/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petstoredataproject;

import java.sql.*;

/**
 *
 * @author Rima Az
 */
public class PetStoreProject {

    private Connection con;
    private Statement stmt;

    void connect() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petstore_dataproject", "root", ""); //connection
        stmt = con.createStatement();
    }

    void close() throws SQLException {
        stmt.close();
        con.close();
    }

}
