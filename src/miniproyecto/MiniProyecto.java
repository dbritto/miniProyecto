
package miniproyecto;

import controlador.ControladorLogin;
import vista.Login;
import javax.swing.JFrame;
public class MiniProyecto {
   
    public static void main(String[] args) {
       
       
       Login login = new Login();
       ControladorLogin c= new ControladorLogin(login);
       login.setVisible(true);
       login.setSize(500, 300);
       login.setLocationRelativeTo(null);
       login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
       
    }
    
}
