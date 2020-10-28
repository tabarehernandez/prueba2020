package tadlistasimplev1;

public class TADLISTASIMPLEV1 {

    public static void main(String[] args) {
        // TODO code application logic here
        LISTASIMPLE milista = new LISTASIMPLE();
        System.out.print("Es vacia = " + milista.esVacia());
        System.out.println();
        milista.agregarInicio(22);
        milista.agregarInicio(23);
        milista.agregarInicio(24);
        milista.agregarInicio(25);

        milista.mostrar();
        System.out.println();
        System.out.print("Es vacia = " + milista.esVacia());
        System.out.println();
        System.out.println("borramos el primer elemento ");
        milista.borrarInicio();
        milista.mostrar();
        System.out.println();

//        milista.vaciar();
        System.out.println();
        System.out.print("Es vacia = " + milista.esVacia());
        System.out.println();
        milista.mostrar();
        System.out.println();

        milista.agregarFinal(40);
        milista.agregarFinal(50);
        
        
        
        System.out.println();
        milista.mostrar();
        System.out.println();
        
        milista.borrarFin();
        System.out.println();
        milista.mostrar();
        System.out.println();
        
    }

}
