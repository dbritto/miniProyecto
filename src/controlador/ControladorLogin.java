
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.EmpleadoDao;
import vista.Login;
import vista.VistaRegistroPrenda;
import vista.VistaSupervisor;
import vista.VistaTecnico;
import vista.VistaVendedor;

public class ControladorLogin implements ActionListener{
    public EmpleadoDao dao = new EmpleadoDao();
    public Empleado emple = new Empleado();
    public Login login = new Login();
    
    public ControladorLogin(Login log){
        this.login=log;
        this.login.ingresar.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login.ingresar){
          String user,contraseña;
          user=login.tusuario.getText();
          contraseña=login.tcontraseña.getText();
          
          Map<String, String> usuario = dao. cargarUsuarios(user, contraseña);
          
          if (!usuario.isEmpty()) {
           String especialidad = usuario.get("especialidad");   
          
            if ("tecnico".equals(especialidad)) { 
                VistaRegistroPrenda vistaTecnico = new VistaRegistroPrenda(); 
                vistaTecnico.setVisible(true);
            }else if ("vendedor".equals(especialidad)) { 
               VistaVendedor vistaVendedor = new VistaVendedor();
               vistaVendedor.setVisible(true); 
            }else if ("administrador".equals(especialidad)) { 
                VistaSupervisor vistaAdmin = new VistaSupervisor();
                vistaAdmin.setVisible(true); 
            }else{
              JOptionPane.showMessageDialog(login, "Contraseña o usuario incorrecto");
            } 
          } 
        }
    }
}
