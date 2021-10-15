/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Homero
 */
public class Pato {

    private String nombrePato;
    private int edadPato;
    private String razaPato;
    private String especiePato;
    private double pesoPato;
    private String tamanoPato;

    public Pato() {
    }

    public Pato(String nombrePato, int edadPato, String razaPato, String especiePato, double pesoPato, String tamanoPato) {
        this.nombrePato = nombrePato;
        this.edadPato = edadPato;
        this.razaPato = razaPato;
        this.especiePato = especiePato;
        this.pesoPato = pesoPato;
        this.tamanoPato = tamanoPato;
    }

    public String getNombrePato() {
        return nombrePato;
    }

    public void setNombrePato(String nombrePato) {
        this.nombrePato = nombrePato;
    }

    public int getEdadPato() {
        return edadPato;
    }

    public void setEdadPato(int edadPato) {
        this.edadPato = edadPato;
    }

    public String getRazaPato() {
        return razaPato;
    }

    public void setRazaPato(String razaPato) {
        this.razaPato = razaPato;
    }

    public String getEspeciePato() {
        return especiePato;
    }

    public void setEspeciePato(String especiePato) {
        this.especiePato = especiePato;
    }

    public double getPesoPato() {
        return pesoPato;
    }

    public void setPesoPato(double pesoPato) {
        this.pesoPato = pesoPato;
    }

    public String getTamanoPato() {
        return tamanoPato;
    }

    public void setTamanoPato(String tamanoPato) {
        this.tamanoPato = tamanoPato;
    }

    @Override
    public String toString() {
        return "Pato{"
                + "nombrePato : " + nombrePato
                + ", edadPato=" + edadPato
                + ", razaPato=" + razaPato
                + ", especiePato=" + especiePato
                + ", pesoPato=" + pesoPato
                + ", tamanoPato=" + tamanoPato;
    }
}
