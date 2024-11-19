package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conexion {

    Connection con;
    String url="jdbc:mysql://localhost:3306/tiendaropa";
    String pass="";
    String user="root";
    
    public Connection getConection(){
        try{
            Class.forName("com.mysql.jdbc.Driver"); //utilizamos el driver que nos dieron
            con=DriverManager.getConnection(url,user,pass);
           // JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "problema de conexion"+e.toString());
                    
        }
        return con;
    }
    
    public void cerra() throws SQLException{
        if(getConection()!=null){
            if(!getConection().isClosed()){
                getConection().close();
            }
        }
    }
    
}
