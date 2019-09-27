package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    public TestModificar() {
    }
    
    @Test
    public void testModificar(){
        System.out.println("Modificar");
        Venta venta = new Venta("v001", 1000, 2);
        ColeccionVentas instancia = new ColeccionVentas();
        instancia.Agregar(venta);
        boolean esperado=true;
        venta = new Venta("v001", 1000, 3);
        boolean obtenido = instancia.modificar(venta);
        Assert.assertEquals(esperado, obtenido);
    }
}
