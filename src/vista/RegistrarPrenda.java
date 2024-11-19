package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
/**
 *
 * @author Cristhian
 */
public class RegistrarPrenda extends JFrame {
    public Container contenedor;
    public JLabel reprenda,tipoprenda,tipotela,descripcion,fechaingreso,fechaentrega,cliente,tecnico, buscarinsumo,lcantidad;
    public JTextField tfechaingreso,tfechaentrega,tbuscar,tcantidad;
    public JTextArea tdescripcion;
    public JPanel panelingreso,panelinsumo,panelmostrar,panelingreso1,panelingreso2,panelbuscar, panelbuscarsup, panelbuscarinsumos;
    public JPanel panelcantidad, panelinsumosagregado;
    public JComboBox cbtipoprenda,cbtipotela,cbtecnico,cbcliente;
    public GridLayout migrid,migrid1,migrid2, migrid3;
    public String tipprenda[]={"","Jeans","Blusas","Vestidos","Chaquetas"};
    public String tiptela[]={"","Seda","Algodon","Poliester","Cuero"};
    public JButton buscar, bagregar,bregistrar;
    public DefaultTableModel tablainsumo, tablainsumoagregado;
    public JTable tabla, tablaagregado;
    public JScrollPane miscroll;
    public JDateChooser fechain, fechasal;

    public RegistrarPrenda(){
        super("Registro Prendas");
        contenedor= getContentPane();
        contenedor.setLayout(new BoxLayout(contenedor,BoxLayout.Y_AXIS));// SE ALINEA CENTRADO Y DE FORMA VERTICAL

        // creacion de los labels
        reprenda=new JLabel("REGISTRO DE PRENDAS");
        tipoprenda= new JLabel("TIPO DE PRENDA");
        tipotela=new JLabel("TIPO DE TELA");
        descripcion = new JLabel("DESCRIPCION REPARACION");
        fechaingreso=new JLabel("FECHA DE INGRESO");
        fechaentrega=new JLabel("FECHA DE ENTREGA");
        cliente = new JLabel("CLIENTE");
        tecnico = new JLabel("TECNICO");

        //creacion de los JCombobox
        cbtipoprenda=new JComboBox(tipprenda);
        cbtipotela=new JComboBox(tiptela);
        cbcliente=new JComboBox();
        cbtecnico=new JComboBox();

        //creacion del text area
        tdescripcion=new JTextArea(10,10);


        //creacion del panel de ingreso de datos
        panelingreso=new JPanel();
        migrid=new GridLayout(1,2);
        panelingreso.setLayout(migrid);
        //se crea un subpanel para el lado izquierdo
        panelingreso1=new JPanel();
        migrid2=new GridLayout(3,2,10,10);
        panelingreso1.setLayout(migrid2);
        panelingreso1.add(tipoprenda);
        panelingreso1.add(cbtipoprenda);
        panelingreso1.add(tipotela);
        panelingreso1.add(cbtipotela);
        panelingreso1.add(descripcion);
        panelingreso1.add(tdescripcion);

        //se crea un subpanel para el lado derecho
        panelingreso2=new JPanel();
        migrid1=new GridLayout(4,2,50,10);
        panelingreso2.setLayout(migrid1);
        fechaingreso=new JLabel("FECHA DE INGRESO: ");
        fechaentrega=new JLabel("FECHA DE ENGREGA: ");
        cliente = new JLabel("CLIENTE");
        tecnico=new JLabel("TECNICO");

        fechain = new JDateChooser();
        fechasal = new JDateChooser();
        cbcliente=new JComboBox();
        cbtecnico=new JComboBox();
        // se anexan al panel principal de ingresos
        panelingreso2.add(fechaingreso);
        panelingreso2.add(fechain);
        panelingreso2.add(fechaentrega);
        panelingreso2.add(fechasal);
        panelingreso2.add(cliente);
        panelingreso2.add(cbcliente);
        panelingreso2.add(tecnico);
        panelingreso2.add(cbtecnico);

        //panel para la busqueda de insumos
        panelbuscar=new JPanel();
        panelbuscar.setLayout(new BoxLayout(panelbuscar,BoxLayout.Y_AXIS));
        panelbuscarsup=new JPanel();
        panelbuscarsup.setLayout(new BorderLayout());

        buscarinsumo=new JLabel("BUSCAR INSUMO");

        tbuscar=new JTextField();
        buscar=new JButton("BUSCAR");
        panelbuscarsup.add(buscarinsumo,BorderLayout.WEST);
        panelbuscarsup.add(tbuscar,BorderLayout.CENTER);
        panelbuscarsup.add(buscar,BorderLayout.EAST);

        // se crea la tbala que me muestra los insumos buscados
        tablainsumo=new DefaultTableModel();
        tablainsumo.addColumn("ID");
        tablainsumo.addColumn("NOMBRE ARTIUCLO");
        tablainsumo.addColumn("CANTIDAD");

        panelbuscarinsumos= new JPanel();
        migrid3=new GridLayout(1,1,2,3);
        panelbuscarinsumos.setLayout(migrid3);
        tabla =new JTable(tablainsumo);
        miscroll= new JScrollPane(tabla);

        miscroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        miscroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panelbuscarinsumos.add(miscroll);

        // se crea panel para agreagar cantidads de insumo
        bagregar=new JButton("AGREGAR");
        lcantidad=new JLabel("CANTIDADES");
        tcantidad=new JTextField(10);

        panelcantidad= new JPanel();
        panelcantidad.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelcantidad.add(lcantidad);
        panelcantidad.add(tcantidad);
        panelcantidad.add(bagregar);

        //se crea la tabla donde se agregan los insumos
        tablainsumoagregado=new DefaultTableModel();

        tablainsumoagregado.addColumn("NOMBRE ARTIUCLO");
        tablainsumoagregado.addColumn("CANTIDAD");
        tablainsumoagregado.addColumn("PRECIO");

        panelinsumosagregado= new JPanel();
        panelinsumosagregado.setLayout(migrid3);
        tablaagregado =new JTable(tablainsumoagregado);
        miscroll= new JScrollPane(tablaagregado);

        miscroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        miscroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panelinsumosagregado.add(miscroll);
        bregistrar=new JButton("REGISTRAR");

        panelbuscar.add(panelbuscarsup);
        panelbuscar.add(panelbuscarinsumos);
        panelbuscar.add(panelcantidad);
        panelbuscar.add(panelinsumosagregado);
        panelingreso.add(panelingreso1);
        panelingreso.add(panelingreso2);
        contenedor.add(reprenda);
        contenedor.add(panelingreso);
        contenedor.add(panelbuscar);
        contenedor.add(bregistrar);


    }



}