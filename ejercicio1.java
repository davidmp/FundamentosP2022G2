import java.util.Scanner;
public class ejercicio1 {

    public static void main(String[] args) {
        //2.19
        // DEFINIR VARIABLES
        double L, Pi = 3.1416, R;
        try (//DATOS DE ENTRADA
        var lt= new Scanner(System.in)) {
            System.out.println("ingrese el valor del radio: ");
            R = lt.nextDouble();    
        }
        //PROCESO
        L = Pi * Math.pow(R, 2);
        //DATOS DE SALIDA
        System.out.println("la longitud es; " + L);

    }
}