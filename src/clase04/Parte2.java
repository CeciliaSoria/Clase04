/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04;

public class Parte2{
    public Parte2 (String parametro){
            System.out.println(parametro);
    }
    public static void main (String[] args) {
        new Parte2 ("Hola");
        //new Parte2();
        
        class ClaseInternaDentroDeMetodo{
        int atributo1;
        int atributo2;
        //InnerClass o static class
        
    }
    }
    class ClaseInternaFueraDeMetodo{
        int atributo1;
        int atributo2;
        //NestedClass
    }
}
