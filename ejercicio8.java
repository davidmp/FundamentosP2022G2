import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        //2.23
        //DEFINIR VARIABLES
        double n, s;
        try (//DATOS DE ENTRADA
        Scanner lt = new Scanner(System.in)) {
            System.out.println("Ingrese el valor n: ");
            n=lt.nextDouble();
        }
        //PROCESO
        s = n*(n+1);
        //DATOS DE SALIDA
        System.out.print("La suma de los n numeros pares es: " +s);
    }
}