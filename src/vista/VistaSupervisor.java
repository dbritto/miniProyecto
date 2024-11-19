/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author Cristhian
 */
public class VistaSupervisor extends JFrame {
    private Container contenido;
    public JButton ventas, insumos, reparaciones, inventario;
    private JLabel bienvenido, lventas, linsumos, lreparaciones, linventario;
    public JTextField tventas, tinsumos, treparaciones, tinventario;
    private GridLayout migrid, migrid1,migrid2;
    private JPanel one, principal, menu, vistas;
    public JTextArea area;
    public VistaSupervisor(){
        super("Supervisor");
        contenido=getContentPane();
        contenido.setLayout(new BoxLayout(contenido,BoxLayout.Y_AXIS));
        one = new JPanel();
        migrid2 = new GridLayout(2,1,50,20);
        one.setLayout(migrid2);
        bienvenido=new JLabel("BIENVENIDO");
        
        principal = new JPanel();
        migrid= new GridLayout(1,2,50,50);
        principal.setLayout(migrid);
        
        menu = new JPanel();
        migrid1 = new GridLayout(4,1,10,10);
        menu.setLayout(migrid1);
        ventas = new JButton("VENTAS");
        insumos = new JButton("INSUMOS");
        inventario=new JButton("INVENTARIO");
        reparaciones=new JButton("REPARACIONES");
        menu.add(ventas);
        menu.add(insumos);
        menu.add(inventario);
        menu.add(reparaciones);
        
        vistas =new JPanel();
        area = new JTextArea(50,50);
        area.setBackground(Color.red);
        vistas.add(area);
       
        principal.add(menu);
        principal.add(vistas);
        
        
        one.add(principal);
        contenido.add(bienvenido);
        contenido.add(one);
        
        setTitle("Vista Principal"); setSize(400, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);
         
        
        
        
        
    }
    
    
    
    
    
}
