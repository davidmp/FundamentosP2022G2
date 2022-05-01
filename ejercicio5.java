import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class ejercicio5 {
    public static void main(String[] args) {
        //2.20
        //DEFINIR VARIABLES
        double b1, b2, a, h;
        try ( //DATOS DE ENTRADA
		Scanner lt = new Scanner(System.in)) {
			System.out.println("Ingrese la altura h: ");
			h =lt.nextDouble();
			System.out.println("Ingrese el lado b1: ");
			b1 =lt.nextDouble();
			System.out.println("Ingrese la altura b2: ");
			b2 =lt.nextDouble();
		}
        //PROCESO
        a = b1*b2*h/2; 
        //DATOS DE SALIDA
        System.out.print("El area del trapecio es: " + a );
    }
}