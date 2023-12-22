package Modelos;

public abstract class Mamifero extends Especie {

   protected int duracionGestacion;
   protected String colorPelos;

    // Constructor
    public Mamifero(String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima, int duracionGestacion, String colorPelos) {
        super(nombre, cantidadAnimales, cantidadHembras, pesoMaximo, mesApareamiento, edadMaxima);
        this.duracionGestacion = duracionGestacion;
        this.colorPelos = colorPelos;
    }

    // Getters y setters específicos de Mamifero
    public int getDuracionGestacion() {
        return duracionGestacion;
    }

    public void setDuracionGestacion(int duracionGestacion) {
        this.duracionGestacion = duracionGestacion;
    }

    public String getColorPelos() {
        return colorPelos;
    }

    public void setColorPelos(String colorPelos) {
        this.colorPelos = colorPelos;
    }

    @Override
    public String getColorCaracteristico() {
        return this.getColorPelos();
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void metodoAbstracto();
}
