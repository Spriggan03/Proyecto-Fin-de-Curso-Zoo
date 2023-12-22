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
public class Herbivoro extends Mamifero {

    protected double volumenPromedioConsumo;

    // Constructor
    public Herbivoro(double volumenPromedioConsumo, String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima, int duracionGestacion, String colorPelos) {
        super(nombre, cantidadAnimales, cantidadHembras, pesoMaximo, mesApareamiento, edadMaxima, duracionGestacion, colorPelos);
        this.volumenPromedioConsumo = volumenPromedioConsumo;
    }


    // Getter y setter específicos de Herbivoro
    public double getVolumenPromedioConsumo() {
        return volumenPromedioConsumo;
    }

    public void setVolumenPromedioConsumo(double volumenPromedioConsumo) {
        this.volumenPromedioConsumo = volumenPromedioConsumo;
    }

    @Override
    public void metodoAbstracto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
