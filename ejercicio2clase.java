import java.util.Scanner;

public class ejercicio2clase {
    public static void main(String[] args) {
        //2.6
        //DEFINIR VARIABLES
        double c, a, b;
        try (//DATOS DE ENTRADA
        Scanner lt = new Scanner(System.in)) {
            System.out.println("Ingrese el lado a: ");
            a=lt.nextDouble();
            System.out.println("Ingrese ell lado b: ");
            b=lt.nextDouble();
        }
        //PROCESO
        c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        //DATOS DE SALIDA
        System.out.print("La hipotenusa es: "+c);
    }
}