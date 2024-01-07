package ZooServiceTest;

import Modelos.Ave;
import Modelos.Especie;
import Modelos.Reptil;
import Services.ZooService;
import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ServiceTest {

    @Test
    public void getColorCaracteristicoEspecieTest() {

//             Arrange (preparacion)
        ZooService zoo = new ZooService(new ArrayList<>());

        String colorEsperado = ("rojo");

        String nombreEspecie = ("loro");

        zoo.agregarNuevaAve(2,"rojo", true, null, 2, 2,"loro", 2, 2, 2, 2, 2);

        //Act (ACCION)
      
        String expResult = zoo.getColorCaracteristicoEspecie(nombreEspecie);

        // Assert(Prueba)     
        assertEquals(colorEsperado,expResult);
    }
  
    
    
    
    @Test
    public void nAparearseFacilmenteTest() {
                    
//                Arrange (preparacion)
        ZooService zoo = new ZooService(new ArrayList<>());

        int mes = 2;

        int dia = 1;

        Ave a5 = new Ave(1, null, true, null, 1, 1, null, 1, 1, 1, 1, 1);
        
        a5.setMesApareamiento(2);
        
            //Act (ACCION)
        boolean resultado = zoo.especiesPuedenAparearseFacilmente(a5, dia, mes);

        // Assert(Prueba)  
        assertTrue(resultado);
}

    @Test
    public void agergarNuevaEspecieTest() {
        // Arrange (Preparación)
        ZooService zoo = new ZooService(new ArrayList<>());

        Reptil r1 = new Reptil(0, null, true, null, 0, 0, "Pepito", 0, 0, 0, 0, 0);

        //         Act (Acción)
        boolean result = zoo.agregarNuevaEspecie(r1);

        // Assert (Verificación)
        assertTrue(result);

    }

}