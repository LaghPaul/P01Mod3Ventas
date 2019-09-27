package modelos;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class TestListar {

    public TestListar() {
    }
    
    @Test
    public void testListar(){
        System.out.println("Listar");
        ColeccionVentas intance = new ColeccionVentas();
        ArrayList<Venta> esperado = new ArrayList<Venta>();
        ArrayList<Venta> obtenido = intance.Listar();
        Assert.assertEquals(esperado, obtenido);
    }
}
