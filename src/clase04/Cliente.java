
package clase04;

import java.util.ArrayList;
import java.util.List;


public class Cliente {
    private int nro;
    private String nombre;
    private String apellido;
    private String direccion;
    
    public Cliente(){
        
    }

    public Cliente(int nro, String nombre, String apellido, String direccion) {
        this.nro = nro;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "nro=" + nro + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + '}';
    }
  public List<Cliente> getAll(){
      List lista=new ArrayList();
      
      lista.add(new Cliente(1,"Andre","Godoy","Lima 222"));
      lista.add(new Cliente(2,"Jose","Mendez","Peru 333"));
      lista.add(new Cliente(3,"Pedro","Gallardo","Maipu 444"));
      lista.add(new Cliente(4,"Juan","Perez","Lavalle 345"));
        
       return lista;
      
  }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
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
  
  
  
}
