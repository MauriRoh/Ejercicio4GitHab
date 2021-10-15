/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Matias
 */
public class Delfin {
    
    private String nombre;
    private String raza;
    private String tamanio;
    private Integer edad;
    private Integer peso;
    private Integer medida;
    
    //CONSTRUCTOR VACIO

    public Delfin() {
    }
    
    //CONSTRUCTOR CON PARAMETROS

    public Delfin(String nombre, String raza, String tamanio, Integer edad, Integer peso, Integer medida) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
        this.edad = edad;
        this.peso = peso;
        this.medida = medida;
    }
    
    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getMedida() {
        return medida;
    }

    public void setMedida(Integer medida) {
        this.medida = medida;
    }
    
    //TO STRING

    @Override
    public String toString() {
        return "Delfin{" + "nombre=" + nombre + ", raza=" + raza + ", tamanio=" + tamanio + ", edad=" + edad + ", peso=" + peso + ", medida=" + medida + '}';
    }
    
}
