package vista;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame  {
    public Container contenedor;
    public JButton ingresar;
    public JLabel usuario,contraseña,login;
    public JTextField tusuario,tcontraseña;
    public FlowLayout miflow;
    public GridLayout migrid;
    public JPanel log;

    public Login(){
        //nombre de la pestala
        super("Login");
        
    contenedor=getContentPane();
    miflow=new FlowLayout();
    contenedor.setLayout(miflow);
    
    
    ingresar=new JButton("Ingresar");
    login =new JLabel();
   
    
    login.setIcon(new ImageIcon(getClass().getResource("../imagenes/logo1.png")));
    contenedor.add(login);
    usuario=new JLabel("Usuario");
    contraseña=new JLabel("Contraseña");
    tusuario=new JTextField(20);
    tcontraseña=new JTextField(20);
    
    ingresar = new JButton("Ingresar");
    log =new JPanel();
    migrid=new GridLayout(3,2,5,5);
    log.setLayout(migrid);
    log.add(usuario);
    log.add(tusuario);
    log.add(contraseña);
    log.add(tcontraseña);
    log.add(ingresar);
    contenedor.add(log);
    
}


}
