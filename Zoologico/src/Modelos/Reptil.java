package Modelos;

public class Reptil extends Especie {

    private double largoMaximo;
    private String colorPiel;
    private boolean tienePatas;
    private String colorHuevos;
    private double diametroAproximado;
    private int tiempoNacer;

    // Constructor
    public Reptil(double largoMaximo, String colorPiel, boolean tienePatas, String colorHuevos, double diametroAproximado, int tiempoNacer, String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima) {
        super(nombre, cantidadAnimales, cantidadHembras, pesoMaximo, mesApareamiento, edadMaxima);
        this.largoMaximo = largoMaximo;
        this.colorPiel = colorPiel;
        this.tienePatas = tienePatas;
        this.colorHuevos = colorHuevos;
        this.diametroAproximado = diametroAproximado;
        this.tiempoNacer = tiempoNacer;
    }

    // Getters y setters específicos de Reptil
    public String getColorHuevos() {
        return colorHuevos;
    }

    public void setColorHuevos(String colorHuevos) {
        this.colorHuevos = colorHuevos;
    }

    public double getDiametroAproximado() {
        return diametroAproximado;
    }

    public void setDiametroAproximado(double diametroAproximado) {
        this.diametroAproximado = diametroAproximado;
    }

    public int getTiempoNacer() {
        return tiempoNacer;
    }

    public void setTiempoNacer(int tiempoNacer) {
        this.tiempoNacer = tiempoNacer;
    }

    public double getLargoMaximo() {
        return largoMaximo;
    }

    public void setLargoMaximo(double largoMaximo) {
        this.largoMaximo = largoMaximo;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean tienePatas() {
        return tienePatas;
    }

    public void setTienePatas(boolean tienePatas) {
        this.tienePatas = tienePatas;
    }

    @Override
    public String getColorCaracteristico() {
        return this.getColorPiel();
    }
}
