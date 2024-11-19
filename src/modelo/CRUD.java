package modelo;

import java.util.List;

public interface CRUD<U> {
    
    public List<U> listar();
    public int setAgregar(U tr);
    public int setActualizar(U tr);
    public int setEliminar(int tr);  
}
