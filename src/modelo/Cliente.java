
package modelo;


public class Cliente extends Persona{
    public int canReparaciones;
    public int cantCompras;

    public Cliente() {
    }

    public Cliente(int estado, int canReparaciones, int cantCompras) {
        this.estado = estado;
        this.canReparaciones = canReparaciones;
        this.cantCompras = cantCompras;
    }


    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCanReparaciones() {
        return canReparaciones;
    }

    public void setCanReparaciones(int canReparaciones) {
        this.canReparaciones = canReparaciones;
    }

    public int getCantCompras() {
        return cantCompras;
    }

    public void setCantCompras(int cantCompras) {
        this.cantCompras = cantCompras;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
