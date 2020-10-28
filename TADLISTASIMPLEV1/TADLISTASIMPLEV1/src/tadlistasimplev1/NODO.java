
package tadlistasimplev1;

public class NODO {
    int dato;
    NODO siguiente;

    public NODO(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NODO getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NODO siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
