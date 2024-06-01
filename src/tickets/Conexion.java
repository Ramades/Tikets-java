/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tickets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author ram
 */
public class Conexion {
    String strConexion= "jdbc:sqlite:C:\\Users\\tacom\\OneDrive\\Documentos\\base\\Bsd.s3db";
    Connection conn=null;
    
    public Conexion(){
        try{
            Class.forName("org.sqlite.JDBC");
            conn= (Connection) DriverManager.getConnection(strConexion);
            
        }catch(Exception e){
             System.out.println("Efectivamente hay un error");
              System.out.println("Error de conexion "+ e);
              
        }
    }
    
    public int EjecutarSql(String e){
        try{
            PreparedStatement psmt = conn.prepareStatement(e);
            psmt.execute();
            return 1;
        }catch(SQLException s){
            System.out.println(s);
            return 0;
        }
        
        
    }
    
    
    
    
    public ResultSet Consultar(String e){
        try {
         PreparedStatement psmt = conn.prepareStatement(e);
         ResultSet respuesta= psmt.executeQuery();
         return respuesta;
        } catch (Exception s) {
            System.out.println(s); 
            return null;
        }
     
        
    }
    
    
}