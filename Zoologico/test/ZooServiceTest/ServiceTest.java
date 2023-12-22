package ZooServiceTest;

import Modelos.Ave;
import Modelos.Especie;
import Services.ZooService;
import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;

public class ServiceTest {

    @Test
    public void getColorCaracteristicoEspecieTest() {

//             Arrange (preparacion)
        ZooService zoo = new ZooService(new ArrayList<>());

        String colorEsperado = ("rojo");

        String nombreEspecie = ("loro");

        Ave a4 = new Ave(2, null, true, null, 2, 2, null, 2, 2, 2, 2, 2);

        //Act (ACCION)
        a4.setNombre("loro");

        a4.setColorPlumas("rojo");

        zoo.getColorCaracteristicoEspecie(nombreEspecie);

        // Assert(Prueba)     
        assertEquals(colorEsperado, ("rojo"));
    }
   @Test
    public void nAparearseFacilmenteTest() {
//                    Arrange (preparacion)
        ZooService zoo = new ZooService(new ArrayList<>());

        int mes = 2;

        int dia = 1;

        Ave a5 = new Ave(2, null, true, null, 2, 2, null, 2, 2, 2, 2, 2);

        //Act (ACCION)
        boolean resultado = zoo.especiesPuedenAparearseFacilmente(a5, dia, mes);

        // Assert(Prueba)  
        assertTrue(resultado);
        
        }

}
