/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Modelos.Ave;
import Modelos.Carnivoro;
import Modelos.Especie;
import Modelos.Herbivoro;
import Modelos.Mamifero;
import Modelos.MamiferoMonotrema;
import Modelos.Reptil;
import java.util.List;

/**
 *
 * @author Angel
 */
public interface IZooService {

    public boolean agregarNuevaEspecie(Especie nuevaEspecie);

    public Ave agregarNuevaAve(double estaturaMaxima, String colorPlumas, boolean puedeVolar, String colorHuevos, double diametroAproximado, int tiempoNacer, String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima);

    public Reptil agregarNuevoReptil(double largoMaximo, String colorPiel, boolean tienePatas, String colorHuevos, double diametroAproximado, int tiempoNacer, String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima);

    public Carnivoro agregarNuevoCarnivoro(String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima, int duracionGestacion, String colorPelos, double pesoPromedioCarne);

    public Herbivoro agregarNuevoHerbivoro(String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima, int duracionGestacion, String colorPelos, double volumenPromedioConsumo);

    public MamiferoMonotrema agregarNuevoMamiferoMonotrema(String colorHuevos, double diametroAproximado, String colorPelos, int tiempoNacer, String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima);

    public boolean actualizarEspecie(String nombreEspecie, Especie nuevosDatos);

    public boolean incrementarCantidadAnimales(String nombreEspecie, int cantidadIncremento);

    public boolean decrementarCantidadAnimales(String nombreEspecie, int cantidadDecremento);

    public String mostrarEstadoEspecies(String grupoEspecie);

    public List<Mamifero> mostrarMamiferosOrdenadosPorGestacion();

    //Valorar Monotrema//
    public double mostrarCantidadYPorcentajeGrupo(String grupoEspecie);

    public List<Especie> mostrarTop10EspeciesMasPesadas();

    public List<String> obtenerReptilYAveExtremos();

    public List<String> obtenerMamiferosExtremosConsumo();

    public List<String> obtenerReptilesYAvesExtremosHuevos();

    String mostrarTop10EspeciesMasLongevas();

    //Valorar Monotrema
    public String mostrarEspeciesApareamientoFacil(int dia, int mes);

    public boolean especiesPuedenAparearseFacilmente(Especie especie, int dia, int mes);

    public String getColorCaracteristicoEspecie(String nombreEspecie);

}
