import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Variables==========================================
        Scanner LecturaTeclado = new Scanner(System.in);
        Coche CocheA = new Coche();
        //===================================================

        //Desarrollo main
        System.out.println("Buenos días, vamos a proceder a registrar su coche: \n");

        System.out.println("¿Cual es el modelo de su coche?");
        CocheA.SetNameCoche(LecturaTeclado.next());

        System.out.println("¿Cual es el precio de su coche?");
        CocheA.SetPrecioCoche(LecturaTeclado.nextFloat());

        System.out.println("¿Cuantas puertas tiene su coche?");
        CocheA.SetPuertasCoche(LecturaTeclado.nextInt());


        System.out.println("Coche Registrado con las siguientes características: \n  Nombre " + CocheA.GetNameCoche() + "\n  Precio " + CocheA.GetPrecioCoche() + "\n  Numero de Puertas " +  CocheA.GetPuertasCoche());



    }//main
}//class Main

