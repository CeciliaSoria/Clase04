
package clase04;

import java.util.ArrayList;
import java.util.List;


public class Clase04 {

   
    public static void main(String[] args) {
        // uso de generics aparecio apartir de java5
        Cliente c1=new Cliente(1,"Andre","Godoy","Lima 222");
        Cliente c2=new Cliente(2,"Jose","Mendez","Peru 333");
        Cliente c3=new Cliente(3,"Pedro","Gallardo","Maipu 444");
        Cliente c4=new Cliente(4,"Juan","Perez","Lavalle 345");
        
        List lista1=new ArrayList();
        lista1.add(c1);
        lista1.add(c2);
        lista1.add(c3);
        lista1.add(c4);
        
        List<Cliente> lista2=new ArrayList();
        lista2.add(c1);
        lista2.add(c2);
        lista2.add(c3);
        lista2.add(c4);
        
        Cliente cliente1=(Cliente)lista1.get(0);
        Cliente cliente2=(lista1.get(0) instanceof Cliente)?(Cliente)lista1.get(0):null;
        Cliente cliente3=lista2.get(0);
        
        //analizar lista de clientes
        List<Cliente> lista=new Cliente().getAll();
        for(Cliente cli:lista) System.out.println(cli);
        System.out.println("------------------------");
        
        lista.forEach(item-> System.out.println(item));
         System.out.println("------------------------");
         lista.forEach(System.out::println);
         lista.forEach(lista2::add);
         
         
         Cliente cliente4=new Cliente().getAll().get(3);
         
        
    }
    
}
