package tadlistasimplev1;

public class LISTASIMPLE implements ILISTASIMPLE {

    NODO inicio;
    NODO ultimo;

    public NODO getUltimo() {
        return ultimo;
    }

    public void setUltimo(NODO ultimo) {
        this.ultimo = ultimo;
    }

    public LISTASIMPLE() {
        this.inicio = null;
        this.ultimo= null;
    }

    public NODO getInicio() {
        return inicio;
    }

    public void setInicio(NODO inicio) {
        this.inicio = inicio;
    }

    @Override
    public boolean esVacia() {
        return this.inicio == null;
    }

    @Override
    public void agregarInicio(int n) {
        NODO nuevo = new NODO(n);
        if (this.esVacia()) {
            this.setInicio(nuevo);
            this.setUltimo(nuevo);
        } else {
            nuevo.setSiguiente(this.inicio);
            this.setInicio(nuevo);
        }
    }

    @Override
    public void borrarInicio() {
        if (!this.esVacia()){
            if (this.getInicio()==this.getUltimo()){
                this.setInicio(null);
                this.setUltimo(null);
            }else
                this.setInicio(this.inicio.getSiguiente());
        }
   
    }

    @Override
    public void vaciar() {
        this.setInicio(null);
        this.setUltimo(null);
    }

    @Override
    public void mostrar() {
         
        if (this.esVacia()) {
            System.out.println("La lista esta vacia ");
        } else {
           NODO aux = this.inicio;
            while (aux != null) {
                System.out.print(aux.getDato() + " - ");
                aux = aux.getSiguiente();
            }
        }
    }

// debemos mejorar este metodo para no recorrer la lista agregamos referencia al ultimo
    @Override
//    public void agregarFinal(int n) {
//          NODO nuevo = new NODO(n);
//        if (this.esVacia())
//            this.setInicio(nuevo);
//        else{
//            NODO aux = this.inicio;
//            while (aux.getSiguiente()!=null)
//                aux=aux.getSiguiente();
//            aux.setSiguiente(nuevo);
//        }           
//    }
    public void agregarFinal(int n) {
        NODO nuevo = new NODO(n);
        if (this.esVacia()){
            this.setInicio(nuevo);
            this.setUltimo(nuevo);
        }
        else{
            this.ultimo.setSiguiente(nuevo);
            this.setUltimo(nuevo);
        }
            
    }    

    @Override
    public void borrarFin() {
        if (!this.esVacia()){
            if (this.inicio == this.ultimo){
                this.setInicio(null);
                this.setUltimo(null);
            }
            else{
            NODO aux = this.inicio;
            while (aux.getSiguiente()!=this.ultimo)
                 aux=aux.getSiguiente();
            
            aux.setSiguiente(null);
            this.setUltimo(aux);
            }
            
        }

    }

}
