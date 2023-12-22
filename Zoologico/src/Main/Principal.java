/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Modelos.Carnivoro;
import Modelos.Especie;
import Modelos.Mamifero;
import Services.ContenedorIoC;
import Services.IZooService;
import Services.MiContenedorIoC;
import Services.ZooService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angel
 */
public class Principal {

    public static void main(String[] args) {
        // Crear una lista de especies (puedes cargarla desde alguna fuente de datos)
        List<Especie> especies = new ArrayList<>();

        // Crear una instancia del contenedor IoC y pasarle la lista de especies
        ContenedorIoC contenedorIoC = new MiContenedorIoC(especies);

        // Obtener instancias de las clases que necesitan dependencias
        IZooService servicioZoo = contenedorIoC.obtenerInstancia(ZooService.class);

        // Ahora puedes utilizar el servicioZoo y sus métodos
       // servicioZoo.agregarNuevaEspecie(new Especie() {

    
       // servicioZoo.agregarNuevaAve(45, "verde", true, "rojo", 75, 12, "Tocororo Macho", 4, 2, 45, 12, 100);
       // servicioZoo.agregarNuevoCarnivoro("Paco", 5, 3, 51.0, 6, 6, 4, "Gris", 65.0); 
        //servicioZoo.agregarNuevoHerbivoro("Renier", 6, 2, 50.0, 4, 6, 5, "Azul", 54.0);
      
        //servicioZoo.mostrarTop10EspeciesMasPesadas();
       // servicioZoo.getColorCaracteristicoEspecie("Tocororo Macho");
        //servicioZoo.decrementarCantidadAnimales("Ave", 2);
        
       
        
// ... y así sucesivamente


    
    }
}
