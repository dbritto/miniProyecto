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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Cristhian
 */
public class VistaSupervisorInventario extends JFrame{
    private Container contenedor;
    public JButton bgenerar, bvolver, bpedido;
    public JComboBox boxreporte;
    private String reportes[]={"", "Cantidad Menor a 5","Descripcion"};
    private JPanel panel,panelarea,panelbotones;
    public JTextArea area;
    private GridLayout migrid,migrid2;
    private JLabel lreporte1,lreporte;
    private GridLayout migrid1;
    
    
    public VistaSupervisorInventario() {
        super("Inventario");
        contenedor = getContentPane();
        contenedor.setLayout(new BoxLayout(contenedor,BoxLayout.Y_AXIS));
        panel = new JPanel();
        migrid=new GridLayout(1,2,2,3);
        panel.setLayout(migrid);
        lreporte=new JLabel("Reportes por: ");
        boxreporte=new JComboBox(reportes);
        panel.add(lreporte);
        panel.add(boxreporte);
               
        panelarea=new JPanel();
         migrid2=new GridLayout(1,1,2,3);
        panelarea.setLayout(migrid2);
        area=new JTextArea(10,10);
        area.setBackground(Color.red);
        lreporte1=new JLabel("Reportes");
        panelbotones=new JPanel();
       
        bgenerar=new JButton("Generar Grafico");
        bpedido=new JButton("Realizar Pedido");
        bvolver=new JButton("Volver");
        
         panelbotones.add(bgenerar);
        panelbotones.add(bpedido);
        panelbotones.add(bvolver);
        panelarea.add(area);
        contenedor.add(panel);
        contenedor.add(panelarea);
        contenedor.add(panelbotones);
        
        
    }
   
    
    
    
}
