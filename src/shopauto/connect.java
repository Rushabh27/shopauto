/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopauto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RUSHABH
 */
public class connect {
    
    Connection con;
    public Connection docon()
    {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopauto","root","root");

        } catch (Exception ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
        return con;
    }
    
    
}
