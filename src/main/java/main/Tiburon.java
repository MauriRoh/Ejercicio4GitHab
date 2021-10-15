
package main;

public class Tiburon {
    
  private String raza;
    private Integer peso;
    private Integer longitud;

    public Tiburon() {
    }

    public Tiburon(String raza, Integer peso, Integer longitud) {
        this.raza = raza;
        this.peso = peso;
        this.longitud = longitud;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Tiburon{" + "raza=" + raza + ", peso=" + peso + ", longitud=" + longitud + '}';
    }
    
      
    
    
    
}
