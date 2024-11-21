
package vista;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;



public class VistaRegistroPrenda extends JFrame{
    public Container contenedor;
    
    public JLabel tituIngresadas,tituEsperInsu,tituReparacion,tituRevision,tituEntrega;
    
    public JPanel botones,principal,ingresadas,esperaInsumos,
            enReparacion,revision,entrega;
    
    public JButton registroPrenda,RegistroCliente;
    
    public FlowLayout flow_princi,flow_boton;
    
    public VistaRegistroPrenda(){
        
        //Creamos los titulos de cada seccion
        
        tituIngresadas = new JLabel();
        tituEsperInsu = new JLabel();
        tituReparacion = new JLabel();
        tituRevision = new JLabel();
        tituEntrega = new JLabel();
        
        tituIngresadas.setText("ingresadas");
        tituEsperInsu.setText("Espera de insumos");
        tituReparacion.setText("En reparacion");
        tituRevision.setText("Revisión");
        tituEntrega.setText("Proceso de entrega");
        
        //Creamos los botones
        registroPrenda = new JButton();
        RegistroCliente = new JButton();
 
        registroPrenda.setText("Registrar Prenda");
        RegistroCliente.setText("Nuevo Cliente");
   
        
        
        //creamos los paneles que vamos a utilizar
        
        botones = new JPanel();
        //en esos paneles van a ir los botones
        principal = new JPanel();
        ingresadas = new JPanel();
        esperaInsumos = new JPanel();
        enReparacion = new JPanel();
        revision = new JPanel();
        entrega = new JPanel();
        
        
        
        
        
        
        
        
        
        // creamos el estilo de los JPaneles Principales
        flow_princi = new FlowLayout();
        flow_boton = new FlowLayout();
        
        //modificamos la apariencia de como van a salir
        botones.setLayout(flow_boton);
        principal.setLayout(new BoxLayout(principal, BoxLayout.X_AXIS));
        
        principal.setBackground(Color.red);
        
        //donde vamos a agregar los botones
        contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        ingresadas.setLayout(new BoxLayout(ingresadas,BoxLayout.Y_AXIS));
        esperaInsumos.setLayout(new BoxLayout(esperaInsumos, BoxLayout.Y_AXIS));
        enReparacion.setLayout(new BoxLayout(enReparacion,BoxLayout.Y_AXIS));
        revision.setLayout(new BoxLayout(revision,BoxLayout.Y_AXIS));
        entrega.setLayout(new BoxLayout(entrega,BoxLayout.Y_AXIS));
        
        
        
        JScrollPane scrollIngresadas = new JScrollPane(ingresadas); 
        JScrollPane scrollEsperaInsumos = new JScrollPane(esperaInsumos); 
        JScrollPane scrollEnReparacion = new JScrollPane(enReparacion);
        JScrollPane scrollRevision = new JScrollPane(revision);
        JScrollPane scrollEntrega = new JScrollPane(entrega);
        //agregamos cosas a los paneles principales
        botones.add(RegistroCliente);
        botones.add(registroPrenda);
        
        
        principal.add(Box.createRigidArea(new Dimension(0, 10))); 
        principal.add(scrollIngresadas);
        principal.add(Box.createRigidArea(new Dimension(0, 10))); 
        principal.add(scrollEsperaInsumos);
        principal.add(Box.createRigidArea(new Dimension(0, 10))); 
        principal.add(scrollEnReparacion);
        principal.add(Box.createRigidArea(new Dimension(0, 10))); 
        principal.add(scrollRevision);
        principal.add(Box.createRigidArea(new Dimension(0, 10)));  
        principal.add(scrollEntrega);

        
        
        
       

//        principal.add(scrollIngresadas);
//        principal.add(scrollEsperaInsumos);
//        principal.add(scrollEnReparacion);
//        principal.add(scrollRevision);
//        principal.add(scrollEntrega);
        
        
       
        ingresadas.add(tituIngresadas);
        esperaInsumos.add(tituEsperInsu);
        enReparacion.add(tituReparacion);
        revision.add(tituRevision);
        entrega.add(tituEntrega);
        
  
        
        
        botones.setPreferredSize(new Dimension(1366, 70));
        
        
       
        
        contenedor.add(botones, BorderLayout.NORTH);
     
        contenedor.add(principal);
        contenedor.add(principal, BorderLayout.CENTER);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1366, 768);
        setLocationRelativeTo(null);
        
    }
}
