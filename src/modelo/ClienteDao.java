
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ClienteDao implements CRUD<Cliente>{

    Conexion conectar=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    
    @Override
    public List<Cliente> listar() {
        List<Cliente> datos= new ArrayList<>();
        
        String sql="SELECT \n" +
                    "clien_id,\n" +
                    "clien_nombre,\n" +
                    "clien_apellido,\n" +
                    "clien_direccion,\n" +
                    "clien_telefono,\n" +
                    "clien_correo,\n" +
                    "clien_cant_reparaciones,\n" +
                    "clien_cant_compras,\n" +
                    "estado_id\n" +
                        "FROM \n" +
                    "cliente;";
        
        
         try {
           
            con=conectar.getConection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
             while (rs.next()) {
                Cliente e=new Cliente();
                e.setCc(rs.getInt(1));
                e.setNombre(rs.getString(2));
                e.setApellido(rs.getString(3));
                e.setDireccion(rs.getString(4));
                e.setTelefono(rs.getString(5));
                e.setCorreo(rs.getString(6));
                e.setCanReparaciones(rs.getInt(7));
                e.setCantCompras(rs.getInt(8));
                e.setEstado(rs.getInt(9));
            
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
    public int setAgregar(Cliente tr) {
       String sql="INSERT INTO cliente (\n" +
                "clien_nombre,\n" +
                "clien_apellido,\n" +
                "clien_direccion,\n" +
                "clien_telefono,\n" +
                "clien_correo,\n" +
                "clien_cant_reparaciones,\n" +
                "clien_cant_compras,\n" +
                "estado_id\n" +
                ") VALUES (?,?,?,?,?,?,?,?);";
       
        try{
            con=conectar.getConection();
            ps=con.prepareStatement(sql);
            
            ps.setInt(1 ,0);
            ps.setString(2,tr.getNombre());
            ps.setString(3,tr.getApellido());
            ps.setString(4, tr.getTelefono());
            ps.setString(5, tr.getCorreo());
            ps.setInt(6, tr.getCanReparaciones());
            ps.setInt(7, tr.getCantCompras());
            ps.setInt(8, tr.getEstado());
            
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
    public int setActualizar(Cliente tr){
       String sql = "UPDATE cliente SET " +
                 "clien_nombre = ?, " +
                 "clien_apellido = ?, " +
                 "clien_direccion = ?, " +
                 "clien_telefono = ?, " +
                 "clien_correo = ?, " +
                 "clien_cant_reparaciones = ?, " +
                 "clien_cant_compras = ?, " +
                 "estado_id = ? " +
                 "WHERE cliente_id = ?";
       
       
        
        try{
            con=conectar.getConection();
            ps=con.prepareStatement(sql);
            
            
            
            ps.setString(1, tr.getNombre());
            ps.setString(2, tr.getApellido());
            ps.setString(3, tr.getDireccion());
            ps.setString(4, tr.getTelefono());
            ps.setString(5, tr.getCorreo());
            ps.setInt(6, tr.getCanReparaciones());
            ps.setInt(7, tr.getCantCompras());
            ps.setInt(8, tr.getEstado());
            ps.setInt(9, tr.getCc());
            
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

    @Override
    public int setEliminar(int clien_id) {
        String sql="DELETE FROM sena WHERE id="+clien_id;
        
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
    
}
