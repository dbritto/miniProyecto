
package modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class EmpleadoDao implements CRUD<Empleado>{

    Conexion conectar=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
 
    
    
    
    
    public  List listar() {
        List<Empleado> datos= new ArrayList<>();
        String sql= "Select \n" +
                    "e.empleado_id,\n" +
                    "e.nombre,\n" +
                    "e.apellido,\n" +
                    "e.direccion,\n" +
                    "e.telefono, \n" +
                    "e.correo,\n" +
                    "e.loginUser,\n" +
                    "e.contrasena,\n" +
                    "est.descripcion,\n" +
                    "especialidad.descripcion\n" +
                    "\n" +
                    "from \n" +
                    "\n" +
                    "empleado e,\n" +
                    "estado est,\n" +
                    "especialidad\n" +
                    "\n" +
                    "where \n" +
                    "\n" +
                    "e.especialidad_id = especialidad.especialidad_id\n" +
                    "AND\n" +
                    "e.estado_id = est.estado_id;";
          try {
           
            con=conectar.getConection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
             while (rs.next()) {
                Empleado e=new Empleado();
                e.setCc(rs.getInt(1));
                e.setNombre(rs.getString(2));
                e.setApellido(rs.getString(3));
                e.setDireccion(rs.getString(4));
                e.setTelefono(rs.getString(5));
                e.setCorreo(rs.getString(6));
                e.setLogin(rs.getString(7));
                e.setContraseña(rs.getString(8));
                e.setEspecialidad(rs.getInt(9));
                e.setEstado(rs.getInt(10));
            
                datos.add(e);
                
            }
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.toString());
        }finally{
            try{
                if(con!=null){
                    con.close();
                }
            }catch(SQLException sqle){
                JOptionPane.showMessageDialog(null, sqle.toString());
            }
        }
        
        
        return datos;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public int setAgregar(Empleado tr) {
        String sql="INSERT INTO empleado (\n" +
                "nombre,\n" +
                "apellido,\n" +
                "direccion,\n" +
                "telefono,\n" +
                "correo,\n" +
                "loginUser,\n" +
                "contrasena,\n" +
                "especialidad_id,\n" +
                "estado_id\n" +
                ") VALUES (?,?,?,?,?,?,?,?,?);";
       
        try{
            con=conectar.getConection();
            ps=con.prepareStatement(sql);
            
            ps.setString(1,tr.getNombre());
            ps.setString(2,tr.getApellido());
            ps.setString(3, tr.getTelefono());
            ps.setString(4, tr.getDireccion());
            ps.setString(5, tr.getCorreo());
            ps.setString(6, tr.getLogin());
            ps.setString(7, tr.getContraseña());
            ps.setInt(8, tr.getEspecialidad());
            ps.setInt(9, tr.getEstado());
            
            ps.executeUpdate();
            System.out.println("test");
            return 1;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return 0;
        }finally{
            
            try{
                if(con!=null){
                    con.close();
                }
            }catch(SQLException sqle){
                JOptionPane.showMessageDialog(null, sqle.toString());
            }
            
        } 
    }
    
    
    
    
    
    
    
    
    
    
    
    

   @Override
    public int setActualizar( Empleado tr) {
    String sql = "UPDATE empleado SET " +
                 "nombre = ?, " +
                 "apellido = ?, " +
                 "direccion = ?, " +
                 "telefono = ?, " +
                 "correo = ?, " +
                 "loginUser = ?, " +
                 "contrasena = ?, " +
                 "especialidad_id = ?, " +
                 "estado_id = ? " +
                 "WHERE empleado_id =";

    try {
        con = conectar.getConection();
        ps = con.prepareStatement(sql);

        // Asignar valores a los parámetros
        ps.setString(1, tr.getNombre());
        ps.setString(2, tr.getApellido());
        ps.setString(3, tr.getDireccion());
        ps.setString(4, tr.getTelefono());
        ps.setString(5, tr.getCorreo());
        ps.setString(6, tr.getLogin());
        ps.setString(7, tr.getContraseña());
        ps.setInt(8, tr.getEspecialidad());
        ps.setInt(9, tr.getEstado());
        ps.setInt(10, tr.getCc()); 

        ps.executeUpdate();
        System.out.println("Empleado actualizado correctamente.");
        return 1; // Indica éxito
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar empleado: " + e.toString());
        return 0; // Indica error
    } finally {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + sqle.toString());
        }
    }
}


    
    
    
    
    
    
    
    
    
    @Override
    public int setEliminar(int empleado_id) {
       String sql="DELETE FROM sena WHERE id="+empleado_id;
        
        try{
            con=conectar.getConection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            return 1;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return 0;
        }finally{
            
            try{
                if(con!=null){
                    con.close();
                }
            }catch(SQLException sqle){
                JOptionPane.showMessageDialog(null, sqle.toString());
            }
            
        }
    }
    
    
    
    
    
    
    
    
    
    public  Map<String, String> cargarUsuarios(String user, String contrasena) {
        Map<String,String> usuario = new HashMap<>();
        String sql="SELECT emple.loginUser, emple.contrasena, especialidad.descripcion AS especialidad, estado.descripcion AS estado FROM empleado emple JOIN estado estado ON estado.estado_id = emple.estado_id JOIN especialidad especialidad ON emple.especialidad_id = especialidad.especialidad_id WHERE emple.loginUser = ? AND emple.contrasena = ?;";
        try{
             con=conectar.getConection();
             ps=con.prepareStatement(sql);
             ps.setString(1, user); 
             ps.setString(2, contrasena);
             rs=ps.executeQuery();
            if (rs.next()) { 
                usuario.put("loginUser", rs.getString("loginUser")); 
                usuario.put("contrasena", rs.getString("contrasena")); 
                usuario.put("especialidad", rs.getString("especialidad")); 
                usuario.put("estado", rs.getString("estado")); 
            } else { 
                JOptionPane.showMessageDialog(null, "Usuario no encontrado o contraseña incorrecta."); }
         
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }finally{
            try{
                if(con!=null){
                    con.close();
                }
            }catch(SQLException sqle){
                JOptionPane.showMessageDialog(null, sqle.toString());
            }
        
        }
        return usuario;
    }
        
}
    

