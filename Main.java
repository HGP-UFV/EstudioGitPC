import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Variables==========================================
        Scanner LecturaTeclado = new Scanner(System.in);
        Coche CocheA = new Coche();

        int option;
        //===================================================

        //Desarrollo main
        System.out.println("Buenos días, vamos a proceder a registrar su coche: \n");

        System.out.println("¿Cual es el modelo de su coche?");
        CocheA.SetNameCoche(LecturaTeclado.next());

        System.out.println("¿Cual es el precio de su coche?");
        CocheA.SetPrecioCoche(LecturaTeclado.nextFloat());

        System.out.println("¿Cuantas puertas tiene su coche?");
        CocheA.SetPuertasCoche(LecturaTeclado.nextInt());

        System.out.println("¿Cuantas marchas tiene su coche?");
        CocheA.SetMarchasCoche(LecturaTeclado.nextInt());
        
        //Creamos Menu
        do {
            System.out.println("Bienvenido/a a nuestro concesionario de reventa de coches.\nSeleccione una de las opciones de nuestro menu\n   [1] Registrar Coche Nuevo\n   [2] Ver Catalogo\n   [3] Exit\n\n   [OPCION 1-3]: ");
            option = System.in();
            if(option){

            }
            else{

            }
        }while (option!=3);
        //Finalizamos Menu

        System.out.println("Coche Registrado con las siguientes características: \n  Nombre " + CocheA.GetNameCoche() + "\n  Precio " + CocheA.GetPrecioCoche() + "\n  Numero de Puertas " +  CocheA.GetPuertasCoche() + "\n  Numero de Marchas " +  CocheA.GetMarchasCoche());



    }//main
}//class Main

