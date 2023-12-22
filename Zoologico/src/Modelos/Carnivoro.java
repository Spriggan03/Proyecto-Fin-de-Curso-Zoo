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
public class Carnivoro extends Mamifero {

    private double pesoPromedioCarne;

    // Constructor
    public Carnivoro(double pesoPromedioCarne, String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima, int duracionGestacion, String colorPelos) {
        super(nombre, cantidadAnimales, cantidadHembras, pesoMaximo, mesApareamiento, edadMaxima, duracionGestacion, colorPelos);
        this.pesoPromedioCarne = pesoPromedioCarne;
    }

   

    // Getter y setter específicos de Carnivoro
    public double getPesoPromedioCarne() {
        return pesoPromedioCarne;
    }

    public void setPesoPromedioCarne(double pesoPromedioCarne) {
        this.pesoPromedioCarne = pesoPromedioCarne;
    }

    @Override
    public void metodoAbstracto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
