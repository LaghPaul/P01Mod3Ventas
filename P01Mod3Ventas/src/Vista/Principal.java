package Vista;

import java.util.ArrayList;
import modelos.ColeccionVentas;
import modelos.Venta;

public class Principal {
     public static void main(String[] args) {
        ColeccionVentas lista = new ColeccionVentas();
        Venta venta;
        String codigo;
        
        venta= new Venta("v001", 1000, 2);
        lista.Agregar(venta);
        venta= new Venta("v002", 2000, 3);
        lista.Agregar(venta);
       
        
        ListarVentas(lista.Listar());
        System.out.println("***********************************");
        
        lista.subTotal("v002");
        System.out.println("***********************************");
    }

    public static void ListarVentas(ArrayList<Venta> lista) {
        for (Venta obj : lista) {
            System.out.println("Código: " + obj.getCodigo());
            System.out.println("Precio: " + obj.getPrecio());
            System.out.println("Cantidad: " + obj.getCantidad());
            System.out.println("-----------------------------------");
        }
    }
}
