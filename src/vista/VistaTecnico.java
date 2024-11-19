package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

/**
 *
 * @author Cristhian
 */
public class VistaTecnico extends JFrame {
    
    public Container contenedor;
    public JButton creparacion,vreparacion;
    public JPanel panel,panelbotones,panelvista;
    public JLabel bienvenido;
    public JTextArea area;
    
    public VistaTecnico(){
        super("TECNICO");
        contenedor= getContentPane();
        contenedor.setLayout(new BoxLayout(contenedor,BoxLayout.Y_AXIS));// SE ALINEA CENTRADO Y DE FORMA VERTICAL
        panel = new JPanel();
        panelbotones = new JPanel();
        panelvista = new JPanel();
        area = new JTextArea(250,250); //SE CREA EL ESPACIO DONDE VAN LAS VISTAS 
        area.setBackground(Color.red);
       bienvenido = new JLabel("BIENVENIDO");
      
       creparacion =new JButton("Crear Reparacion");
       vreparacion= new JButton("Consultar Reparaciones");
       panel.add(bienvenido);
       panelbotones.add(creparacion);
       panelbotones.add(vreparacion);
       panelvista.add(area);
       contenedor.add(panel);
       contenedor.add(panelbotones);
       contenedor.add(panelvista);
    }
    
    
    
}
