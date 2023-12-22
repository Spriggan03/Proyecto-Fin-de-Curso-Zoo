/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Modelos.Especie;
import java.util.List;

/**
 *
 * @author Angel
 */
public class MiContenedorIoC implements ContenedorIoC {

    private List<Especie> especies;

    public MiContenedorIoC(List<Especie> especies) {
        this.especies = especies;
    }

    @Override
    public <T> T obtenerInstancia(Class<T> tipoClase) {
        try {

            return tipoClase.getDeclaredConstructor(List.class).newInstance(especies);
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener instancia de " + tipoClase, e);
        }
    }
}
