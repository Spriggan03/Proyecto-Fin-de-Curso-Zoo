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
public class MamiferoMonotrema extends Especie implements IComportamientoAve, IComportamientoMamifero {

    
    private String colorHuevos;
    private double diametroAproximado;
    private int tiempoNacer;
    private String colorPelos;

    public MamiferoMonotrema(String colorHuevos, double diametroAproximado, int tiempoNacer, String colorPelos, String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima) {
        super(nombre, cantidadAnimales, cantidadHembras, pesoMaximo, mesApareamiento, edadMaxima);
        
        this.colorHuevos = colorHuevos;
        this.diametroAproximado = diametroAproximado;
        this.tiempoNacer = tiempoNacer;
        this.colorPelos = colorPelos;
    }

    @Override
    public String getColorCaracteristico() {
        return getColorPelos();
    }

 
    @Override
    public String getColorHuevos() {
        return colorHuevos;
    }

    @Override
    public double getDiametroAproximado() {
        return diametroAproximado;
    }

    @Override
    public int getTiempoNacer() {
        return tiempoNacer;
    }

    @Override
    public String getColorPelos() {
        return colorPelos;
    }

    @Override
    public void setColorPelos(String colorPelos) {
        this.colorPelos = colorPelos;
    }

}
