package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestAgregar {

    public TestAgregar() {
    }
    
    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Venta libro= new Venta("v001", 1000, 4);
        ColeccionVentas instancia = new ColeccionVentas();
        boolean esperado=true;
        boolean obtenido = instancia.Agregar(libro);
        Assert.assertEquals(esperado, obtenido);
    }
}
