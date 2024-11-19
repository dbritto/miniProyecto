/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Cristhian
 */
public class RegistrarTecnico extends JFrame {
    
    private Container contenedor;
    private JPanel principal;
    private JLabel lcedula,lnombre,lapellido,ldireccion,ltelefono,lemail,lrol,lregistro;
    public JButton bregistrar, bvolver;
    public JTextField tcedula,tnombre,tapellido,tdireccion,ttelefono,temail;
    private GridLayout migrid;
    public JComboBox boxpersona;
    private String roles[]={"", "Vendedor","Supervisor", "Cliente","Tecnico"};
    
    public RegistrarTecnico(){
        super("Registrar");
        contenedor =getContentPane();
        contenedor.setLayout(new BoxLayout(contenedor,BoxLayout.Y_AXIS));
        lregistro=new JLabel("Registro Persona");
        principal =new JPanel();
        migrid=new GridLayout(8,2);
        principal.setLayout(migrid);
        
        lcedula=new JLabel("Cedula");
        lnombre=new JLabel("Nombre");
        lapellido=new JLabel("Apellido");
        ldireccion=new JLabel("Direccion");
        ltelefono=new JLabel("Telefono");
        lemail=new JLabel("Correo Electronico");
        lrol=new JLabel("Rol");
        
        tcedula=new JTextField();
        tnombre=new JTextField();
        tapellido=new JTextField();
        tdireccion=new JTextField();
        ttelefono=new JTextField();
        temail=new JTextField();
        boxpersona=new JComboBox(roles);
        
        bregistrar=new JButton("Registrar");
        bvolver=new JButton("Volver");
        
        principal.add(lcedula);
        principal.add(tcedula);
        principal.add(lnombre);
        principal.add(tnombre);
        principal.add(lapellido);
        principal.add(tapellido);
        principal.add(ldireccion);
        principal.add(tdireccion);
        principal.add(ltelefono);
        principal.add(ttelefono);
        principal.add(lemail);
        principal.add(temail);
        principal.add(lrol);
        principal.add(boxpersona);
        principal.add(bregistrar);
        principal.add(bvolver);
        
        contenedor.add(lregistro);
        contenedor.add(principal);
        
        
        
        
        
    }
    
}
