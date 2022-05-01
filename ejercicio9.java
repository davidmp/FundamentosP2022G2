import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        //2.21

        //DEFINIR VARIABLES
        double mv=1609, m, k;
        try (//DATOS DE ENTRADA
        Scanner lt = new Scanner(System.in)) {
            System.out.println("Ingrese la cantidad en m: ");
            m=lt.nextDouble();
        }
        //PROCESO
        k=m*mv;
        
        //DATOS DE SALIDA
        System.out.print("La cantidad en kilometros es: "+k);
    }
}