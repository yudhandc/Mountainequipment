/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
// <editor-fold defaultstate="collapsed" desc="Import Code">
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// </editor-fold>
/**
 *
 * @author adi_irsyadi
 */
public class Rental_Connection {
    private Connection Connector;
    
    
    public Rental_Connection() {
    }

    public Connection getConnector() {
        return Connector;
    }

    public void setConnector(Connection Connector) {
        this.Connector = Connector;
    }
    
     public void Connection() {
         String Url = null;
         
         try {
              Class.forName("com.mysql.jdbc.Driver");
            try {
                Url = "jdbc:mysql://localhost:3306/rental_datasource";
                Connector = DriverManager.getConnection(Url, "root", "");
            } catch (SQLException Ex) {
                System.out.println("[ERROR] - Rental_Connection.Connection() " + Ex.getMessage().toString());
            }
             
         } catch (ClassNotFoundException Ex) {
             System.out.println("[ERROR] - Rental_Connection.Connection() " + Ex.getMessage().toString());
         }
         
     }
    
    
}
