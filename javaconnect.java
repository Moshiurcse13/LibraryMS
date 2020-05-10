/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tazin
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn;
    
public static Connection connecdb(){
       try{
          Class.forName("org.sqlite.JDBC");
          Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Tazin\\Documents\\NetBeansProjects\\Library_management_system\\LibraryNew.sqlite");
                  return conn;
       }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
         return null;
       }
    }
    
}
