/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Angel
 */
public abstract class Especie {

    protected String nombre;
    protected int cantidadAnimales;
    protected int cantidadHembras;
    protected double pesoMaximo;
    protected int mesApareamiento;
    protected int edadMaxima;
    protected int cantMuertos = 0;
    protected int cantTraslado = 0;

    // Constructor
    public Especie(String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima) {
        this.nombre = nombre;
        this.cantidadAnimales = cantidadAnimales;
        this.cantidadHembras = cantidadHembras;
        this.pesoMaximo = pesoMaximo;
        this.mesApareamiento = mesApareamiento;
        this.edadMaxima = edadMaxima;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadAnimales() {
        return cantidadAnimales;
    }

    public void setCantidadAnimales(int cantidadAnimales) {
        this.cantidadAnimales = cantidadAnimales;
    }

    public int getCantidadHembras() {
        return cantidadHembras;
    }

    public void setCantidadHembras(int cantidadHembras) {
        this.cantidadHembras = cantidadHembras;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public int getMesApareamiento() {
        return mesApareamiento;
    }

    public void setMesApareamiento(int mesApareamiento) {
        this.mesApareamiento = mesApareamiento;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public int getCantMuertos() {
        return cantMuertos;
    }

    public void setCantMuertos(int cantMuertos) {
        this.cantMuertos = cantMuertos;
    }

    public int getCantTraslado() {
        return cantTraslado;
    }

    public void setCantTraslado(int cantTraslado) {
        this.cantTraslado = cantTraslado;
    }

    public abstract String getColorCaracteristico();
}
