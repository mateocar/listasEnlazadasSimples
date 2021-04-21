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
public class Nodo {
    private Integer dato;
    private Nodo Siguiente;
   

    public Nodo() {
        this.dato = null ; 
        this.Siguiente = null;
      
    }

    public Nodo(Integer dato, Nodo Siguiente) {
        this.dato = dato;
        this.Siguiente = Siguiente;
        
    }

    public Nodo(Integer dato) {
        this.dato = dato;
        this.Siguiente = null;
    }

    public Integer getDato() {
        return dato;
    }

    public void setDato(Integer dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }
    
        
    
    
}
