import java.util.Scanner;

public class ejercicio4 {
    private static Scanner sn;
    public static void main(String[] args) {
        //DEFINIR VARIABLES
        double suma = 0, termino;
        //DATOS DE ENTRADA
        sn = new Scanner(System.in);
        System.out.println("ingrese el termino n");
        termino = sn.nextInt();
        //PROCESO
        suma = 2 * (termino + 1);
        //DATOS DE SALIDA
        System.out.println("la suma es:" + suma);        
    }
    
}
