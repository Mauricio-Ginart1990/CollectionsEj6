
package Main;

import Entidades.Mercaderia;
import Servicio.Servicio;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<String, Double> produc = new HashMap();
        Servicio S1 = new Servicio();
        Mercaderia m1 ;
       String res = "";
        do {            
           m1=S1.Ingresarproductos();
          produc.put(m1.getProducto(),m1.getPrecio());
            System.out.println("Desea ingresar un nuevo producto");
            res =leer.next();
        } while (res.equalsIgnoreCase("si"));
        System.out.println("===========================");
        System.out.println("La Lista de Productos es :");
        S1.mostrarproductos(produc); 
       System.out.println("===========================");
        System.out.println("Ingrese el Producto a modificar");
        S1.modificarprecio(produc);
        System.out.println("===========================");
        S1.eliminarproducto(produc);
        System.out.println("===========================");
        System.out.println("Los Productos restantes son :");
      S1.mostrarproductos(produc);
        }
    }
    
  

