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
public class ListaEnlazada {

    private Nodo Cabeza;
    //private int tamano;

    public ListaEnlazada(Nodo Cabeza, int tamano) {
        this.Cabeza = Cabeza;
        // this.tamano=tamano;
    }

    public ListaEnlazada() {
        this.Cabeza = null;
        //this.tamano=0;
    }

    public Nodo getCabeza() {
        return Cabeza;
    }

    public void setCabeza(Nodo Cabeza) {
        this.Cabeza = Cabeza;
    }

    //public int getTamano() {
    // return tamano;
    // }
    //public void setTamano(int tamano) {
    //  this.tamano = tamano;
    // }
    public boolean isVacia() {
        return Cabeza == null;
    }

    public void anular() {
        Cabeza = null;

    }

    public void AgregarCabeza(Integer dato) {
        Nodo nuevo = new Nodo(dato);
        if (isVacia()) {
            Cabeza = nuevo;
        } else {
            nuevo.setSiguiente(Cabeza);
            Cabeza = nuevo;
        }
        // tamano++;
    }

    public void Recorrer() {
        Nodo actual = Cabeza;
        while (actual != null) {
            System.out.print(actual.getDato() + " ---->");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }

    public Nodo Localizar(Integer dato) {
        Nodo actual = Cabeza;
        Nodo buscar = null;
        if (!isVacia()) {
            while (actual.getDato() != dato && actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            if (actual.getDato() == dato) {
                buscar = actual;
            }
        }
        return buscar;
    }

    public Nodo Ultimo() {
        Nodo actual = Cabeza;
        Nodo Ultimo = null;
        if (!isVacia()) {
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            if (actual.getSiguiente() == null) {
                Ultimo = actual;
            }
        }
        return Ultimo;
    }

    public void AgregarUltimo(Integer dato) {
        Nodo nuevo = new Nodo(dato);

        if (isVacia()) {
            Cabeza = nuevo;
        } else {
            Nodo actual = Cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            if (actual.getSiguiente() == null) {
                actual.setSiguiente(nuevo);
            }
        }
        // tamano++;  
    }

    public void agregarPosicion(int pos, Integer dato) {
        Nodo nuevo = new Nodo(dato);
        Nodo actual = Cabeza;
        Nodo anterior = null;
        int contador = 1;
        if (isVacia()) {
            Cabeza = nuevo;
        } else {
            while (actual.getSiguiente() != null) {
                anterior = actual;
                actual = actual.getSiguiente();
                contador++;
                if (pos == 1) {
                    AgregarCabeza(dato);
                    break;
                } else if (contador == pos && actual.getSiguiente() != null) {
                    nuevo.setSiguiente(actual);
                    anterior.setSiguiente(nuevo);
                } else if (contador == pos && actual.getSiguiente() == null) {
                    nuevo.setSiguiente(actual);
                    anterior.setSiguiente(nuevo);
                } else if (pos > contador) {
                    AgregarUltimo(dato);
                    break;
                }

            }

        }

    }

    public void suprimirCabeza() {
        if (!isVacia()) {
            Cabeza = Cabeza.getSiguiente();
        }
    }

    public void suprimirUltimo() {
        if (Cabeza != null) {
            Nodo actual = Cabeza;
            Nodo anterior = null;
            while (actual.getSiguiente() != null) {
                anterior = actual;
                actual = actual.getSiguiente();
            }
            actual = anterior;
            actual.setSiguiente(null);
        }
    }

    public void suprimirPorPosicion(int pos) {
        if (Cabeza != null) {
            Nodo actual = Cabeza;
            Nodo anterior = null;
            int contador = 1;
            while (actual.getSiguiente() != null) {
                anterior = actual;
                actual = actual.getSiguiente();
                contador++;
                if(pos==1){
                suprimirCabeza();              
                }else if(contador==pos && actual.getSiguiente()!=null){
                anterior.setSiguiente(actual.getSiguiente());
                }else if (contador==pos && actual.getSiguiente()==null){
                suprimirUltimo();
                }
            }
        }

    }

}
