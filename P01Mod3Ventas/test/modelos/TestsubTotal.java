package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestsubTotal {

    public TestsubTotal() {
    }

    @Test
    public void TestsubTotal() {
        System.out.println("subTotal");
        Venta venta = new Venta("v001", 1000, 4);
        ColeccionVentas instancia = new ColeccionVentas();
        instancia.Agregar(venta);
        boolean esperado = true;
        String codigo="v001";
        boolean obtenido = instancia.subTotal(codigo);
        Assert.assertEquals(esperado, obtenido);
    }
}
