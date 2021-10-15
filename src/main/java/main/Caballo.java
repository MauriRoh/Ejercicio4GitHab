
package main;

/**
 *
 * @author mauri
 */
public class Caballo {
   
    private String Id;
    private String nombre;
    private String Descendencia;

    public Caballo() {
    }

    public Caballo(String Id, String nombre, String Descendencia) {
        this.Id = Id;
        this.nombre = nombre;
        this.Descendencia = Descendencia;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescendencia() {
        return Descendencia;
    }

    public void setDescendencia(String Descendencia) {
        this.Descendencia = Descendencia;
    }
    
    
}
