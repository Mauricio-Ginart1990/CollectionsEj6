package Servicio;

import Entidades.Mercaderia;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    public Mercaderia Ingresarproductos() {
        Mercaderia M1 = new Mercaderia();
        String res = "";
                    
            System.out.println("Ingrese el nombre del producto");
            M1.setProducto(leer.next());
            System.out.println("Ingrese el precio del producto");
            M1.setPrecio(leer.nextDouble());
            
           
            return M1;
       
        
    }
    public void mostrarproductos( HashMap<String, Double> produc){
        for (Map.Entry<String, Double> aux : produc.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            System.out.println(aux.getKey()  +  "     $"+ aux.getValue());
        }
    }
    public void eliminarproducto(HashMap<String, Double> produc){
        System.out.println("Que producto quiere eliminar ? ");
        String eliminar = leer.next();

        produc.remove(eliminar);
        for (Map.Entry<String, Double> aux : produc.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            System.out.println(aux.getKey()  +  "     $"+ aux.getValue());
        }
        }
public void modificarprecio(HashMap<String, Double> produc){
    

     System.out.println("Que producto desea modificar ? ");
        String produto = leer.next();
      System.out.println("Ingrese el nuevo precio");
      Double modificar=leer.nextDouble();
      produc.replace(produto, modificar);
        
        for (Map.Entry<String, Double> aux : produc.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            System.out.println(aux.getKey()  +  "     $"+ aux.getValue());
        
}
}
}