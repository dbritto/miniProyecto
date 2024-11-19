
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class VistaVendedor  extends JFrame{
    public Container contenedor;
    
    //botones del menu de navegacion
    JButton btn1,btn2,btn3,btn4;
    
    //botones de la calculadora
    JButton btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18;
    
    
      
    private JPanel total,calculo,menu,productos,principal,suma;
    private GridLayout Calculadora;  
    private BorderLayout prin;
    private GridLayout menuGri;
        
    
    public VistaVendedor(){
        
        btn1 = new JButton();
        btn1.setText("Deportiva");
        btn2 = new JButton();
        btn2.setText("Vestidos");
        btn3 = new JButton();
        btn3.setText("Trajes Formales");
        btn4 = new JButton();
        btn4.setText("Chaquetas");
        btn5= new JButton();
        
        
        
        
        btn5 = new JButton("1"); 
        btn6 = new JButton("2"); 
        btn7 = new JButton("3"); 
        btn8 = new JButton("4"); 
        btn9 = new JButton("5"); 
        btn10 = new JButton("6"); 
        btn11 = new JButton("7"); 
        btn12 = new JButton("8"); 
        btn13 = new JButton("9"); 
        btn14 = new JButton("0");
        btn15 = new JButton(".");
        btn16 = new JButton("Cliente");
        btn17 = new JButton("Pagar");
        
        JButton[] botonesCalculo = {btn5, btn6, btn7,btn15,  btn8,btn9, btn10,btn17, btn11 , btn13, btn12 , btn16,btn14};
        
        
        
        //Creamos los dos contenedores principales
                
        principal = new JPanel();
        suma = new JPanel();
        contenedor = new Container();
        contenedor = getContentPane();
        

        
        //Creamos los contenedores secundarios
        
        total = new JPanel();
        calculo = new JPanel();
        menu = new JPanel();
        productos = new JPanel();
        
        
        
        suma.setLayout(new BoxLayout(suma,BoxLayout.Y_AXIS));
        principal.setLayout(new BoxLayout(principal,BoxLayout.Y_AXIS));
        
        prin = new BorderLayout();
        menuGri = new GridLayout(1,5,10,10);
        Calculadora = new GridLayout(4, 4, 10, 10);
        // le colocamos las formas que va a tener cada menu
        contenedor.setLayout(prin);
        menu.setLayout(menuGri);
        calculo.setLayout(Calculadora);
        
        //colocamos colores para ver resultado
        total.setBackground(Color.WHITE);
        calculo.setBackground(Color.GRAY);
        menu.setBackground(Color.blue);
        productos.setBackground(Color.black);
        
        
        //agregamos los subcontenedores a los principales
        principal.add(menu);
        principal.add(productos);
        
        suma.add(total);
        suma.add(calculo);
        
 
        
        //medidas de los contenedores
        principal.setPreferredSize(new Dimension(1050, 700));
        suma.setPreferredSize(new Dimension(350, 700));
        
        //medidas de los subconenedores
       total.setPreferredSize(new Dimension(300, 500)); 
       calculo.setPreferredSize(new Dimension(300, 200)); 
       menu.setPreferredSize(new Dimension(1000, 30)); 
       productos.setPreferredSize(new Dimension(1000, 670));
        
        
        contenedor.add(suma,BorderLayout.WEST);
        contenedor.add(principal,BorderLayout.CENTER);
        
        
        menu.add(btn1);
        menu.add(btn2);
        menu.add(btn3);
        menu.add(btn4);
        
        for (JButton boton : botonesCalculo) { 
            calculo.add(boton);
        }
        
        

    }
    
}
