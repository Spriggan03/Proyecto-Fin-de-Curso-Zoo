package Modelos;

public class Ave extends Especie implements IComportamientoAve {

    private double estaturaMaxima;
    private String colorPlumas;
    private boolean puedeVolar;
    private String colorHuevos;
    private double diametroAproximado;
    private int tiempoNacer;

    // Constructor
    public Ave(double estaturaMaxima, String colorPlumas, boolean puedeVolar, String colorHuevos, double diametroAproximado, int tiempoNacer, String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima) {
        super(nombre, cantidadAnimales, cantidadHembras, pesoMaximo, mesApareamiento, edadMaxima);
        this.estaturaMaxima = estaturaMaxima;
        this.colorPlumas = colorPlumas;
        this.puedeVolar = puedeVolar;
        this.colorHuevos = colorHuevos;
        this.diametroAproximado = diametroAproximado;
        this.tiempoNacer = tiempoNacer;
    }

    // Getters y setters específicos de Ave
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

    public double getEstaturaMaxima() {
        return estaturaMaxima;
    }

    public void setEstaturaMaxima(double estaturaMaxima) {
        this.estaturaMaxima = estaturaMaxima;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public boolean puedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    @Override
    public String getColorCaracteristico() {
        return this.getColorPlumas();
    }

}
