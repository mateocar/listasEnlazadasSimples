/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasEnlazadas;

/**
 *
 * @author mateo
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ListaEnlazada Lista= new ListaEnlazada();
       
       Lista.Recorrer();
       Lista.AgregarCabeza(0);
       Lista.Recorrer();
       Lista.AgregarCabeza(-1);
       Lista.Recorrer();
        System.out.println(Lista.Localizar(0));
        System.out.println(Lista.Ultimo());
        Lista.AgregarUltimo(1);
        Lista.Recorrer();
         Lista.AgregarUltimo(2);
        Lista.Recorrer();
       System.out.println(Lista.Localizar(2));
        System.out.println(Lista.Ultimo());
       Lista.agregarPosicion(2, 7);
        Lista.Recorrer();
        Lista.suprimirPorPosicion(5);
        Lista.Recorrer();
    }
    
}
