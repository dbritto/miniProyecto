package modelo;

import java.security.Timestamp;


public class PrendaReparacion {
    private int id_prendaReparacion;
    private String fecha_ingreso;
    private String fecha_estimada_entrega;
    private String descripcion_dano;
    private int id_tipo_prenda,id_tipo_tela,empleado_id,clien_id,estado_id;
    private String nombreCliente;
    private String nombreEmpleado;
    private String nombrePrenda;
    private String estadoPrenda;
    private String nombre_tipo_tela;

    public PrendaReparacion() {
    }

    public int getId_prendaReparacion() {
        return id_prendaReparacion;
    }

    public void setId_prendaReparacion(int id_prendaReparacion) {
        this.id_prendaReparacion = id_prendaReparacion;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_estimada_entrega() {
        return fecha_estimada_entrega;
    }

    public void setFecha_estimada_entrega(String fecha_estimada_entrega) {
        this.fecha_estimada_entrega = fecha_estimada_entrega;
    }

    public String getDescripcion_dano() {
        return descripcion_dano;
    }

    public void setDescripcion_dano(String descripcion_dano) {
        this.descripcion_dano = descripcion_dano;
    }

    public int getId_tipo_prenda() {
        return id_tipo_prenda;
    }

    public void setId_tipo_prenda(int id_tipo_prenda) {
        this.id_tipo_prenda = id_tipo_prenda;
    }

    public int getId_tipo_tela() {
        return id_tipo_tela;
    }

    public void setId_tipo_tela(int id_tipo_tela) {
        this.id_tipo_tela = id_tipo_tela;
    }

    public int getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(int empleado_id) {
        this.empleado_id = empleado_id;
    }

    public int getClien_id() {
        return clien_id;
    }

    public void setClien_id(int clien_id) {
        this.clien_id = clien_id;
    }

    public int getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(int estado_id) {
        this.estado_id = estado_id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    public String getEstadoPrenda() {
        return estadoPrenda;
    }

    public void setEstadoPrenda(String estadoPrenda) {
        this.estadoPrenda = estadoPrenda;
    }

    public String getNombre_tipo_tela() {
        return nombre_tipo_tela;
    }

    public void setNombre_tipo_tela(String nombre_tipo_tela) {
        this.nombre_tipo_tela = nombre_tipo_tela;
    }

    public PrendaReparacion(int id_prendaReparacion, String fecha_ingreso, String fecha_estimada_entrega, String descripcion_dano, int id_tipo_prenda, int id_tipo_tela, int empleado_id, int clien_id, int estado_id, String nombreCliente, String nombreEmpleado, String nombrePrenda, String estadoPrenda, String nombre_tipo_tela) {
        this.id_prendaReparacion = id_prendaReparacion;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_estimada_entrega = fecha_estimada_entrega;
        this.descripcion_dano = descripcion_dano;
        this.id_tipo_prenda = id_tipo_prenda;
        this.id_tipo_tela = id_tipo_tela;
        this.empleado_id = empleado_id;
        this.clien_id = clien_id;
        this.estado_id = estado_id;
        this.nombreCliente = nombreCliente;
        this.nombreEmpleado = nombreEmpleado;
        this.nombrePrenda = nombrePrenda;
        this.estadoPrenda = estadoPrenda;
        this.nombre_tipo_tela = nombre_tipo_tela;
    }


    
    
    

}
