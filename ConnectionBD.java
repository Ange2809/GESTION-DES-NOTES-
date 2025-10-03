/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tableauDeBord;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ConnectionBD {
    static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agesnote" ,"nelson","");
            
           
            
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            System.out.println("" + e);
            JOptionPane.showMessageDialog(null, "connection echoué");
        
        }
   return con;
    }
    
}
