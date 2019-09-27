package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {

    public TestEliminar() {
    }
    
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String codigo="v001";
        Venta venta= new Venta("v001", 1000, 2);
        ColeccionVentas instancia = new ColeccionVentas();
        instancia.Agregar(venta);
        boolean esperado=true;
        boolean obtenido = instancia.Eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);
    }
}
