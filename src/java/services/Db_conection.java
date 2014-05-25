/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Berilo
 */
public class Db_conection {

    public static PreparedStatement ex_statement(String db_name, String statement) throws Exception {
        PreparedStatement pstmt;
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/" + db_name, "root", "");
        pstmt = c.prepareStatement(statement);
        return pstmt;
    }
}
