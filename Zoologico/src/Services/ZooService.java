/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Modelos.Ave;
import Modelos.Carnivoro;
import Modelos.Especie;
import Modelos.Herbivoro;
import Modelos.Mamifero;
import Modelos.Reptil;
import Modelos.MamiferoMonotrema;

public class ZooService implements IZooService {

    private List<Especie> especies;

    public ZooService(List<Especie> especies) {
        this.especies = especies;

    }

    
    @Override
    public boolean agregarNuevaEspecie(Especie nuevaEspecie) {
        
        if (nuevaEspecie instanceof Ave || nuevaEspecie instanceof Carnivoro || nuevaEspecie instanceof Herbivoro || nuevaEspecie instanceof Reptil || nuevaEspecie instanceof MamiferoMonotrema) {
            especies.add(nuevaEspecie);
            System.out.println("Nueva especie agregada: " + nuevaEspecie.getNombre());
            return true;  
        } else {
            System.out.println("Tipo de especie no válido. No se agregó la especie.");
            return false; 
        }

    }

    @Override
    public Ave agregarNuevaAve(double estaturaMaxima, String colorPlumas, boolean puedeVolar, String colorHuevos, double diametroAproximado, int tiempoNacer, String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima) {
        Ave nuevaAve = new Ave(estaturaMaxima, colorPlumas, puedeVolar, colorHuevos, diametroAproximado, tiempoNacer, nombre, cantidadAnimales, cantidadHembras, pesoMaximo, mesApareamiento, edadMaxima);
        agregarNuevaEspecie(nuevaAve);
        return nuevaAve;
    }

    @Override
    public Reptil agregarNuevoReptil(double largoMaximo, String colorPiel, boolean tienePatas, String colorHuevos, double diametroAproximado, int tiempoNacer, String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima) {
        Reptil nuevoReptil = new Reptil(largoMaximo, colorPiel, tienePatas, colorHuevos, diametroAproximado, tiempoNacer, nombre, cantidadAnimales, cantidadHembras, pesoMaximo, mesApareamiento, edadMaxima);
        agregarNuevaEspecie(nuevoReptil);
        return nuevoReptil;
    }

    @Override
    public Carnivoro agregarNuevoCarnivoro(String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima, int duracionGestacion, String colorPelos, double pesoPromedioCarne) {
        Carnivoro nuevoCarnivoro = new Carnivoro(pesoPromedioCarne, nombre, cantidadAnimales, cantidadHembras, pesoMaximo, mesApareamiento, edadMaxima, duracionGestacion, colorPelos);
        agregarNuevaEspecie(nuevoCarnivoro);
        return nuevoCarnivoro;
    }

    @Override
    public Herbivoro agregarNuevoHerbivoro(String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima, int duracionGestacion, String colorPelos, double volumenPromedioConsumo) {
        Herbivoro nuevoHerbivoro = new Herbivoro(volumenPromedioConsumo, nombre, cantidadAnimales, cantidadHembras, pesoMaximo, mesApareamiento, edadMaxima, duracionGestacion, colorPelos);
        agregarNuevaEspecie(nuevoHerbivoro);
        return nuevoHerbivoro;
    }

    @Override
    public MamiferoMonotrema agregarNuevoMamiferoMonotrema(String colorHuevos, double diametroAproximado, String colorPelos, int tiempoNacer, String nombre, int cantidadAnimales, int cantidadHembras, double pesoMaximo, int mesApareamiento, int edadMaxima) {
        MamiferoMonotrema nuevoMamiferoMonotrema = new MamiferoMonotrema(colorHuevos, diametroAproximado, tiempoNacer, colorPelos, nombre, cantidadAnimales, cantidadHembras, pesoMaximo, mesApareamiento, edadMaxima);
        agregarNuevaEspecie(nuevoMamiferoMonotrema);
        return nuevoMamiferoMonotrema;
    }

    @Override
    public boolean actualizarEspecie(String nombreEspecie, Especie nuevosDatos) {
        if (nombreEspecie == null || nuevosDatos == null) {
            
            return false;
        }

        for (Especie especie : especies) {
            if (especie.getNombre().equals(nombreEspecie)) {
               
                especie.setCantidadAnimales(nuevosDatos.getCantidadAnimales());
                especie.setCantidadHembras(nuevosDatos.getCantidadHembras());
                especie.setPesoMaximo(nuevosDatos.getPesoMaximo());
                especie.setMesApareamiento(nuevosDatos.getMesApareamiento());
                especie.setEdadMaxima(nuevosDatos.getEdadMaxima());

               
                if (especie instanceof Carnivoro && nuevosDatos instanceof Carnivoro) {
                    actualizarDatosCarnivoro((Carnivoro) especie, (Carnivoro) nuevosDatos);
                } else if (especie instanceof Herbivoro && nuevosDatos instanceof Herbivoro) {
                    actualizarDatosHerbivoro((Herbivoro) especie, (Herbivoro) nuevosDatos);
                } else if (especie instanceof Reptil && nuevosDatos instanceof Reptil) {
                    actualizarDatosReptil((Reptil) especie, (Reptil) nuevosDatos);
                } else if (especie instanceof Ave && nuevosDatos instanceof Ave) {
                    actualizarDatosAve((Ave) especie, (Ave) nuevosDatos);
                }

                return true;
            }
        }

        
        return false;
    }

    private void actualizarDatosCarnivoro(Carnivoro carnivoro, Carnivoro nuevosDatos) {
        carnivoro.setPesoPromedioCarne(nuevosDatos.getPesoPromedioCarne());
    }

    private void actualizarDatosHerbivoro(Herbivoro herbivoro, Herbivoro nuevosDatos) {
        herbivoro.setVolumenPromedioConsumo(nuevosDatos.getVolumenPromedioConsumo());
    }

    private void actualizarDatosReptil(Reptil reptil, Reptil nuevosDatos) {
        reptil.setLargoMaximo(nuevosDatos.getLargoMaximo());
        reptil.setColorPiel(nuevosDatos.getColorPiel());
        reptil.setTienePatas(nuevosDatos.tienePatas());
    }

    private void actualizarDatosAve(Ave ave, Ave nuevosDatos) {
        ave.setEstaturaMaxima(nuevosDatos.getEstaturaMaxima());
        ave.setColorPlumas(nuevosDatos.getColorPlumas());
        ave.setPuedeVolar(nuevosDatos.puedeVolar());
    }

    @Override
    public boolean incrementarCantidadAnimales(String nombreEspecie, int cantidadIncremento) {
        for (Especie especie : especies) {
            if (especie.getNombre().equals(nombreEspecie)) {
                especie.setCantidadAnimales(especie.getCantidadAnimales() + cantidadIncremento);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean decrementarCantidadAnimales(String nombreEspecie, int cantidadDecremento) {
        for (Especie especie : especies) {
            if (especie.getNombre().equals(nombreEspecie)) {
                if (especie.getCantidadAnimales() <= cantidadDecremento) {
                    especies.remove(especie);
                } else {
                    especie.setCantidadAnimales(especie.getCantidadAnimales() - cantidadDecremento);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String mostrarEstadoEspecies(String grupoEspecie) {
        StringBuilder resultado = new StringBuilder("Estado de las especies en el zoológico:\n");

        for (Especie especie : especies) {
            if (grupoEspecie.equalsIgnoreCase("todos") || especiePerteneceAlGrupo(especie, grupoEspecie)) {
                resultado.append("Especie: ").append(especie.getNombre()).append("\n");
                resultado.append("Cantidad de animales: ").append(especie.getCantidadAnimales()).append("\n");
                resultado.append("--------------------------\n");
            }
        }

        return resultado.toString();
    }

    private boolean especiePerteneceAlGrupo(Especie especie, String grupoEspecie) {
        if (grupoEspecie.equalsIgnoreCase("carnivoro") && especie instanceof Carnivoro) {
            return true;
        } else if (grupoEspecie.equalsIgnoreCase("herbivoro") && especie instanceof Herbivoro) {
            return true;
        } else if (grupoEspecie.equalsIgnoreCase("aves") && especie instanceof Ave) {
            return true;
        } else if (grupoEspecie.equalsIgnoreCase("reptiles") && especie instanceof Reptil) {
            return true;
        } else if (grupoEspecie.equalsIgnoreCase("monotrema") && especie instanceof MamiferoMonotrema) {
            return true;
        }
        return false;
    }

    @Override
    public List<Mamifero> mostrarMamiferosOrdenadosPorGestacion() {
       
        List<Mamifero> mamiferosTemporales = new ArrayList<>();

        
        for (Especie especie : especies) {
            if (especie instanceof Carnivoro || especie instanceof Herbivoro) {
                mamiferosTemporales.add((Mamifero) especie);
            }
        }

        return mamiferosTemporales;
    }

    @Override
    public double mostrarCantidadYPorcentajeGrupo(String grupoEspecie) {
        int cantAnimalesZoo = 0;

        for (Especie e : especies) {
            cantAnimalesZoo += e.getCantidadAnimales();
        }

        for (Especie eBuscar : especies) {
            if (eBuscar.getNombre().equals(grupoEspecie)) {
                cantAnimalesZoo = (eBuscar.getCantidadAnimales() / cantAnimalesZoo) * 100;
                return cantAnimalesZoo;
            }
        }
        return -1;
    }

    @Override
    public List<Especie> mostrarTop10EspeciesMasPesadas() {
       
        Collections.sort(especies, (e1, e2) -> Double.compare(e2.getPesoMaximo(), e1.getPesoMaximo()));
        return especies.subList(0, 9);

    }

    @Override
    public List<String> obtenerReptilYAveExtremos() {
        List<String> extremos = new ArrayList<>();

        Reptil reptilMayor = null;
        Reptil reptilMenor = null;
        Ave aveMayor = null;
        Ave aveMenor = null;

        for (Especie especie : especies) {
            if (especie instanceof Reptil) {
                Reptil reptil = (Reptil) especie;

                if (reptilMayor == null || reptil.getLargoMaximo() > reptilMayor.getLargoMaximo()) {
                    reptilMayor = reptil;
                }

                if (reptilMenor == null || reptil.getLargoMaximo() < reptilMenor.getLargoMaximo()) {
                    reptilMenor = reptil;
                }
            } else if (especie instanceof Ave) {
                Ave ave = (Ave) especie;

                if (aveMayor == null || ave.getEstaturaMaxima() > aveMayor.getEstaturaMaxima()) {
                    aveMayor = ave;
                }

                if (aveMenor == null || ave.getEstaturaMaxima() < aveMenor.getEstaturaMaxima()) {
                    aveMenor = ave;
                }
            }
        }

        extremos.add("Reptil de mayor longitud: " + (reptilMayor != null ? reptilMayor.getNombre() + " - Longitud: " + reptilMayor.getLargoMaximo() : "No hay reptiles"));
        extremos.add("Reptil de menor longitud: " + (reptilMenor != null ? reptilMenor.getNombre() + " - Longitud: " + reptilMenor.getLargoMaximo() : "No hay reptiles"));
        extremos.add("Ave de mayor estatura: " + (aveMayor != null ? aveMayor.getNombre() + " - Estatura: " + aveMayor.getEstaturaMaxima() : "No hay aves"));
        extremos.add("Ave de menor estatura: " + (aveMenor != null ? aveMenor.getNombre() + " - Estatura: " + aveMenor.getEstaturaMaxima() : "No hay aves"));

        return extremos;
    }

    @Override
    public List<String> obtenerMamiferosExtremosConsumo() {
        Carnivoro carnivoroMayorConsumo = null;
        Herbivoro herbivoroMayorConsumo = null;

        for (Especie especie : especies) {
            if (especie instanceof Mamifero) {
                Mamifero mamifero = (Mamifero) especie;

                if (mamifero instanceof Carnivoro) {
                    Carnivoro carnivoro = (Carnivoro) mamifero;

                    if (carnivoroMayorConsumo == null || carnivoro.getPesoPromedioCarne() > carnivoroMayorConsumo.getPesoPromedioCarne()) {
                        carnivoroMayorConsumo = carnivoro;
                    }
                } else if (mamifero instanceof Herbivoro) {
                    Herbivoro herbivoro = (Herbivoro) mamifero;

                    if (herbivoroMayorConsumo == null || herbivoro.getVolumenPromedioConsumo() > herbivoroMayorConsumo.getVolumenPromedioConsumo()) {
                        herbivoroMayorConsumo = herbivoro;
                    }
                }
            }
        }

        List<String> extremosConsumo = new ArrayList<>();

        if (carnivoroMayorConsumo != null) {
            extremosConsumo.add("Carnivoro que más carne consume: " + carnivoroMayorConsumo.getNombre());
            extremosConsumo.add("Peso promedio de carne consumida: " + carnivoroMayorConsumo.getPesoPromedioCarne() + " kg por día");
        } else {
            extremosConsumo.add("No hay mamíferos carnívoros en el zoológico.");
        }

        if (herbivoroMayorConsumo != null) {
            extremosConsumo.add("Herbívoro que más comida consume: " + herbivoroMayorConsumo.getNombre());
            extremosConsumo.add("Volumen promedio de comida consumida: " + herbivoroMayorConsumo.getVolumenPromedioConsumo() + " unidades por día");
        } else {
            extremosConsumo.add("No hay mamíferos herbívoros en el zoológico.");
        }

        return extremosConsumo;
    }

    @Override
    public List<String> obtenerReptilesYAvesExtremosHuevos() {
        Reptil reptilHuevosMasGrandes = null;
        Reptil reptilHuevosMasPequenos = null;
        Ave aveMasGrande = null;
        Ave aveMasPequena = null;

        for (Especie especie : especies) {
            if (especie instanceof Reptil) {
                Reptil reptil = (Reptil) especie;

                if (reptilHuevosMasGrandes == null || reptil.getDiametroAproximado() > reptilHuevosMasGrandes.getDiametroAproximado()) {
                    reptilHuevosMasGrandes = reptil;
                }

                if (reptilHuevosMasPequenos == null || reptil.getDiametroAproximado() < reptilHuevosMasPequenos.getDiametroAproximado()) {
                    reptilHuevosMasPequenos = reptil;
                }
            } else if (especie instanceof Ave) {
                Ave ave = (Ave) especie;

                if (aveMasGrande == null || ave.getDiametroAproximado() > aveMasGrande.getDiametroAproximado()) {
                    aveMasGrande = ave;
                }

                if (aveMasPequena == null || ave.getDiametroAproximado() < aveMasPequena.getDiametroAproximado()) {
                    aveMasPequena = ave;
                }
            }
        }

        List<String> extremosHuevos = new ArrayList<>();

        if (reptilHuevosMasGrandes != null) {
            extremosHuevos.add("Reptil con huevos más grandes: " + reptilHuevosMasGrandes.getNombre());
            extremosHuevos.add("Tamaño de huevos: " + reptilHuevosMasGrandes.getDiametroAproximado());
        } else {
            extremosHuevos.add("No hay reptiles en el zoológico.");
        }

        if (reptilHuevosMasPequenos != null) {
            extremosHuevos.add("Reptil con huevos más pequeños: " + reptilHuevosMasPequenos.getNombre());
            extremosHuevos.add("Tamaño de huevos: " + reptilHuevosMasPequenos.getDiametroAproximado());
        } else {
            extremosHuevos.add("No hay reptiles en el zoológico.");
        }

        if (aveMasGrande != null) {
            extremosHuevos.add("Ave con huevos más grandes: " + aveMasGrande.getNombre());
            extremosHuevos.add("Tamaño de huevos: " + aveMasGrande.getDiametroAproximado());
        } else {
            extremosHuevos.add("No hay aves en el zoológico.");
        }

        if (aveMasPequena != null) {
            extremosHuevos.add("Ave con huevos más pequeños: " + aveMasPequena.getNombre());
            extremosHuevos.add("Tamaño de huevos: " + aveMasPequena.getDiametroAproximado());
        } else {
            extremosHuevos.add("No hay aves en el zoológico.");
        }

        return extremosHuevos;
    }

    @Override
    public String mostrarTop10EspeciesMasLongevas() {
       
        Collections.sort(especies, (e1, e2) -> Integer.compare(e2.getEdadMaxima(), e1.getEdadMaxima()));

        StringBuilder resultado = new StringBuilder("Top 10 de especies más longevas:\n");
        int contador = 0;

        for (Especie especie : especies) {
            if (contador < 10) {
                resultado.append("Especie: ").append(especie.getNombre()).append("\n");
                resultado.append("Edad máxima: ").append(especie.getEdadMaxima()).append(" años\n");
               
                resultado.append("--------------------------\n");
                contador++;
            } else {
                break; 
            }
        }

        return resultado.toString();
    }

    @Override
    public String mostrarEspeciesApareamientoFacil(int dia, int mes) {
        StringBuilder resultado = new StringBuilder("Especies que pueden aparearse fácilmente en el día " + dia + " del mes " + mes + ":\n");

        for (Especie especie : especies) {
            if (especiesPuedenAparearseFacilmente(especie, dia, mes)) {
                resultado.append("- ").append(especie.getNombre()).append("\n");
            }
        }

        return resultado.toString();
    }

    @Override
    public boolean especiesPuedenAparearseFacilmente(Especie especie, int dia, int mes) {
        int mesApareamiento = especie.getMesApareamiento();

        return mes == mesApareamiento;
    }

    @Override
    public String getColorCaracteristicoEspecie(String nombreEspecie) {
        for (Especie especie : especies) {
            if (especie.getNombre().equalsIgnoreCase(nombreEspecie)) {
                return especie.getColorCaracteristico();
            }
        }

        return "Especie no encontrada";
    }

}
